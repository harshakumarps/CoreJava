package com.xworkz.main;

import com.xworkz.internal.HandTool;
import com.xworkz.internal.Tool;

public class ToolRunner {
    public static void main(String[] args) {
        Tool genericTool = new Tool("Generic", "doing things");
        genericTool.use();
        System.out.println(genericTool);

        HandTool hammer = new HandTool("Hammer", "driving nails", true);
        hammer.use();
        hammer.operateManually();
        System.out.println(hammer);

        Tool upcastedHandTool = new HandTool("Screwdriver", "fastening screws", true);
        upcastedHandTool.use();
        System.out.println(upcastedHandTool);
    }
}