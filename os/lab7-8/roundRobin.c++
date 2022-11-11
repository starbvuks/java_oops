#include <iostream>
using namespace std;

void findwt(int p[], int n, int bt[], int wt[], int q)
{
    int rem_bt[n];
    for (int i = 0; i < n; i++)
    {
        rem_bt[i] = bt[i];
    }

    int t = 0;

    while (1)
    {
        bool done = true;

        for (int i = 0; i < n; i++)
        {
            if (rem_bt[i] > 0)
            {
                done = false;

                if (rem_bt[i] > q)
                {
                    t += q;
                    rem_bt[i] -= q;
                }

                else
                {
                    t += rem_bt[i];
                    wt[i] = t - bt[i];
                    rem_bt[i] = 0;
                }
            }
        }

        if (done == true)
            break;
    }
}

void findtat(int p[], int n, int bt[], int wt[], int tat[])
{
    for (int i = 0; i < n; i++)
    {
        tat[i] = bt[i] + wt[i];
    }
}

void findavg(int p[], int n, int bt[], int q)
{
    int wt[n], tat[n], totalw = 0, totalt = 0;
    findwt(p, n, bt, wt, q);
    findtat(p, n, bt, wt, tat);

    cout << "PN\t"
         << "\tBT"
         << "\t\tWT"
         << "\t\tTAT\n";

    for (int i = 0; i < n; i++)
    {
        totalw += wt[i];
        totalt += tat[i];

        cout << i + 1 << "\t\t" << bt[i] << "\t\t" << wt[i] << "\t\t" << tat[i] << endl;
    }

    cout << "\nAverage Waiting time: " << (float)(float)totalw / (float(n));
    cout << "\nAverage Turn around time: " << (float)(float)totalt / (float(n));
}

int main()
{
    int p[] = {1, 2, 3, 4};
    int n = sizeof(p) / sizeof(p[0]);

    int bt[] = {10, 5, 8};

    int q = 2;

    findavg(p, n, bt, q);
    return 0;
}