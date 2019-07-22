package com.mafia.actions;

import com.mafia.roles.Person;

public abstract class ActionBase {
    protected ActionAffect affectType;
    protected ActionType type;
    protected ActionAppliesType appliesTo;
    private Person caster, person1 = null, person2 = null;
    private boolean ignorable;
    private boolean used = false;
    protected ActionBase(Person caster, ActionAffect affectType, ActionType type, ActionAppliesType appliesTo, boolean ignorable){
        this.caster     = caster;
        this.affectType = affectType;
        this.type       = type;
        this.ignorable  = ignorable;
        this.appliesTo  = appliesTo;
    }

    public void use(Person... people) {
        if(people.length == validLength()) {
            if (people.length > 0) {
                person1 = people[0];
                if (people.length > 1) {
                    person2 = people[1];
                }
            }
            used = true;
            caster.actionUsed();
        }
    }

    private int validLength(){
        switch (affectType){
            case GLOBAL:
                return 0;
            case ONE_PERSON:
                return 1;
            case TWO_PERSON:
                return 2;
        }
        return -1;
    }

    public Person getCaster() {
        return caster;
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public boolean isIgnorable() {
        return ignorable;
    }

    public boolean isUsed() {
        return used;
    }

    public abstract String getLog();
}
