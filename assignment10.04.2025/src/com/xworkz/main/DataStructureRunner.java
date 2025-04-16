package com.xworkz.main;

import com.xworkz.internal.Array;
import com.xworkz.internal.DataStructure;

public class DataStructureRunner {
    public static void main(String[] args) {
        DataStructure genericStructure = new DataStructure("Generic");
        genericStructure.storeData();
        System.out.println(genericStructure);

        Array numbers = new Array("NumberArray", 10);
        numbers.storeData();
        numbers.accessElement(5);
        System.out.println(numbers);

        DataStructure upcastedArray = new Array("StringArray", 20);
        upcastedArray.storeData();
        System.out.println(upcastedArray);
    }
}