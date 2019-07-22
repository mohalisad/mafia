package com.mafia.roles.pahlevan;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class Gharen extends PahlevanBase {
    public Gharen(String name){
        super(name, PersonType.GHAREN);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
