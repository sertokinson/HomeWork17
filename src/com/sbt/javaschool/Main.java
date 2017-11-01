package com.sbt.javaschool;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tractor tractor = new Tractor();
       print(tractor);
        tractor.move("I");
       tractor.move("F");
        tractor.move("F");
        tractor.move("F");
        tractor.move("F");
        tractor.move("F");
      //  tractor.move("F");
        print(tractor);
    }
    public static void print(Tractor tractor){
        System.out.println(tractor.getPositionX());
        System.out.println(tractor.getPositionY());
        System.out.println(tractor.getOrientation());
    }
}
