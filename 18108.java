/*
The question.
Tim Redshift party, who had just arrived at Suvarnabhumi International Airport to participate in
the ICPC Bangkok Regional, could not believe the snow. The airport's large screen said this year was 2562.

Thailand, a Buddhist country, uses Buddhist prayer of immortality, that is,
Buddhist prayer that counts the year based on the Nirvana year of Sakyamuni.
On the other hand, Korea is using the year of the AD. Write a program that converts it
into a standing year when given a blowing year.

Input
You will be given the year y of Bulgi, which you want to find out about the year of the Clerk. (1000 ≤ y ≤ 3000)

Output
Outputs the result of converting the blowing year to the standing year.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if (year <= 3000 || year >= 1000) {
            System.out.println(year - 543);
        }
    }
}
