package com.mafia.roles.ahriman;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class Garsivaz extends AhrimanBase {
    public Garsivaz(String name){
        super(name, PersonType.GARSIVAZ);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
