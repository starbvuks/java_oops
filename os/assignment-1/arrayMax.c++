#include <iostream>
using namespace std;

int main()
{

    int i, n;
    float arr[100];

    cout << "Enter total number of elements: ";
    cin >> n;
    cout << endl;

    for (i = 0; i < n; ++i)
    {
        cout << "Enter Number " << i + 1 << " : ";
        cin >> arr[i];
    }

    for (i = 1; i < n; ++i)
    {

        if (arr[0] < arr[i])
            arr[0] = arr[i];
    }

    cout << endl
         << "Largest element is = " << arr[0];

    return 0;
}
