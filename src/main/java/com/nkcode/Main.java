package com.nkcode;

import java.util.ArrayList;
import java.util.List;

/*
Used the Java17 features of Sealed, Non Sealed Class and Permits
Used the Java17 feature of Pattern matching Switch statement
Vertebrate : No , Unit of weight : Milligram, Weight range :   1.000-100000.000. Insects may or may not have tail
Vertebrate : Yes , Unit of weight : Gram, Weight range :   2.000-140000.000. Birds have wings, but may  flight or flightless
Vertebrate : Yes , Unit of weight : Kilogram, Weight range :   0.002-190000.000. Animals have two or four legs or no legs
Vertebrate : Yes , Unit of weight : Kilogram, Weight range :   0.240-500.000. Humans have two legs
* */

public class Main {

    public static void main(String[] args) {
        List<LivingBeing> livingBeingList = new ArrayList<>();
        livingBeingList.add(new Insect());
        livingBeingList.add(new Bird());
        livingBeingList.add(new Animal());
        livingBeingList.add(new Human());
        detailLivingBeing(livingBeingList);
    }

    private static void detailLivingBeing( List<LivingBeing> livingBeingList) {
        for (LivingBeing livingBeing : livingBeingList) {
            switch(livingBeing) {
                case Vertebrate v -> System.out.printf("%s. ", v);
                case NonVertebrate nv -> System.out.printf("%s. ", nv);
            }

            switch (livingBeing) {
                case Insect insect -> insect.hasTail();
                case Bird bird -> bird.hasWings();
                case Animal animal -> animal.hasLegs();
                case Human human -> human.hasLegs();
                default -> System.out.println("Not a living being");
            }
        }
    }

}
