/**
  Copyright 2022 Soumyajit Samanta github:soumyajitsamanta
*/
package sanskrit.word;

import sanskrit.word.enums.KarakTypes;
import sanskrit.word.enums.LingTypes;
import sanskrit.word.enums.VachanTypes;

public class NounWords {
    String root;
    LingTypes ling;
    VachanTypes vachan;
    KarakTypes karak;

    public NounWords(String root, LingTypes ling, VachanTypes vachan,
            KarakTypes karak) {
        super();
        this.root = root;
        this.ling = ling;
        this.vachan = vachan;
        this.karak = karak;
    }

}
