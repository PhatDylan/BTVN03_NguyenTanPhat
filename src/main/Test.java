package main;

import model.student;
import model.teacher;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        student Phat = new
        student("072366110","NguyenTanPhat","2/2/2005",19,"Daihoc",70,185);
        Scanner sc = new Scanner(System.in);


        Phat.getiD();
        System.out.println(Phat.getiD());
        Phat.getHeight();
        System.out.println(Phat.getHeight());

        Phat.setWeight(68);
        System.out.println(Phat.toString());



        teacher Dylan = new
        teacher("0811333786", "DylanNguyen", "Math", "20t");


        Dylan.getMajor();
        System.out.println(Dylan.getMajor());

        Dylan.setAge("30t");
        System.out.println(Dylan.toString());

        Dylan.vesodotamgiac(5);
        Chucnang.parseStringToInt("5");



        int BMI = Chucnang.calculateBMIOfStudent(Phat.getWeight(), Phat.getHeight());
        System.out.println("BMI of Student is: "+BMI);


        System.out.println(Phat.printValue(Phat.getAge()));
        System.out.println(Phat.printValue(Phat.getAge(), Phat.getNameStudent()));

    }

}

