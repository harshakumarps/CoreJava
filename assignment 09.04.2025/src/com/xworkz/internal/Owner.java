package com.xworkz.internal;

public class Owner {
    public void run() {

        Mutant mutant = new Mutant();


        mutant.setName("Wolverine");
        mutant.setPower("Healing Factor");
        mutant.setStrengthLevel(8);
        mutant.setVisible(true);
        mutant.setAge(150);


        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Strength Level: " + mutant.getStrengthLevel());
        System.out.println("Is Visible: " + mutant.isVisible());
        System.out.println("Age: " + mutant.getAge());
    }

    public static class KeyChain {
        private int numberOfKeys;
        private String material;
        private String color;
        private boolean hasCharm;
        private String brand;

        void setNumberOfKeys(int numberOfKeys) {
            this.numberOfKeys = numberOfKeys;
        }

        void setMaterial(String material) {
            this.material = material;
        }

        void setColor(String color) {
            this.color = color;
        }

        void setHasCharm(boolean hasCharm) {
            this.hasCharm = hasCharm;
        }

        void setBrand(String brand) {
            this.brand = brand;
        }

        public int getNumberOfKeys() {
            return numberOfKeys;
        }

        public String getMaterial() {
            return material;
        }

        public String getColor() {
            return color;
        }

        public boolean hasCharm() {
            return hasCharm;
        }

        public String getBrand() {
            return brand;
        }
    }
}