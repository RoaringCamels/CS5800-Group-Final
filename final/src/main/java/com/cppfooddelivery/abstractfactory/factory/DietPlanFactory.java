package com.cppfooddelivery.abstractfactory.factory;

import com.cppfooddelivery.abstractfactory.carbs.Carbs;
import com.cppfooddelivery.abstractfactory.protein.Protein;
import com.cppfooddelivery.abstractfactory.fats.Fats;

public interface DietPlanFactory {
    Carbs createCarbs();

    Protein createProtein();

    Fats createFats();
}
