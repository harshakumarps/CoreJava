package com.xworkz.main;

import com.xworkz.internal.Building;
import com.xworkz.internal.House;

public class BuildingRunnerSimple {
    public static void main(String[] args) {
        Building genericBuilding = new Building("Concrete");
        genericBuilding.construct();

        House myHouse = new House("Brick", 3);
        myHouse.construct();
        myHouse.liveIn();

        Building buildingHouse = new House("Wood", 2);
        buildingHouse.construct();
    }
}