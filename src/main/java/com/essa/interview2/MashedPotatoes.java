package com.essa.interview2;

public class MashedPotatoes implements IrishPotato {


    String cookingStyle;
    String form;
    String color;

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

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {

    }
}
