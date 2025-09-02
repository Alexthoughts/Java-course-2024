package org.example.Composition;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Refrigerator is working");
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
