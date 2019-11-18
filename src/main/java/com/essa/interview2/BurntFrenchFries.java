package com.essa.interview2;

public class BurntFrenchFries extends FrenchFries {
    boolean isBurnt;
    boolean isTasty;

    public BurntFrenchFries(String cookingStyle, String form, String color, boolean isBurnt, boolean isTasty) {
        super(cookingStyle, form, color);
        this.isBurnt = isBurnt;
        this.isTasty = isTasty;
    }

    public boolean isBurnt() {
        return isBurnt;
    }

    public void setBurnt(boolean burnt) {
        isBurnt = burnt;
    }

    public boolean isTasty() {
        return isTasty;
    }

    public void setTasty(boolean tasty) {
        isTasty = tasty;
    }
}
//Usage of final and static keywords
