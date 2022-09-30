package com.nkcode;

public non-sealed class Animal extends Vertebrate {
    @Override
    public double minWeight() {
        return 0.002;
    }

    @Override
    public double maxWeight() {
        return 190000;
    }

    @Override
    public String unitOfWeight() {
        return "Kilogram";
    }

    @Override
    public void hasLegs() {
        System.out.println("Animals have two or four legs or no legs");
    }
}
