package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class directory {

    LinkedList<memberPlayer> singlyLinkedList = new LinkedList<>();

    public void add(String firstName, String lastName, int age, String team) {
        memberPlayer memberPlayer = new memberPlayer(firstName, lastName, age, team);
        singlyLinkedList.add(memberPlayer);
    }

    /*
        public void searchPerson(String name){
            for (memberPlayer memberPlayer : singlyLinkedList) {
                if (name.compareTo(memberPlayer.getFirstName()) == 0) {

                }
            }
        }
    */
    public void printall() {
        int num = 0;
        int indx = 0;
        while (singlyLinkedList.size() > num) {
            System.out.println("Index: " + indx + " = " + singlyLinkedList.get(num));
            indx++;
            num++;
        }
    }

    public void removePerson(int number){
        singlyLinkedList.remove(number);
    }

    public void searchPerson(String name) {
        for (memberPlayer memberPlayer : singlyLinkedList) {
            if (name.compareTo(memberPlayer.getFirstName()) == 0) {

            }
        }
    }
}