#include <iostream>
using namespace std;

int main(){
    int assum = 2;
    int A, B;
    cin >> A >> B;
    assum = assum+A;
    assum = assum*2;
    assum = assum+B;
    assum = assum/2;
    assum = assum-2;
    cout << assum;
    return 0;
}