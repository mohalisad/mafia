package com.mafia.roles.ahriman;

import com.mafia.roles.Person;
import com.mafia.roles.PersonFaction;
import com.mafia.roles.PersonType;

public abstract class AhrimanBase extends Person {
    protected AhrimanBase(String name, PersonType type){
        super(name, type, PersonFaction.AHRIMAN);
    }
}
