package com.sanskrit;

import com.sanskrit.enums.LakarTypes;
import com.sanskrit.enums.PurushTypes;
import com.sanskrit.enums.VachanTypes;

public class VerbWord {
    String root;
    LakarTypes lakar;
    VachanTypes vachan;
    PurushTypes purush;

    public VerbWord(String root, LakarTypes lakar, VachanTypes vachan,
            PurushTypes purush) {
        super();
        this.root = root;
        this.lakar = lakar;
        this.vachan = vachan;
        this.purush = purush;
    }

}
