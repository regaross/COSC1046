#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    string name = "Regan";
    int grad_year = 2022;
    float salary = 1000000.0f;

    cout << "Hi my name is " << name << ".\n";
    cout << "I have just graduated. The year is " << grad_year << ".\n";
    cout << fixed << setprecision(1) << "I hope to make at least $" << salary << " a year at some point."; 
}