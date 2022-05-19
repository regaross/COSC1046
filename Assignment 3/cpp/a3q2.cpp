#include <iostream>
#include <iomanip>
using namespace std;

int main(){

    int input = 0;
    

    while (input <=0 || input > 10)
    {
        cout << "Enter an integer between 1 and 10 inclusive: ";
        cin >> input;
    }

    for (size_t i = 1; i < input + 1; i++)
    {
        for (size_t j = 1; j < input + 1; j++)
        {
            cout << i*j << "\t";
        }
        cout << endl;
    }
    


}

