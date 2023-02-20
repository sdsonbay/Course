public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    int verbalNote;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println("İşlem başarılı.");
        }else {
            System.out.println(teacher.name + " isimli akademisyen bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
        }else {
            System.out.println(this.name + " dersine bir akademisyen atanmamıştır.");
        }
    }
}
