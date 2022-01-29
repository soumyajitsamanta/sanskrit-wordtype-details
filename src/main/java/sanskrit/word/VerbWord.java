package sanskrit.word;

import sanskrit.word.enums.LakarTypes;
import sanskrit.word.enums.PurushTypes;
import sanskrit.word.enums.VachanTypes;

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
