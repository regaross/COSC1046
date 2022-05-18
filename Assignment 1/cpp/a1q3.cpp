#include <iostream>
using namespace std;


double factorial(int x){
    if(x <= 1){
        return 1;
    }
    else{
        return x*factorial(x-1);
    }
}

int main(){

    // Product of the first 10 integers (10!)
    int ten_factorial = factorial(10); // narrowing conversion from double
    cout << ten_factorial << endl;

    // Product of the first 17 integers (INTEGER OVERLOAD)
    double seventeen_factorial = factorial(17);
    cout << seventeen_factorial << endl;


    // The rest are fairly trivial
}