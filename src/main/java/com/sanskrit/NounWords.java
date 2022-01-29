package com.sanskrit;

import com.sanskrit.enums.KarakTypes;
import com.sanskrit.enums.LingTypes;
import com.sanskrit.enums.VachanTypes;

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
