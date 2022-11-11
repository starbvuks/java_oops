#include <iostream>
using namespace std;
int main()
{
    int n, r, count = 0, temp;
    cout << "Number: ";
    cin >> n;
    temp = n;
    while (n > 0)
    {
        r = n % 10;
        count = (count * 10) + r;
        n = n / 10;
    }
    if (temp == count)
        cout << temp << " is a palindrome.";
    else
        cout << temp << " is not palindrome.";
    return 0;
}