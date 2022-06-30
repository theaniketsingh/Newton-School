#include <iostream>
using namespace std;

string checkConevrtion(int a){
    string str = to_string(a);
    return str;
}

int main() {
    int a;
    cin >> a;
    if(typeid(checkConevrtion(a))==typeid(string)){
        cout << "Nice Job";
    }else{
        cout << "Wrong answer";
    }
    return 0;
}