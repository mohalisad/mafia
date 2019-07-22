package com.mafia.roles.ahriman;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class Kamus extends AhrimanBase {
    public Kamus(String name){
        super(name, PersonType.KAMUS);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
