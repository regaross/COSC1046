#include <iostream>
#include <iomanip>

using namespace std;

int main(){
    
    int size = 0; 
    
    while (size < 2 || size > 12)
    {
        cout << "Enter a number between 2 and 12:" << endl;
        cin >> size;
    }

    int array[size];

    cout << "Okay, now fill the array." << endl;
    int input;
    for (size_t i = 0; i < size; i++)
    {
        cout << "For index " << i << ":" << endl;
        cin >> input;
        array[i] = input;
    }

    // Now we have the filled array- we need to print its information
    int element;

    // Print in order & determination of maximum
    int max = array[0];
    int max_index = 0;
    cout << "Forward print: " << endl;
    for (size_t i = 0; i < size; i++)
    {   
        element = array[i];
        if (i == size - 1)
        {
            cout << element;
        }
        else{ cout << element << ", ";}

        if (array[i] > max)
        {
            max = array[i];
            max_index = i;
        }
    }

    cout << endl;

    // Reverse order print
    cout << "Reverse print: " << endl;
    for (size_t i = size; i > 0; i--)
    {   
        element = array[i - 1];
        if (i == 1)
        {
            cout << element ;
        }
        else{ cout << element << ", ";}
    }
    
    cout << "\nMax: " << max << " Index: " << max_index << endl;

}