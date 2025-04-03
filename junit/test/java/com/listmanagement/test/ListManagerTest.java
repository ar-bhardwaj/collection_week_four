package com.listmanagement.test;

// ListManagerTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.listmanagement.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {
    private final ListManager listManager = new ListManager();

    // Test for adding elements
    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    // Test for removing elements
    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        assertTrue(listManager.removeElement(list, 5));
        assertFalse(list.contains(5));
    }

    // Test for getting the size of the list
    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        listManager.addElement(list, 10);
        assertEquals(2, listManager.getSize(list));
    }
}
