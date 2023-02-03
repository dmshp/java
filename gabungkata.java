package aaaaa;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

public class gabungkata {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word1 = "";
        String word2 = "";
        String word3 = "";

        System.out.println("Please Enter ur first name : ");
        try {
            word1 = input.readLine();
        }
        catch (IOException e) {
            System.out.println("Error!!!");
        }

        System.out.println("Please Enter ur second name : ");
        try {
            word2 = input.readLine();
        }
        catch (IOException e) {
            System.out.println("Error!!!");
        }

        System.out.println("Please Enter ur third name : ");
        try {
            word3 = input.readLine();
        }
        catch (IOException e) {
            System.out.println("Error!!!");
        }

        System.out.println( word1 + " " + word2+ " " + word3 );
    }
}
