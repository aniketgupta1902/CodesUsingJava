package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have: " +groceryList.size() + " items");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " +groceryList.get(i));
        }

    }
    public void modifyList(int pos, String newItem){
        groceryList.set(pos, newItem);
    }

    public void removeItem(int pos){
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);
    }
    public String findItem(String item){
//        boolean exists = groceryList.contains(item);
        int pos = groceryList.indexOf(item);
        if(pos>=0){
            return groceryList.get(pos);
        }
        return null;
    }
}
