package com.mafia.roles.pahlevan;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class MalekShapour extends PahlevanBase {
    public MalekShapour(String name){
        super(name, PersonType.MALEK_SHAPOUR);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
