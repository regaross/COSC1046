#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <ctime>

using namespace std;

int main(){

    // Collect the system time
    unsigned seed = time(0);

    // Use system time as seed for rng
    srand(seed);

    // for dice rolls
    int min = 1;
    int max = 6;

    int rolls[11] = {0};
    int num_rolls;
    int die_1;
    int die_2;

    cout << "How many rolls?" << endl;
    cin >> num_rolls;

    for (size_t i = 0; i < num_rolls; i++)
    {
        die_1 = (rand() % (max - min + 1)) + min;
        die_2 = (rand() % (max - min + 1)) + min;

        rolls[die_1 + die_2 - 2] ++ ;
    }
    
    cout << "Stats: \n" << endl;
    cout << "2: \t" << rolls[0] << "\t" << 100*rolls[0]/num_rolls << "\%" << endl;
    cout << "3: \t" << rolls[1] << "\t" << 100*rolls[1]/num_rolls << "\%" << endl;
    cout << "4: \t" << rolls[2] << "\t" << 100*rolls[2]/num_rolls << "\%" << endl;
    cout << "5: \t" << rolls[3] << "\t" << 100*rolls[3]/num_rolls << "\%" << endl;
    cout << "6: \t" << rolls[4] << "\t" << 100*rolls[4]/num_rolls << "\%" << endl;
    cout << "7: \t" << rolls[5] << "\t" << 100*rolls[5]/num_rolls << "\%" << endl;
    cout << "8: \t" << rolls[6] << "\t" << 100*rolls[6]/num_rolls << "\%" << endl;
    cout << "9: \t" << rolls[7] << "\t" << 100*rolls[7]/num_rolls << "\%" << endl;
    cout << "10: \t" << rolls[8] << "\t" << 100*rolls[8]/num_rolls << "\%" << endl;
    cout << "11: \t" << rolls[9] << "\t" << 100*rolls[9]/num_rolls << "\%" << endl;
    cout << "12: \t" << rolls[10] << "\t" << 100*rolls[10]/num_rolls << "\%" << endl;



}