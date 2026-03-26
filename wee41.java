#include <iostream>
using namespace std;

// Method to calculate Simple Interest
float calculateSI(float principal, float rate, float time)
{
    return (principal * rate * time) / 100;
}

int main()
{
    float principal, rate, time, simpleInterest;

    // Taking user input
    cout << "Enter Principal: ";
    cin >> principal;

    cout << "Enter Rate of Interest: ";
    cin >> rate;

    cout << "Enter Time: ";
    cin >> time;

    // Calling method
    simpleInterest = calculateSI(principal, rate, time);

    // Output
    cout << "The Simple Interest is " << simpleInterest
         << " for Principal " << principal
         << ", Rate of Interest " << rate
         << " and Time " << time << endl;

    return 0;
}