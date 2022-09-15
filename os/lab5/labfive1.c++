#include <iostream>
using namespace std;

int max(int, int);
int main()
{
    int num1 = 100;
    int num2 = 200;
    int largest;

    largest = max(num1, num2);
    cout << "Max value is: " << largest << endl;
    return 0;
}
int max(int n1, int n2)
{
    if (n1 > n2)
    {
        if (n1 > n2)
            return n1;
        else
            return n2;
    }
}