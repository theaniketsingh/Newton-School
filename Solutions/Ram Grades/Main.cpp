#include <iostream>
using namespace std;

int main(){
    int marks = 0;
    for(int i=0; i<4; i++){
        int perSubjectMarks;
        cin >> perSubjectMarks;
        marks = marks + perSubjectMarks;
    }
    cout << (marks/4);
    return 0;
}