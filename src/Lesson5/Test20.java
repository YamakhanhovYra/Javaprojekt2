package Lesson5;

public class Test20 {
    int summa(int a, int b, int c){
        int resoult= a+b+c;
        return resoult;
    }

    int sredneeArifm (int a1, int b1, int c1,){
        int result2= summa (a1, b1, c1)/3;
        return result2;

    }
}
    class Test21 {
    public static void main (String[] args){
    Test20 t= new Test20();
    int summatrehchisel= t.summa(1,2 ,3 );
    t.summa(1, 2, 3);
    System.out.println(summatrehchisel);
    System.out.println(t.summa(5, 10, 15));






        }
        }