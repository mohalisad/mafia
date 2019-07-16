package com.mafia.roles.mostaghel;

import com.mafia.roles.Person;
import com.mafia.roles.PersonFaction;
import com.mafia.roles.PersonType;

public class MostaghelBase extends Person {
    protected MostaghelBase(String name, PersonType type){
        super(name, type, PersonFaction.MOSTAGHEL);
    }
}
