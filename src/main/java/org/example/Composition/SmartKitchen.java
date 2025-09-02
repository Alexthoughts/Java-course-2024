package org.example.Composition;

public class SmartKitchen {

    CoffeeMaker coffeeMaker = new CoffeeMaker();
    Refrigerator refrigerator = new Refrigerator();
    DishWasher dishWasher = new DishWasher();

    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean addWater, boolean pourMilk, boolean loadDishwasher){
        coffeeMaker.setHasWorkToDo(addWater);
        refrigerator.setHasWorkToDo(pourMilk);
        dishWasher.setHasWorkToDo(loadDishwasher);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }
}
