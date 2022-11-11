#include <iostream>
using namespace std;

int main()
{
    int y, d, w;

    cout << "Days: ";
    cin >> d;

    y = d / 365;
    d = d % 365;
    w = d / 7;
    d = d % 7;

    cout << "\nYears: " << y << "\tWeeks: " << w << "\tDays: " << d;
    return 0;
}