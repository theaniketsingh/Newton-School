#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main(){
    double a, b, c;
    cin >> a >> b >> c;
    double determinant = b * b - 4 * a * c;
    double root1;
    double root2;
    int cases;
    if(determinant > 0){
        cases = 1;
    }else if(determinant == 0){
        cases = 2;
    }else{
        cases = 3;
	}

    switch(cases){
        case 1:
        root1 = (-b + sqrt(determinant)) / (2 * a);
        root2 = (-b - sqrt(determinant)) / (2 * a);
        cout << fixed << setprecision(2) << root1 << endl;
        cout << fixed << setprecision(2) << root2;
        break;
        case 2:
        root1 = -b / (2 * a);
        root2 = root1;
        cout << fixed << setprecision(2) << root1 << endl;
        cout << fixed << setprecision(2) << root2;
        break;
        case 3:
        double real = -b / (2 * a);
        double imaginary = sqrt(-determinant) / (2 * a);
        cout << fixed << setprecision(2) << real << "+i" << fixed << setprecision(2) << imaginary << endl;
        cout << fixed << setprecision(2) << real << "-i" << fixed << setprecision(2) << imaginary;
        break;
    }
}