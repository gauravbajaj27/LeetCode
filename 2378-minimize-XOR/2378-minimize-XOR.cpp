#include <bits/stdc++.h>

using namespace std;

int countSetBits(int num) {
    int ans = 0;
    while(num) {
        ans += num & 1;
        num = num >> 1;
    }
    return ans;
}

int minimizeXor(int num1, int num2) {
    int n1 = countSetBits(num1), n2 = countSetBits(num2);
    if (n1 == n2) {
        return num1;
    } else if (n1 < n2) {
        int x = n2 - n1;
        int ans = num1, temp = 1;
        while (x) {
            if (!(num1 & temp)) {
                ans = ans | temp;
                x--;
            }
            temp = temp << 1;
        }
        return ans;
    } else {
        int x = n1-n2;
        int ans = num1, temp =1;
        while (x) {
            if (num1 & temp) {
                ans = ans ^ temp;
                x--;
            }
            temp = temp << 1;
        }
        return ans;
    }
}

int main(void) {
    int num1, num2;
    cout << "Enter num 1: ";
    cin >> num1;
    cout << "Enter num 2: ";
    cin >> num2;
    int res = minimizeXor(num1, num2);
    cout << "Result is: " << res << "\n";
    return 0;
}