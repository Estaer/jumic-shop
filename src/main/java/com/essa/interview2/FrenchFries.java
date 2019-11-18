package com.essa.interview2;

public class FrenchFries implements IrishPotato {


    String cookingStyle;
    String form;
    String color;

    public FrenchFries(String cookingStyle, String form, String color) {
        this.cookingStyle = cookingStyle;
        this.form = form;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getCookingStyle() {
        return cookingStyle;
    }

    public void setCookingStyle(String cookingStyle) {
        this.cookingStyle = cookingStyle;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
