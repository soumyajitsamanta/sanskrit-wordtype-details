/**
  Copyright 2022 Soumyajit Samanta github:soumyajitsamanta
*/
package sanskrit.word.enums;

public enum LakarTypes {
    LAT("लट्", "वर्तमान काल", "Present Tense"),
    LOT("लोट्", "अनुज्ञा", "Imperative Mood"),
    LANG("लङ्ग्", "भूतकाल", "Past Tense"),
    VIDHILING("विधिलिङ्ग्", "जरूरत", "Potential Mood"),
    LUT("लुट्", "बयानी", "Periphrastic"),
    LRIT("लृट्", "भविष्यत् काल", "Second Future Tense"),
    LRING("लृङ्ग्", "हेतुहेतुमद्भूत", "Conditional Mood"),
    AASHIRLING("आशीर्लिन्ग", "आशीर्वाद देना", "Benedictive Mood"),
    LIT("लिट्", "परोक्ष भूत काल", "Past Perfect Tense"),
    LUNG("लुङ्ग्", "सामान्य भूत काल", "Perfect Tense");

    private String lakar;
    private String hindiDescription;
    private String englishDescription;

    private LakarTypes(String lakar, String hindiName, String englishName) {
        this.lakar = lakar;
        this.hindiDescription = hindiName;
        this.englishDescription = englishName;
    }

    @Override
    public String toString() {
        return String.join(" = ", this.lakar, this.hindiDescription,
                this.englishDescription);
    }

    public String getHindiDescription() {
        return hindiDescription;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

    public String getLakar() {
        return lakar;
    }
}
