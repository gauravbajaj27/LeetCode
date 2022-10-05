#include <bits/stdc++.h>

using namespace std;

int commonFactors(int a, int b) {
    int count = 0;
    for (int i = 1; i <= min(a,b); i++) {
        if (a % i == 0 && b % i == 0) {
            count++;
        }
    }
    return count;
}

int main(void) {
    int num1, num2;
    cout << "Enter num1: ";
    cin >> num1;
    cout << "Enter num2: ";
    cin >> num2;
    int totalCommonFac = commonFactors(num1, num2);
    cout << "Total Common Factors are: " << totalCommonFac << "\n";
}