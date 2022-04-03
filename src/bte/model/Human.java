package bte.model;

public class Human {
    public int age;
    public String name;
    public byte gender;
    public String lastName;

    public Human(String lastName) {
        this.lastName = lastName;
        this.age = (int) (Math.random() * (65 - 18)) + 18;
    }


    public Human(int age, String name) {
        this.name = name;
        this.age = age;

    }

    public void getOlder() {
        System.out.println(this.name);
        this.age++;
        System.out.println(this.age);
    }


    public void marriage(Human human){
       if(human.gender == 0){
           this.lastName = human.lastName;
       } else{
           human.lastName = this.lastName;
       }

    }


}
