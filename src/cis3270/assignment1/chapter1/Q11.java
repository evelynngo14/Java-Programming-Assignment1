//(Population projection) The U.S. Census Bureau projects population based on the
//following assumptions:
//■ One birth every 7 seconds
//■ One death every 13 seconds
//■ One new immigrant every 45 seconds
//Write a program to display the population for each of the next five years. Assume the
//current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
//integers perform division, the result is an integer. The fractional part is truncated. For
//example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
//the fractional part, one of the values involved in the division must be a number with a
//decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

package cis3270.assignment1.chapter1;

public class Q11 {
    public static void main(String[] args) {

        int BasePopulation;
        int SecondsPerYear;
        double NewPopulation;
        BasePopulation = 312032486;
        SecondsPerYear = 3600 * 24 * 365;

        for (int i = 1; i <= 5; i++) {
            NewPopulation = ((SecondsPerYear / 7.0) - (SecondsPerYear / 13.0) + (SecondsPerYear / 45.0)) * i;
            System.out.println("The population in " + i + " year(s) is " + ((int)NewPopulation + BasePopulation));
        }

    }
}
