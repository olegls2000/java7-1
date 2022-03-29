public class Human {
    public Human(String lastName){
        this.lastName = lastName;
        this.age = (int) (Math.random() * (65 - 18)) + 18;
    }
    public Human(int age, String name){
        this.age = age;
        this.name = name;

    }
    public int age;
    public String name;
    public String lastName;
    public byte gender;
    public void getOlder(){
        System.out.println(this.name);
        this.age++;
    }
    public void marriage(Human human){
        if(human.gender == 1){
            this.lastName = human.lastName;
        }else{
            human.lastName = this.lastName;
        }
      String destinationLastName =  lastName;
    }
}
