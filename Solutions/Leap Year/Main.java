import java.util.*;
class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LeapYear(n);
    }
    static void LeapYear(int year){
        if(year%4==0 && year%100!=0){
            System.out.print("YES");
        }else if(year%400==0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}