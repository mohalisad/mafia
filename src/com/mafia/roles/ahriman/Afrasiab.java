package com.mafia.roles.ahriman;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class Afrasiab extends AhrimanBase {
    public Afrasiab(String name){
        super(name, PersonType.AFRASIAB);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
