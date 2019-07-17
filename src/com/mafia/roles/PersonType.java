package com.mafia.roles;

public enum PersonType {
    MANZAR_BANU,
    FAROKH_LAGHA,
    GUDARZ,
    GHAREN,
    KAVEH,
    ROSTAM,
    AMIR_ARSALAN,
    ZALL,
    TUS,
    MALEK_SHAPOUR,

    AFRASIAB,
    REIHANEH_JADOO,
    SHAGHAD,
    GARSIVAZ,
    SHIR_GUYA,
    KAMUS,

    GHAMAR_VAZIR;

    public static String stringValue(PersonType type){
        switch (type){
            case KAVEH:
                return "Kaveh";
            case GHAREN:
                return "Gharen";
            case GUDARZ:
                return "Gudarz";
            case ROSTAM:
                return "Rostam";
            case MANZAR_BANU:
                return "Manzar Banu";
            case FAROKH_LAGHA:
                return "Farokh Lagha";
            case GHAMAR_VAZIR:
                return "Ghamar Vazir";
            case TUS:
                return "Tus";
            case ZALL:
                return "Zall";
            case KAMUS:
                return "Kamus";
            case SHAGHAD:
                return "Shaghad";
            case AFRASIAB:
                return "Afrasiab";
            case GARSIVAZ:
                return "Garsivaz";
            case SHIR_GUYA:
                return "Shir Guya";
            case AMIR_ARSALAN:
                return "Amir Arsalan";
            case MALEK_SHAPOUR:
                return "Malek Shapour";
            case REIHANEH_JADOO:
                return "Reihaneh Jadoo";
        }
        return "";
    }
}
