//(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the fol-
//lowing 2 * 2 system of linear equation:
//ax + by= e
//ed- bf
//x =
//cx + dy= f
//ad- bc
//y=
//af- ec
//ad- bc
//Write a program that solves the following equation and displays the value for x and y:
//3.4x + 50.2y= 44.5
//2.1x + .55y= 5.9


package cis3270.assignment1.chapter1;

public class Q13 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double x;
        double y;

        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;

        x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
        y = (((a * f) - (e * c)) / ((a * d) - (b * c)));

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
