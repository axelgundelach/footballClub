package com.company;

public class  memberPlayer {

    public String firstName, lastName, team;
    public int age;

     public memberPlayer(String firstName, String lastName, int age, String team){
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.team = team;
     }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "memberPlayer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", team='" + team + '\'' +
                ", age=" + age +
                '}';
    }
}
