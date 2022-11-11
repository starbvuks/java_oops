#include <iostream>
using namespace std;

int main()
{
    int age;

    cout << "Enter your age: ";
    cin >> age;

    if (age >= 18)
    {
        cout << "Person is eligible to cast a vote" << endl;
    }
    else
    {
        cout << "Person is not eligible to cast a vote" << endl;
    }

    return 0;
}