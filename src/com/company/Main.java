package com.company;

import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    directory dy = new directory();

    public static void main(String[] args) {
        Main main = new Main();
        main.dy.printall();
        main.dy.add("andreas", "hjort", 3, "Astralis");
        main.dy.add("axel", "asdad", 3, "Astralis");
        main.remove();
        main.dy.printall();


    }
    public void createMember(){
        System.out.println("write firstname: ");
        String firstName = scan.nextLine();
        System.out.println("write lastname: ");
        String lastName = scan.nextLine();
        System.out.println("write age: ");
        int age = scan.nextInt();
        System.out.println("write team");
        String team = scan.nextLine();
        dy.add(firstName,lastName,age, team);

        System.out.println("1. Passiv \n2. Aktiv");
    }


    public void remove(){
        dy.printall();
        System.out.println("Indtast index du vil fjerne: ");
        int index = scan.nextInt();
        dy.removePerson(index);

    }






}
