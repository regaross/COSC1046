#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;

int main(){

    cout << "Enter some numbers, negative to quit. " << endl;

    float input;

    float min, max, mean, range, product, sum;

    product = 1;
    
    cin >> input;
    int entries = 1;
    min = input;
    max = input;
    sum = input;

    while(input >= 0)
    {
        cin >> input;


        if (input < 0){ break;}
    
        else
        {
            entries ++;
            sum += input;
            product *= input;
            
            if (min > input){ min = input;}
            if (max < input){ max = input;}    
        }
    }

    mean = sum/entries;
    range = max - min;

    cout << fixed << setprecision(2) << "Statistics: \n" <<"N: " << entries << "\nMin: " << min << "\nMax: " 
        << max << "\nMean: " << mean << "\nRange: " << range << "\nSum: " << sum << "\nProduct: " << product;



}