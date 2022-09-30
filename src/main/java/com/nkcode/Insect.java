package com.nkcode;

public final class Insect extends NonVertebrate {

    @Override
    public double minWeight() {
        return 1;
    }

    @Override
    public double maxWeight() {
        return 100000;
    }

    @Override
    public String unitOfWeight() {
        return "Milligram";
    }

    public void hasTail() {
        System.out.println("Insects may or may not have tail");
    }
}
