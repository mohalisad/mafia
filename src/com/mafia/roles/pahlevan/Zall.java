package com.mafia.roles.pahlevan;

import com.mafia.actions.ActionBase;
import com.mafia.actions.ActionFeather;
import com.mafia.roles.PersonType;

public class Zall extends PahlevanBase {
    final int TOTAL_FEATHERS = 3;
    int feathersUsed = 0;
    public Zall(String name){
        super(name, PersonType.ZALL);
    }

    @Override
    public ActionBase getAction() {
        return new ActionFeather(this, feathersUsed + 1);
    }

    @Override
    public void actionUsed() {
        feathersUsed++;
    }
}
