package Lesson4;

public class Student {
    int id;
    String surname;
    String name;
    byte year;
    double mathscore;
    double ecscore;
    double langscore;


}

class StudentTest {
    public static void main (String [] agrs){

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.id = 1259;
        st1.surname = "Makhankov";
        st1.name = "Yury";
        st1.year = 32;
        st1.mathscore = 5;
        st1.ecscore = 4;
        st1.langscore = 4;




        st2.id = -99;
        st2.surname = "Tolstyh";
        st2.name = "Egor";
        st2.year= 20;
        st2.mathscore= 5;
        st2.ecscore= 4;
        st2.langscore=3;



        st3.id= +325;
        st3.surname="Belova";
        st3.name="Nataliya";
        st3.year=29;
        st3.mathscore=10;
        st3.ecscore=13;
        st3.langscore= 12;



        System.out.println ("Средняя арифметическая оценка " + st1.name+ " " +st1.surname + " = " +(st1.mathscore+ st1.ecscore+ st1.langscore) /3);
        System.out.println ("Средняя арифметическая оценка " + st2.name+ " " +st2.surname + " = " +(st2.mathscore+ st2.ecscore+ st2.langscore) /3);
        System.out.println ("Средняя арифметическая оценка " + st3.name+ " " +st3.surname + " = " +(st1.mathscore+ st3.ecscore+ st3.langscore) /3);










    }



}

































