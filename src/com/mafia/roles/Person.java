package com.mafia.roles;

import com.mafia.actions.ActionBase;

public abstract class Person {
    private String name;
    private boolean injured = false, dead = false, deadPending = false, instantDeadPending = false, disabled = false, hasSword = false;
    private PersonType type;
    private PersonFaction faction;
    private Person connected = null;

    protected Person(String name,PersonType type,PersonFaction faction){
        this.name = name;
        this.type = type;
        this.faction = faction;
    }

    public void voteKill(){
        this.dead = true;
    }

    public void instantKill() {
        this.instantDeadPending = true;
    }

    public void heal() {
        this.injured = false;
    }

    public void dieIfInjured(){
        if (injured){
            dead = true;
        }
    }

    public void dieIfPending(){
        if (deadPending || instantDeadPending){
            dead = true;
        }
    }

    public void connectTo(Person anotherPerson){
        connected = anotherPerson;
        anotherPerson.connected = this;
    }

    public void disconnect(){
        if (connected != null){
            connected.connected = null;
            connected = null;
        }
    }

    public void setInjured() {
        this.injured = true;
    }

    public void setDisabled() {
        this.disabled = true;
    }

    public void giveSword(){
        this.hasSword = true;
    }

    public String getName() {
        return name;
    }

    public PersonType getType() {
        return type;
    }

    public PersonFaction getFaction() {
        return faction;
    }

    public boolean isInjured() {
        return injured;
    }

    public boolean isDead() {
        return dead;
    }

    public boolean isItDying() {
        return deadPending;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public boolean hasSword() {
        return hasSword;
    }

    public String getTypeInString(){
        return PersonType.stringValue(type);
    }

    public abstract ActionBase getAction();
    public abstract void actionUsed();
}
