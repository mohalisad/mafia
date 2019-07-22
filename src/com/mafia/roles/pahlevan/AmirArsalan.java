package com.mafia.roles.pahlevan;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class AmirArsalan extends PahlevanBase {
    public AmirArsalan(String name){
        super(name, PersonType.AMIR_ARSALAN);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {
        
    }
}
