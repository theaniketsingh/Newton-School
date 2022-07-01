#include <iostream>
using namespace std;

int main(){
    int A,B;
    cin >> A >> B;
    string Cond1 = (A <= 10 && B >= 10) ? "true" : "false";
    string Cond2 = (A%2==0 || B%2==0) ? "true" : "false";
    string Cond3 = (A!=B) ? "true" : "false";
    cout << Cond1 << " " << Cond2 << " " << Cond3;
    return 0;
}