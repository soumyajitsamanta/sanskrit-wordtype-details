/**
  Copyright 2022 Soumyajit Samanta github:soumyajitsamanta
*/
package com.sanskrit.enums;

public enum DhatuEndingTypes {
    AATMANEPADA("आत्मनेपद", "Action for self"),
    PARASMAIPADA("परस्मैपद", "Action for other person");

    private String dhatuEnding;
    private String englishDescription;

    private DhatuEndingTypes(String dhatuEnding, String englishDescription) {
        this.dhatuEnding = dhatuEnding;
        this.englishDescription = englishDescription;
    }

    public String getDhatuEnding() {
        return dhatuEnding;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DhatuEndingTypes [dhatuEnding=");
        builder.append(dhatuEnding);
        builder.append(", englishDescription=");
        builder.append(englishDescription);
        builder.append("]");
        return builder.toString();
    }

}
