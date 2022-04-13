package bte.service;

import bte.model.AbstractEmploy;
import bte.model.Accounter;
import bte.model.Administrator;
import bte.model.Developer;

public class CompanyPoly {
    private AbstractEmploy[] employees;

    public CompanyPoly(AbstractEmploy[] employees) {
        this.employees = employees;
    }

    public void printNameWithBiggestSalary() {
        AbstractEmploy employeeMaxSalary = employees[0];
        for (AbstractEmploy employee : employees) {
            if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        String employeeType = "";
        if (employeeMaxSalary instanceof Developer) {
            employeeType = "Developer";
        } else if (employeeMaxSalary instanceof Accounter) {
            employeeType = "Accounter";
        } else if (employeeMaxSalary instanceof Administrator) {
            employeeType = "Administrator";
        }
        System.out.println("Biggest Salary has: " + employeeType + " " + employeeMaxSalary.getName());
    }
}
