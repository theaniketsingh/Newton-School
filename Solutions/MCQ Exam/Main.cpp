#include <iostream>
using namespace std;

int main(){
    int P, Q, R, S;
    cin >> P >> Q >> R >> S;
    if(P>=Q && P>=R && P>=S){
        cout << P;
    }else if(Q>=P && Q>=R && Q>=S){
        cout << Q;
    }else if(R>=P && R>=Q && R>=S){
        cout <<R;
	}else if(S>=Q && S>=R && S>=P){
        cout << S;
    }
    return 0;
}