package com.nkcode;

public abstract sealed class Vertebrate implements LivingBeing permits Human, Bird, Animal {
    @Override
    public boolean isVertebrate() {
        return true;
    }

    @Override
    public String toString() {
       return( String.format("Vertebrate : %s , Unit of weight : %s, Weight range : %#7.3f-%#7.3f",
        isVertebrate()?"Yes":"No",
        unitOfWeight(),
        minWeight(),
        maxWeight())
       );
    }

    public void hasLegs() {
        System.out.println("Vertebrates may or may not have legs");
    }
}
