package project1_StudentAutomation;

public class Main {


    public static void main(String[] args) {
        Course mat= new Course("Matematik","MAT101","MAT");
        Course fizik=new Course("Fizik","FZK101","FZK");
        Course kimya=new Course("Kimya","KMY101","KMY");

        Teacher t1=new Teacher("Mahmut Hoca","0503323","MAT");
        Teacher t2=new Teacher("Fatma Ayşe","064546","FZK");
        Teacher t3=new Teacher("Ali veli","053513132","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Student s1=new Student("inek şaban", 4,"1234653",mat,fizik,kimya);
        s1.addBulkExamNote(50,60,20,80,90,64);
        s1.isPass();

        Student s2=new Student( "güdük necmi",3,"545430",mat,fizik,kimya);
        s2.addBulkExamNote(100,50,40,69,45,62);
        s2.isPass();

        Student s3=new Student("hayta ismail",2,"513132",mat,fizik,kimya);
        s3.addBulkExamNote(50,65,45,12,20,40);
        s3.isPass();



    }
}
