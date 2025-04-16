package com.xworkz.main;

import com.xworkz.internal.Pen;
import com.xworkz.internal.WritingTool;

public class WritingToolRunner {
    public static void main(String[] args) {
        WritingTool genericTool = new WritingTool("Generic", "Black");
        genericTool.write();
        System.out.println(genericTool);

        Pen ballpoint = new Pen("Ballpoint", "Blue", "Black");
        ballpoint.write();
        ballpoint.refill();
        System.out.println(ballpoint);

        WritingTool upcastedPen = new Pen("Fountain", "Silver", "Blue");
        upcastedPen.write();
        System.out.println(upcastedPen);
    }
}