#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    string words[3];

    cout << "Enter three words:" << endl;
    cin >> words[0] >> words[1] >> words[2];

    bool ascending = true;
    bool descending = true;
    bool equivalent = true;

    for(int i = 0; i < 2; i++){
        if (words[i] != words[i + 1])
        {
            equivalent = false;
        }
        if (words[i+1] > words[i])
        {
            descending = false;
        }
        if (words[i] > words[i+1])
        {
            ascending = false;
        }
    }

    if (equivalent)
    {
        cout << "Your words are all equal!" << endl;
    }
    else if (descending)
    {
        cout << "Your words are in reverse lexicographical order!" << endl;
    }
    else if (ascending)
    {
        cout << "Your words are in lexicographical order!" << endl;
    }

}