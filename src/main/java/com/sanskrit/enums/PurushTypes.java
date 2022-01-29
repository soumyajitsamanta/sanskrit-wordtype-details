/**
  Copyright 2022 Soumyajit Samanta github:soumyajitsamanta
*/
package com.sanskrit.enums;

public enum PurushTypes {
    PRATHAM("प्रथम", "Third"), MADHYAM("मध्यम", "Second"),
    UTTAM("उत्तम", "First");

    private String purush;
    private String englishDescription;

    private PurushTypes(String purush, String englishDescription) {
        this.purush = purush;
        this.englishDescription = englishDescription;
    }

    @Override
    public String toString() {
        return String.join(" = ", this.purush, this.englishDescription);
    }

    public String getPurush() {
        return purush;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

}
