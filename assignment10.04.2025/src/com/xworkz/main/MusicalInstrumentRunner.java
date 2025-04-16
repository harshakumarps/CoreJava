package com.xworkz.main;

import com.xworkz.internal.MusicalInstrument;
import com.xworkz.internal.StringInstrument;

public class MusicalInstrumentRunner {
    public static void main(String[] args) {
        MusicalInstrument genericInstrument = new MusicalInstrument("Generic", "Unknown");
        genericInstrument.play();
        System.out.println(genericInstrument);

        StringInstrument guitar = new StringInstrument("Guitar", "String", 6);
        guitar.play();
        guitar.pluck();
        System.out.println(guitar);

        MusicalInstrument upcastedStringInstrument = new StringInstrument("Violin", "String", 4);
        upcastedStringInstrument.play();
        System.out.println(upcastedStringInstrument);
    }
}