#include <iostream>
using namespace std;

int main(){
    int A,B,C,X;
    cin >> A >> B >> C;
    cin >> X;
    int result = (A*(X*X))+(B*X)+C;
    cout << result;
    return 0;
}