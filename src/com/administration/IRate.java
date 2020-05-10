package com.administration;

public interface IRate {
    //return baseRate

    default double getBaseRate(){
        return 2.5;
    }
}
