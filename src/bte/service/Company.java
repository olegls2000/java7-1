package bte.service;

import bte.model.Accounter;
import bte.model.Administrator;
import bte.model.Developer;

public class Company {
    private Developer[] developers;
    private Administrator[] administrators;
    private Accounter[] accounters;

    public Company(Developer[] developers, Administrator[] administrators, Accounter[] accounters) {
        this.developers = developers;
        this.administrators = administrators;
        this.accounters = accounters;
    }

    public void printNameWithBiggestSalary() {
        Developer devMaxSalary = developers[0];
        for (Developer developer : developers) {
            if (developer.getSalary() > devMaxSalary.getSalary()) {
                devMaxSalary = developer;
            }
        }
        Accounter accMaxSalary = accounters[0];
        for (Accounter accounter : accounters) {
            if (accounter.getSalary() > accMaxSalary.getSalary()) {
                accMaxSalary = accounter;
            }
        }
        Administrator admMaxSalary = administrators[0];
        for (Administrator administrator : administrators) {
            if (administrator.getSalary() > admMaxSalary.getSalary()) {
                admMaxSalary = administrator;
            }
        }
        if (devMaxSalary.getSalary() > accMaxSalary.getSalary()
                && devMaxSalary.getSalary() > admMaxSalary.getSalary()) {
            System.out.println("Biggest Salary has developer: " + devMaxSalary.getName());
        }
        if (accMaxSalary.getSalary() > devMaxSalary.getSalary()
                && accMaxSalary.getSalary() > admMaxSalary.getSalary()) {
            System.out.println("Biggest Salary has accounter: " + accMaxSalary.getName());
        }
        if (admMaxSalary.getSalary() > devMaxSalary.getSalary()
                && admMaxSalary.getSalary() > accMaxSalary.getSalary()) {
            System.out.println("Biggest Salary has admin: " + admMaxSalary.getName());
        }
    }
}