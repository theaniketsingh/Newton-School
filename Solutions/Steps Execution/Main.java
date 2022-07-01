import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        input = input+8;
        input = input/3;
        input = input%5;
        input = input*5;
        System.out.print(input);
    }
}