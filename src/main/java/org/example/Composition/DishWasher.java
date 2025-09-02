package org.example.Composition;

public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Dishwasher is working");
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
