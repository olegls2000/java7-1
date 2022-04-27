package study;

public class Dog {

    Dog()
    {
        this.bark();
    }
    void bark () // метод bark () перегружен
    {
        System.out.println("no barking!");
    }
    void bark (String m, double l) // Примечание: возвращаемое значение перегруженного
    // метода одинаково,
    {
        System.out.println(m + " is a barking dog!");
    }
    void bark (int a, String n) // Невозможно различить перегруженные методы по возвращаемому значению,
    // но только по «типу параметра» и «имени класса»
    {
        System.out.println(n + " is a dog");
    }


}
