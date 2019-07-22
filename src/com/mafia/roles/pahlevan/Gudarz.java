package com.mafia.roles.pahlevan;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class Gudarz extends PahlevanBase {
    public Gudarz(String name){
        super(name, PersonType.GUDARZ);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
