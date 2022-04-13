package bte.service;

import bte.model.AbstractEmployee;
import bte.model.Accountant;
import bte.model.Administrator;
import bte.model.Developer;

public class CompanyPoly {

    AbstractEmployee[] employees;

    public CompanyPoly(AbstractEmployee[] employees) {
        this.employees = employees;
    }

    public void printNameWithBiggestSalary() {
        AbstractEmployee empMaxSalary = employees[0];
        for (AbstractEmployee emp : employees) {
            if (emp.getSalary() > empMaxSalary.getSalary()) {
                empMaxSalary = emp;
            }
        }
        String empType = "";
        if (empMaxSalary instanceof Developer) {
            empType = "Developer";
        } else if (empMaxSalary instanceof Administrator) {
            empType = "Administrator";
        } else if (empMaxSalary instanceof Accountant) {
            empType = "Accountant";
        }
        System.out.println(empType + " " + empMaxSalary.getName() + " with the biggest salary " +
                empMaxSalary.getSalary() + "!!!");
    }
}

