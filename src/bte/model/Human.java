package bte.model;

public class Human {
    private int age;
    private String name;
    private String lastName;
    private byte gender;

    public Human(String lastName) {
        this.lastName = lastName;
        this.age = (int) (Math.random() * (65 - 18)) + 18;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getOlder() {
        System.out.println(this.name);
        this.age++;
    }

    public void marriage(Human human) {

        if (human.gender == 0) {
            this.lastName = human.lastName;
        } else {
            human.lastName = this.lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }
}