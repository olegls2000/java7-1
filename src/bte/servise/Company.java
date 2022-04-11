package bte.servise;

import bte.model.Administrators;
import bte.model.Buhgalters;
import bte.model.Developers;

public class Company {
    private Administrators[] administrators;
    private Developers[] programmers;
    private Buhgalters[] buhgalters;

    public Company(Developers[] programmers,
                   Buhgalters[] buhgalters,
                   Administrators[] administrators) {
    }

    public void printWithBiggestSalary(){
        Developers progMaxSalary = programmers[0];
        for (Developers developers :programmers){
            if (developers.getSolar() > progMaxSalary.getSolar()){
                progMaxSalary = developers;
            }

        }


        Administrators admMaxSalary = administrators[0];
        for (Administrators administrators:administrators){
            if (administrators.getSolar() > administrators.getSolar()){
                admMaxSalary = administrators;
            }

        }


        Buhgalters buhgMaxSalary = buhgalters[0];
        for (Buhgalters buhgalters:buhgalters){
            if (buhgalters.getSolar() > buhgMaxSalary.getSolar()){
                buhgMaxSalary = buhgalters;
            }

        }


        if(progMaxSalary.getSolar() > admMaxSalary.getSolar())

    }

}

