package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {
        private final String color;
        private int houseWasteCount = 0;
        private int paperCount = 0;
        private int plasticCount = 0;
        private ArrayList<Garbage> garbageArrayList = new ArrayList<>();

        public Dustbin(String color) {
                this.color = color;

        }

        public String getColor() {
                return color;
        }

        public ArrayList<Garbage> getGarbageArrayList() {
                return garbageArrayList;
        }

        // cleaned PlasticGarbage || squeezed PaperGarbage || other kind of Garbage(house waste)
        // else DustbinContentException
        public void throwOutGarbage(Garbage garbage){
                if(garbage instanceof PlasticGarbage){
                        if(((PlasticGarbage) garbage).isCleaned){
                                garbageArrayList.add(garbage);
                                plasticCount += 1;
                        }else {
                                // throw DustbinContentException;
                                try{
                                        throw new DustbinContentException("Invalid content");
                                }catch (DustbinContentException dustbinContentException){
                                        System.err.println(dustbinContentException);
                                }
                        }
                }else if (garbage instanceof PaperGarbage){
                        if (((PaperGarbage) garbage).isSqueezed()){
                                garbageArrayList.add(garbage);
                                paperCount += 1;
                        }else{
                                // throw DustbinContentException;
                                try{
                                       throw new DustbinContentException("Invalid content");
                                }catch (DustbinContentException dustbinContentException){
                                        System.err.println(dustbinContentException);
                                }


                        }
                }else {
                        garbageArrayList.add(garbage);
                        houseWasteCount+=1;

                }
        }

        public int getHouseWasteCount(){
                return houseWasteCount;
        }

        public int getPaperCount(){
                return paperCount;
        }

        public int getPlasticCount(){
                return plasticCount;
        }

        public void emptyContents(){
                houseWasteCount = 0;
                paperCount = 0;
                plasticCount = 0;
                garbageArrayList.clear();

        }

        public void displayContents(){
                for(Garbage g : garbageArrayList){
                        System.out.println(g.getName());
                }
        }

        @Override
        public String toString() {
                StringBuilder dustbinName = new StringBuilder("Welcome to " + this.getColor() + " " + this.getClass().getSimpleName() + "!");
                StringBuilder plasticGarbage = new StringBuilder("Plastic content: " + getPlasticCount() + " item(s)");
                StringBuilder paperGarbage = new StringBuilder("Paper content: " + getPaperCount() + " item(s)");
                StringBuilder houseWaste = new StringBuilder("House waste content: " + getHouseWasteCount() + " item(s)");
                int countPlastic = 1;
                int countPaper = 1;
                int countHouseWaste = 1;
                for(Garbage g : garbageArrayList){
                        if(g instanceof PlasticGarbage){
                                plasticGarbage.append( " " + g.getName() + " nr." + countPlastic);
                                countPlastic++;
                        }else if(g instanceof PaperGarbage){
                                paperGarbage.append(" " + g.getName() + " nr." + countPaper);
                                countPaper++;
                        }else{
                                houseWaste.append(" " + g.getName() + " nr." + countHouseWaste);
                                countHouseWaste++;

                        }
                }
                return dustbinName.toString() + "\n" + houseWaste.toString() + "\n"  + paperGarbage.toString() + "\n" + plasticGarbage.toString();
        }
}
