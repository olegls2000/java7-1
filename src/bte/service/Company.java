package bte.service;

import bte.model.Accounter;
import bte.model.Admin;
import bte.model.Developer;

public class Company {
    private Developer[] developers;
    private Admin[] admins;
    private Accounter[] accounters;

    public Company(Developer[] developers, Admin[] admins, Accounter[] accounters) {
        this.developers = developers;
        this.admins = admins;
        this.accounters = accounters;
    }
    public void printNameWithBiggestSalary(){
        Developer devMaxSalary = developers[0];
        for (Developer developer : developers){
            if (developer.getSalary() > devMaxSalary.getSalary());
            devMaxSalary = developer;
        }
    }
}
