package bte;

import bte.model.AbstractEmployee;
import bte.model.Accounter;
import bte.model.Administrator;
import bte.model.Developer;
import bte.service.Company;
import bte.service.CompanyPoly;

public class Lesson8 {

   /* Создайте класс Компания. В комании работают:
    программисты (возраст, имя, ЗП, язык программирования),
    администраторы (возраст, имя, ЗП, отдел) и бухгалтеры (возраст, имя, ЗП и отдел).
    Создайте конструктор с параметрами   для всех классов для всех параметров.
    Реализуйте в классе Компания метод, определяющий имя сотрудника с самой  большой ЗП.
    */

    public static void main(String[] args) {
        Developer[] developers = {
                new Developer(30, "Jo", 30_000, "Python"),
                new Developer(22, "Chack", 20_000, "JS")
        };
        Administrator[] administrators = {
                new Administrator(30, "Mike", 15_000, "Logistic"),
                new Administrator(22, "Max", 10_000, "Supply")
        };
        Accounter[] accounters = {
                new Accounter(30, "Mila", 33_000, "DevOps"),
                new Accounter(22, "Olga", 24_000, "Admin")
        };

        Company google = new Company(developers, administrators, accounters);
        google.printNameWithBiggestSalary();


        AbstractEmployee developer = new Developer(30, "Jo", 30_000, "Python");
        //developer.getProgrammingLanguage();
        developer.getSalary();
        AbstractEmployee accounter = new Accounter(30, "Mila", 33_000, "DevOps");
        AbstractEmployee administrator = new Administrator(30, "Mike", 15_000, "Logistic");
        AbstractEmployee[] employees = {developer, accounter, administrator};

        CompanyPoly meta = new CompanyPoly(employees);
        meta.printNameWithBiggestSalary();
    }
}
