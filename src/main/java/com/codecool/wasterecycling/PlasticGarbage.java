package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {
        protected boolean isCleaned;

        public PlasticGarbage(String garbageName, boolean isCleaned) {
                super(garbageName);
                this.isCleaned = isCleaned;
        }

        public boolean isCleaned() {
                return isCleaned;
        }

        public void clean(){
                if(!isCleaned){
                        isCleaned = true;
                        System.out.println("The " + this.getName() + " was cleaned!");
                }
        }
}
