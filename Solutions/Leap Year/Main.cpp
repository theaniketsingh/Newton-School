#include <iostream>
using namespace std;

void LeapYear(int year){
    if(year%4==0 && year%100!=0){
        cout << "YES";
    }else if(year%400==0){
        cout << "YES";
    }else{
        cout << "NO";
    }
}

int main(){
    int n;
    cin >> n;
    LeapYear(n);
}