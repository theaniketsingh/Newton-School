#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main(){
    double len;
    cin >> len;
    double marks;
    for(int i=0; i<len; i++){
        double mark;
        cin >> mark;
        marks = marks + (mark*mark); 
    }
    double mean = marks/len;
    double result = sqrt(mean);
    cout << fixed << setprecision(6);
    cout << result;
    return 0;
}