package project3_SalaryCounter;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int bonusSalary;


    public Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        int bonusSalary;

        if(salary>=1000){
            tax(salary);
        }
        if(workHours>40){
            bonus(workHours);
        }

        print();

    }
    public int raiseSalary(int hireYear){
        int year=0;
        int incSalary;
        if((2021-hireYear)<10){
            incSalary=(this.salary/100)*5;
        }
        else if(((2021-hireYear)>9)&& (2021-hireYear)<20){
            incSalary=(this.salary/100)*10;
        }
        else{
            incSalary=(this.salary/100)*15;
        }
        return incSalary;
    }
    public int tax(int salary){
        int tax=(salary/100)*3;
        return tax;

    }
    public int bonus(int workHours){
        int fazla= workHours-40;
        this.bonusSalary=(fazla*30);

        return bonusSalary;


    }

    public void print(){
        System.out.println("Adı: "+ this.name);
        System.out.println("Maaşı :"+ this.salary);
        System.out.println("Çalışma saati: "+ this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax(salary));
        System.out.println("Bonus: "+this.bonusSalary);
        System.out.println("Maaş artışı: "+raiseSalary(hireYear));
        System.out.println("Vergi ve bonuslar aile birlikte maaş: "+((this.salary+this.bonusSalary)-tax(salary)));
        System.out.println("Toplam maaş: "+(this.salary+raiseSalary(salary)));
        System.out.println("-------------------");

    }
}
