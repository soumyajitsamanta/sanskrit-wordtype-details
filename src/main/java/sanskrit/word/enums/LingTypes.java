/**
  Copyright 2022 Soumyajit Samanta github:soumyajitsamanta
*/
package sanskrit.word.enums;

public enum LingTypes {
    PULLING("पुल्लिंग", "masculine"), STRILING("स्त्रिलिंग", "feminine"),
    MAPUNSAKLING("नपुंसक लिंग", "neuter");

    private String ling;
    private String englishDescription;

    private LingTypes(String ling, String englishDescription) {
        this.ling = ling;
        this.englishDescription = englishDescription;
    }

    @Override
    public String toString() {
        return String.join(" = ", this.ling, this.englishDescription);
    }

    public String getLing() {
        return ling;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

}
