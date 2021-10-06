package project1_StudentAutomation;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int noteSozlu;

    public Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.noteSozlu=0;
    }
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            System.out.println("İşlem Başarılı Öğretmen eklendi");
            printTeacher();

        }
        else {
            System.out.println(t.name+" Akadem,syen bu dersi veremez. Branşı değil");
        }

    }
    public void printTeacher(){
        if(courseTeacher!=null){
            System.out.println(this.name+" dersinin akdemisyeni: "+courseTeacher.name);
        }
        else {
            System.out.println(this.name+" dersinin akademisyen atanmıştır. ");

        }

    }


}
