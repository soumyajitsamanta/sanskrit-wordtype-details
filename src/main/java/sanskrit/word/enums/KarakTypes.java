/**
  Copyright 2022 Soumyajit Samanta github:soumyajitsamanta
*/
package sanskrit.word.enums;

public enum KarakTypes {
    PRATHAMA("प्रथमा", "Nominative", "कर्ता", "Subject", "ने"),
    DWITIYA("द्वितीया", "Accusative", "कर्म", "Object", "को"),
    TRITIYA("तृतीय", "Instrumental", "करण", "Instrument", "से"),
    CHATURTH("चतुर्थ", "Dative", "संप्रदान", "Receiver", "के लिए, को"),
    PANCHAM("पञ्चम", "Ablative", "अपादान", "Separation", "से (अलग होना)"),
    SHAST("षष्ठ", "Genitive", "सम्बन्ध", "Relation", "का, के, की, रा, रे, री"),
    SAPTAM("सप्तम", "Locative", "अधिकरण", "Location", "में, पर"),
    ASHTAM("अष्टम", "Vocative", "संबोधन", "Address", "हे ! हो");

    private String karak;
    private String caseInEnglish;
    private String caseInHindi;
    private String englishDescription;
    private String prepositionSign;

    private KarakTypes(String karak, String caseInEnglish, String caseInHindi,
            String caseDescription, String prepositionSign) {
        this.karak = karak;
        this.caseInEnglish = caseInEnglish;
        this.caseInHindi = caseInHindi;
        this.englishDescription = caseDescription;
        this.prepositionSign = prepositionSign;
    }

    @Override
    public String toString() {
        return String.join(" = ", this.karak, this.caseInHindi,
                this.caseInEnglish, this.englishDescription,
                this.prepositionSign);
    }

    public String getKarak() {
        return karak;
    }

    public String getCaseInEnglish() {
        return caseInEnglish;
    }

    public String getCaseInHindi() {
        return caseInHindi;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

    public String getPrepositionSign() {
        return prepositionSign;
    }

}
