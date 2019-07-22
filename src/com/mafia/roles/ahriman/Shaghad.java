package com.mafia.roles.ahriman;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class Shaghad extends AhrimanBase {
    public Shaghad(String name){
        super(name, PersonType.SHAGHAD);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
