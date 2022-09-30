package com.nkcode;

public non-sealed class Bird extends Vertebrate {
    @Override
    public double minWeight() {
        return 2;
    }

    @Override
    public double maxWeight() {
        return 140000;
    }

    @Override
    public String unitOfWeight() {
        return "Gram";
    }

    public void hasWings() {
        System.out.println("Birds have wings, but may  flight or flightless");
    }

    @Override
    public void hasLegs() {
        System.out.println("Birds have two legs");
    }
}
