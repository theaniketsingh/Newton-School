import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int F = scan.nextInt();
        F = F - 32;
        int C = (F * 5)/9;
        System.out.print(C);
    }
}