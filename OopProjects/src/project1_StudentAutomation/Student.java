package project1_StudentAutomation;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes,String stuNo ,Course mat, Course fizik,Course kimya){
        this.name = name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcAvearage();
        this.isPass=false;


    }
    public void addBulkExamNote(int mat,int matSozlu,int fizik,int fizikSozlu,int kimya,int kimyaSozlu){
        if (mat >= 0 && mat <= 100){
            this.mat.note=mat;
            this.mat.noteSozlu=matSozlu;
        }
        if(fizik>=0 && fizik <=100){
            this.fizik.note=fizik;
            this.fizik.noteSozlu=fizikSozlu;

        }
        if(kimya>=0 && kimya<=100){
            this.kimya.note=kimya;
            this.kimya.noteSozlu=kimyaSozlu;
        }

    }
    public void isPass(){
        if(this.mat.note ==0 || this.fizik.note ==0 ||this.kimya.note==0){
            System.out.println("Notlar tam olarak girilmemiş");
        }
        else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("ortalama :"+this.average);
            if(this.isPass){
                System.out.println("Sınıfı geçti");
            }
            else {
                System.out.println("Sınıfta kaldı.");
            }

        }
    }
    public void calcAvearage(){
        this.mat.note= (int) ((mat.note*0.7)+(mat.noteSozlu*0.3));
        this.fizik.note= (int) ((fizik.note*0.8)+(fizik.noteSozlu*0.2));
        this.kimya.note= (int) ((kimya.note*0.5)+(kimya.noteSozlu*0.5));


        this.average=(this.fizik.note+this.kimya.note+this.mat.note)/3;
    }
    public boolean isCheckPass(){
        calcAvearage();
        return this.average>55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Notu : " + this.mat.noteSozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Notu : " + this.fizik.noteSozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Notu : " + this.kimya.noteSozlu);
    }



}


