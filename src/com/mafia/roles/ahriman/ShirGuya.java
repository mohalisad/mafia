package com.mafia.roles.ahriman;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class ShirGuya extends AhrimanBase {
    public ShirGuya(String name){
        super(name, PersonType.SHIR_GUYA);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
