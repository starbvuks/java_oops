#include <iostream>
using namespace std;

int main()
{

    int n, r = 0, remainder;

    cout << "Number: ";
    cin >> n;

    while (n != 0)
    {
        remainder = n % 10;
        r = r * 10 + remainder;
        n /= 10;
    }

    cout << "Reversed Number = " << r;

    return 0;
}