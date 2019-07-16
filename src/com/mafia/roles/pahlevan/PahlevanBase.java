package com.mafia.roles.pahlevan;

import com.mafia.roles.Person;
import com.mafia.roles.PersonFaction;
import com.mafia.roles.PersonType;

public class PahlevanBase extends Person {
    protected PahlevanBase(String name,PersonType type){
        super(name, type, PersonFaction.PAHLEVAN);
    }
}
