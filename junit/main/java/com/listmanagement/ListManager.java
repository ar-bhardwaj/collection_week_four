package com.listmanagement;

// ListManager.java
import java.util.List;

public class ListManager {
    // Method to add an element to a list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Method to remove an element from a list
    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element));
    }

    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
