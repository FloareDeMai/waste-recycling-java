package com.codecool.wasterecycling;

public class Main {

        public static void main(String[] args) {
                Dustbin dustbin = new Dustbin("Green");
                Garbage plasticBottle = new PlasticGarbage("Plastic bottle", true);
                Garbage plasticToy = new PlasticGarbage("Doll", true);
                Garbage plasticChair = new PlasticGarbage("Chair", true);
                Garbage paperExam = new PaperGarbage("Paper exam", true);
                Garbage plasticBag = new PlasticGarbage("Plastic bag", false);
                Garbage tomato = new Garbage("Tomato");
//                ((PlasticGarbage) plasticBag).clean();



                dustbin.throwOutGarbage(plasticBottle);
                dustbin.throwOutGarbage(plasticToy);
                dustbin.throwOutGarbage(plasticChair);
                dustbin.throwOutGarbage(paperExam);
                dustbin.throwOutGarbage(plasticBag);
                dustbin.throwOutGarbage(tomato);

                dustbin.displayContents();

                System.out.println(dustbin);
                dustbin.emptyContents();
                System.out.println(dustbin);

//                Garbage plasticBottle1 = new PlasticGarbage("Plastic bottle", true);
//                Garbage plasticToy1 = new PlasticGarbage("Doll", true);
//                Garbage plasticChair1 = new PlasticGarbage("Chair", true);

        }
}
