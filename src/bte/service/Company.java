package bte.service;

import bte.model.Accountant;
import bte.model.Administrator;
import bte.model.Developer;

public class Company {
    Developer[] developers;
    Accountant[] accountants;
    Administrator[] administrators;

    public Company(Developer[] developers, Accountant[] accountants, Administrator[] administrators) {
        this.developers = developers;
        this.accountants = accountants;
        this.administrators = administrators;
    }


    public String findNameWithTheBiggestSalary() {
        int type=-1;
        int maxSalary = developers[0].getSalary();
        Developer maxSalaryDeveloper = null;
        for (Developer developer : developers) {
            if (developer.getSalary() > maxSalary) {
                maxSalary = developer.getSalary();
                maxSalaryDeveloper = developer;
                type=0;
            }
        }
        Accountant maxSalaryAccountant = null;
        for (Accountant accountant : accountants) {
            if (accountant.getSalary() > maxSalary) {
                maxSalary = accountant.getSalary();
                maxSalaryAccountant = accountant;
                type=1;
            }
        }
        Administrator maxSalaryAdministrator=null;
        for (Administrator administrator : administrators) {
            if (administrator.getSalary() > maxSalary) {
                maxSalary = administrator.getSalary();
                maxSalaryAdministrator=administrator;
                type=2;
            }
        }
        String name="";
        int salary=0;
if(type==0) {
    name=maxSalaryDeveloper.getName();
    salary=maxSalaryDeveloper.getSalary();
    System.out.print("Developer ");
} else if (type==1) {
    name=maxSalaryAccountant.getName();
    salary=maxSalaryAccountant.getSalary();
    System.out.print("Accountant ");
} else if (type==2) {
    name=maxSalaryAdministrator.getName();
    salary=maxSalaryAdministrator.getSalary();
    System.out.print("Administrator ");
}
if ("".compareTo(name)!=0) {
    System.out.println(name+" with the biggest salary "+
            salary);
}
        return name;
    }
}
