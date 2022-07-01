#include <iostream>
using namespace std;

int main(){
    int num;
    cin >> num;
    
    if(num<0){
        num = -1;
    }else if(num>0){
        num = 1;
    }else if(num==0){
        num = 0;
    }

    switch(num){
        case -1:
        cout << "Negative";
        break;
        case 1:
        cout << "Positive";
        break;
        case 0:
        cout << "Zero";
        break;
    }
    return 0;
}