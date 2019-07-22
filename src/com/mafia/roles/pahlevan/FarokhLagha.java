package com.mafia.roles.pahlevan;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class FarokhLagha extends PahlevanBase {
    public FarokhLagha(String name){
        super(name, PersonType.FAROKH_LAGHA);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
