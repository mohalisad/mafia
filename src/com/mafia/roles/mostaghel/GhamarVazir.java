package com.mafia.roles.mostaghel;

import com.mafia.actions.ActionBase;
import com.mafia.roles.PersonType;

public class GhamarVazir extends MostaghelBase {
    public GhamarVazir(String name){
        super(name, PersonType.GHAMAR_VAZIR);
    }

    @Override
    public ActionBase getAction() {
        return null;
    }

    @Override
    public void actionUsed() {

    }
}
