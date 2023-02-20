public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPassed;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        caclAverage();
        this.isPassed = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }
        if(kimya >= 0 && kimya <= 100){
            this.kimya.note = kimya;
        }
    }

    public void addVerbalExamNote(int mat, int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.mat.verbalNote = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.verbalNote = fizik;
        }
        if(kimya >= 0 && kimya <= 100){
            this.kimya.verbalNote = kimya;
        }
    }

    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.verbalNote == 0 || this.fizik.verbalNote == 0 ||this.kimya.verbalNote == 0){
            System.out.println("Notlar tam olarak girilmemiş.");
        }else{
            this.isPassed = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);

            if(this.isPassed){
                System.out.println("Sınıfı geçti.");
            }else{
                System.out.println("Sınıfta kaldı.");
            }
        }
    }

    public void caclAverage(){
        double examAverge = ((double) this.mat.note + this.fizik.note + this.kimya.note) / 3;
        double verbalAverage = ((double) this.mat.verbalNote + this.fizik.verbalNote + this.kimya.verbalNote) / 3;
        this.average = (examAverge * 0.8D) + (verbalAverage * 0.2D);
    }

    public boolean isCheckPass(){
        caclAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("================================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Sınav Notu: " + this.mat.note);
        System.out.println("Matematik Sözlü Notu: " + this.mat.verbalNote);
        System.out.println("Fizik Sınav Notu: " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu: " + this.fizik.verbalNote);
        System.out.println("Kimya Sınav Notu: " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu: " + this.kimya.verbalNote);
    }
}
