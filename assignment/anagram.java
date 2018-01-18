/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skcet
 */
import java.util.Arrays;
import java.util.Scanner;

class Anagram {

    public static void main(String[] args) {
        System.out.println("Enter the 2 strings to check Anagram : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.replaceAll(" ", "").length() == s1.replaceAll(" ", "").length()) {
            char[] c1 = s1.toLowerCase().toCharArray(); 
            char[] c2 = s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("The input strings are Anagram");
            } else {
                System.out.println("The input strings are not Anagram");
            }

        } else {
            System.out.println("The input strings are not Anagram");
        }
    }
}
