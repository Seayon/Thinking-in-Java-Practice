package com.seayon.chapter08;

import org.junit.Test;

import static net.mindview.util.Print.print;

public class Mucis3 {
    @Test
    public void testBasic() {

    }

    enum Note{
        MIDDLE_C,C_SHARP,B_FLAT;//etc
    }

    class Instrument {
        void play(Note n) {
            print("Instrument.play()" + n);
        }

        @Override
        public String toString() {
            return what();
        }

        String what() {
            return "Instrument";
        }

        void adjust() {
            print("Adjusting Instrument");
        }
    }

    class Wind extends Instrument {
        @Override
        void play(Note n) {
            print("Wind.play()" + n);
        }

        @Override
        String what() {
            return "Wind";
        }

        @Override
        void adjust() {
            print("Adjusting Wind");
        }
    }

    class Percussion extends Instrument {
        @Override
        void play(Note n) {
            print("Percussion.play()" + n);
        }

        @Override
        String what() {
            return "Percussion";
        }

        @Override
        void adjust() {
            print("Adjusting Percussion");
        }
    }

    class Stringed extends Instrument {
        @Override
        void play(Note n) {
            print("Stringed.play()" + n);
        }

        @Override
        String what() {
            return "Stringed";
        }

        @Override
        void adjust() {
            print("Adjusting Stringed");
        }
    }

    class Woodwind extends Wind {
        @Override
        void play(Note n) {
            print("Woodwind.play()" + n);
        }

        @Override
        String what() {
            return "Woodwind";
        }
    }

    public void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    @Test
    public void testMain() {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind()
        };
        tuneAll(orchestra);

        for (Instrument instrument : orchestra) {
            System.out.println("instrument.toString() = " + instrument.toString());
        }
    }


}
