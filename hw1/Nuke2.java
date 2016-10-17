package hw1;

import java.io.*;

public class Nuke2 {

    public static void main(String[] args) throws IOException { 
        
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a word: ");
        String input = scan.readLine();
        
        String word = input.substring(0,1) + input.substring(2);
        System.out.println(word);
        
    }
}
