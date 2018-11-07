package lesson7.homework;

public class main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil(1324);
        String ex[] = {"Математика","Биология"};
        int marks[] = { 5, 2 };

        String ex2[] = {"Физика","Byajhvfnbrf"};
        int marks2[] = { 6, 3 };


        pupil.addExams(ex, marks);
        System.out.println(pupil);
        pupil.addExams(ex2,marks2);
        System.out.println(pupil);

    }
}
