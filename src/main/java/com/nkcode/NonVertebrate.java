package com.nkcode;

public abstract sealed class NonVertebrate implements LivingBeing permits Insect {
    @Override
    public boolean isVertebrate() {
        return false;
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
}
