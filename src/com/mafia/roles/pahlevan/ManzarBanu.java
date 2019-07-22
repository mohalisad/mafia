package com.mafia.roles.pahlevan;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class ManzarBanu extends PahlevanBase {
    public ManzarBanu(String name){
        super(name, PersonType.MANZAR_BANU);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
