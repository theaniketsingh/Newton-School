import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int marks = 0;
        for(int i=0; i<4; i++){
            int mark = scan.nextInt();
            marks = marks+mark;
        }
        System.out.print(marks/4);
    }
}