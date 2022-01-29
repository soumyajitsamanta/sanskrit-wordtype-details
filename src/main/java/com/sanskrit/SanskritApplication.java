package com.sanskrit;

import java.util.stream.Stream;

import com.sanskrit.enums.DhatuEndingTypes;
import com.sanskrit.enums.KarakTypes;
import com.sanskrit.enums.LakarTypes;
import com.sanskrit.enums.LingTypes;
import com.sanskrit.enums.PurushTypes;
import com.sanskrit.enums.VachanTypes;

public class SanskritApplication {
    public static void main(String[] args) {
        Stream.of(DhatuEndingTypes.values())
                .map(a -> String.join(", ", a.getDhatuEnding(),
                        a.getEnglishDescription()))
                .forEach(System.err::println);
        Stream.of(KarakTypes.values())
                .map(a -> String.join(", ", a.getKarak(), a.getCaseInEnglish(),
                        a.getCaseInHindi(), a.getEnglishDescription(),
                        a.getPrepositionSign()))
                .forEach(System.err::println);
        Stream.of(LakarTypes.values())
                .map(a -> String.join(", ", a.getLakar(),
                        a.getHindiDescription(), a.getEnglishDescription()))
                .forEach(System.err::println);
        Stream.of(LingTypes.values()).map(
                a -> String.join(", ", a.getLing(), a.getEnglishDescription()))
                .forEach(System.err::println);
        Stream.of(PurushTypes.values())
                .map(a -> String.join(", ", a.getPurush(),
                        a.getEnglishDescription()))
                .forEach(System.err::println);
        Stream.of(VachanTypes.values())
                .map(a -> String.join(", ", a.getVachan(),
                        a.getEnglishDescription()))
                .forEach(System.err::println);
    }

}
