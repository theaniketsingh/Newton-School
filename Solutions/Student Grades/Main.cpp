#include <iostream>
using namespace std;

int main(){
    int marks = 0;
    for(int i=0; i<5; i++){
        int sub;
        cin >> sub;
        marks = marks + sub;
    }
    marks = (marks*100)/500;
    if(marks >= 80){
        cout << "A";
    }else if(marks <80 && marks >=60){
        cout << "B";
    }else if(marks <60 && marks >=40){
        cout << "C";
    }else{
        cout << "D";
    }
    return 0;
}