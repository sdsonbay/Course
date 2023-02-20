public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher teacher1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher teacher2 = new Teacher("Ayşe Hoca", "90550000001", "FZK");
        Teacher teacher3 = new Teacher("Ali Hoca", "90550000002", "KMY");

        mat.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        kimya.addTeacher(teacher3);

        Student student1 = new Student("İnek Şaban", 4, "255", mat, fizik, kimya);
        student1.addBulkExamNote(50, 20, 40);
        student1.addVerbalExamNote(100, 100, 100);
        student1.isPass();

        Student student2 = new Student("Güdük Necmi", 4, "277", mat, fizik, kimya);
        student2.addBulkExamNote(100, 50, 40);
        student2.addVerbalExamNote(80, 70, 100);
        student2.isPass();

        Student student3 = new Student("Hayta İsmail", 4, "312", mat, fizik, kimya);
        student3.addBulkExamNote(50, 20, 40);
        student3.addVerbalExamNote(40, 50, 50);
        student3.isPass();
    }
}
