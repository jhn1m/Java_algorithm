/*
While signing up for the site, Jun-ha was surprised to see that the ID "Joonas" already existed.
Junha expresses surprise in ??! Write a program that expresses surprise 
when given an ID that already exists on the site Junha is trying to join.

Input
In the first line, an ID that already exists on the site where Junha is trying to join is given.
The ID consists of only lowercase alphabetic characters, and the length does not exceed 50 characters.

Output
Output a subsequent surprise on the first line. Surprise is indicated by attaching ??! after the ID.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        System.out.println(text + "??!");
    }
}
