package com.nkcode;

public sealed interface LivingBeing permits Vertebrate, NonVertebrate {
    boolean isVertebrate();
    double minWeight();
    double maxWeight();
    String unitOfWeight();
}
