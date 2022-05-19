#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main(){
    cout << "Enter an integer to print primes less than that integer: ";
    int num;
    cin >> num;
    bool prime;
    
    cout << "Primes: " << endl;

    for (int i = 3; i < num; i += 2) // odd numbers only
    {   
        prime = true; // Assume it is prime

        for (int j = 3; j < int(sqrt(i) + 1); j += 2) // odd numbers only
        {
            if (j != i && i % j == 0) // make sure we're not dealing with the same number
            {
                prime = false; 
            }
            
        }

        if (prime)
        {
            cout << i << endl;
        }
        
    }
    
}