package com.cppfooddelivery;

abstract class MealDecorator extends Meal {
    protected Meal meal;

    public MealDecorator(Meal meal) {
        super(meal.getName(), meal.getFat(), meal.getCarbs(), meal.getProtein());
        this.meal = meal;
    }

    @Override
    public abstract String toString();
}

class LowCarbMeal extends MealDecorator {
    public LowCarbMeal(Meal meal) {
        super(meal);
    }

    @Override
    public String toString() {
        meal.setCarbs(meal.getCarbs() * 0.5);
        return meal.toString();
    }
}

class LowFatMeal extends MealDecorator {
    public LowFatMeal(Meal meal) {
        super(meal);
    }

    @Override
    public String toString() {
        meal.setFat(meal.getFat() * 0.5);
        return meal.toString();
    }
}

class NoRestrictionMeal extends MealDecorator {
    public NoRestrictionMeal(Meal meal) {
        super(meal);
    }

    @Override
    public String toString() {
        return meal.toString();
    }
}
