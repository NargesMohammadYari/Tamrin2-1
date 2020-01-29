package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String selectItem;
        System.out.println("1)C     2)CL        3)CLS       4)E     5)SL");
        selectItem=obj.nextLine();

        switch(selectItem)
        {
            case "1":
                ClassC myClassC=new ClassC();
                myClassC.speed();
                myClassC.engine();
                myClassC.power();
                myClassC.weight();
                myClassC.acceleration();
                myClassC.performerCountry();
                break;
            case "2":
                ClassCL myClassCL=new ClassCL();
                myClassCL.speed();
                myClassCL.engine();
                myClassCL.power();
                myClassCL.weight();
                myClassCL.acceleration();
                myClassCL.performerCountry();
                break;
            case "3":
                ClassCLS myClassCLS=new ClassCLS();
                myClassCLS.speed();
                myClassCLS.engine();
                myClassCLS.power();
                myClassCLS.weight();
                myClassCLS.acceleration();
                myClassCLS.performerCountry();
                break;
            case "4":
                ClassE myClassE=new ClassE();
                myClassE.speed();
                myClassE.engine();
                myClassE.power();
                myClassE.weight();
                myClassE.acceleration();
                myClassE.performerCountry();
                break;
            case "5":
                ClassSL myClassSL=new ClassSL();
                myClassSL.speed();
                myClassSL.engine();
                myClassSL.power();
                myClassSL.weight();
                myClassSL.acceleration();
                myClassSL.performerCountry();
                break;
        }
    }
    }
