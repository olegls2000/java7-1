package bte.service;

import bte.model.AbstractEmployee;
import bte.model.Accounter;
import bte.model.Administrator;
import bte.model.Developer;

public class CompanyPoly {
    private AbstractEmployee[] employees;

    public CompanyPoly(AbstractEmployee[] employees) {
        this.employees = employees;
    }

    public void printNameWithBiggestSalary() {
        AbstractEmployee empMaxSalary = employees[0];
        for (AbstractEmployee employee : employees) {
            if (employee.getSalary() > empMaxSalary.getSalary()) {
                empMaxSalary = employee;
            }
        }
        String employeeType = "";
        if (empMaxSalary instanceof Developer) {
            employeeType = "Developer";
        } else if (empMaxSalary instanceof Accounter) {
            employeeType = "Accounter";
        } else {
            employeeType = "Administrator";
        }
        System.out.println("Biggest Salary has: " + employeeType + " " + empMaxSalary.getName());
    }
}
