package com.essa.jumic.models;

import java.util.Random;

public enum CatalogEnum {
    JUMIC_FIRST(2, 1),
    JUMIC_GLOBAL(10, 2),
    JUMIC_NORMAL(7, 3);

    Integer numberOfDays;
    Integer priority;

    private CatalogEnum(Integer numberOfDays, Integer priority) {
        this.numberOfDays = numberOfDays;
        this.priority = priority;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public Integer getPriority() {
        return priority;
    }

//    private CatalogEnum[] catalogs = CatalogEnum.values();
//    private Random random = new Random();
//
//    final CatalogEnum getRandomCatalog() {
//        return catalogs[random.nextInt(catalogs.length)];
//    }


}