#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    
    string words[3];

    cout << "Enter three words:" << endl;
    cin >> words[0] >> words[1] >> words[2];

    int first, second, third;

    first = 0;
    second = 0;
    third = 0;

    for (size_t i = 0; i < 3; i++)
    {
        if (words[i] < words[first])
        {
            first = i;
        }
        if (words[i] > words[third])
        {
            third = i;
        }
    }

    second = 3 - (first + third);

    cout << words[first] << "\n" << words[second] << "\n" << words[third] << endl;
    
}