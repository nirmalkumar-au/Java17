package com.nkcode;

public final class Human extends Vertebrate {
    @Override
    public double minWeight() {
        return 0.240;
    }

    @Override
    public double maxWeight() {
        return 500;
    }

    @Override
    public String unitOfWeight() {
        return "Kilogram";
    }

    @Override
    public void hasLegs() {
        System.out.println("Humans have two legs");
    }
}
