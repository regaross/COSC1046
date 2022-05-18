/*
Prompts user to enter three number grades and outputs the mean and letter grade.
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main(){

    cout << "Please enter three grades:\n";
    float marks[3];
    cin >> marks[0] >> marks[1] >> marks[2];

    float sum = 0;
    for(int i = 0; i < 3; i++){
        sum += marks[i];
    }

    float avg = sum/3;
    string letter;

    if(90 <= avg){letter = "A+";}
    else if(80 <= avg && avg < 90){letter = "A";} 
    else if(70 <= avg && avg < 80){letter = "B";} 
    else if(60 <= avg && avg < 70){letter = "C";} 
    else if(50 <= avg && avg < 60){letter = "D";} 
    else {letter = "FAIL!";}

    cout << fixed << setprecision(1) << "Mean grade: " << avg << " or " + letter << endl; 

}