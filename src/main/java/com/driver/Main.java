package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
    /*
    public class Boat implements WaterVehicle{

        private String name;
        private int capacity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        @Override
        public String getVehicleName() {
            return null;
        }

        @Override
        public int getVehicleCapacity() {
            return 0;
        }
    }
    */
}