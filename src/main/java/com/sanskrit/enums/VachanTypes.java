/**
  Copyright 2022 Soumyajit Samanta github:soumyajitsamanta
*/
package com.sanskrit.enums;

public enum VachanTypes {
    EK_VACHAN("एकवचन", "Singular"), DWI_VACHAN("द्विवचन", "Dual"),
    BAHU_VACHAN("बहुवचन", "Plural");

    private String vachan;
    private String englishDescription;

    private VachanTypes(String vachan, String englishDescription) {
        this.vachan = vachan;
        this.englishDescription = englishDescription;
    }

    @Override
    public String toString() {
        return String.join(" = ", this.vachan, this.englishDescription);
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

    public String getVachan() {
        return vachan;
    }

}
