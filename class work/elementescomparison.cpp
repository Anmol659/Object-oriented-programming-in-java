#include <iostream>
#include <climits>  // Include this header for INT_MIN and INT_MAX
using namespace std;

// Function to find the maximum value in the array
int getMax(int num[], int n) {
    int max = INT_MIN;
    for (int i = 0; i < n; i++) {
        if (num[i] > max) {
            max = num[i];
        }
    }
    return max;  // Move return outside the loop
}

// Function to find the minimum value in the array
int getMin(int num[], int n) {
    int min = INT_MAX;
    for (int i = 0; i < n; i++) {
        if (num[i] < min) {
            min = num[i];
        }
    }
    return min;
}

int main() {
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;

    int num[100];

    // Taking input
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < size; i++) {
        cin >> num[i];
    }

    cout << "Maximum value is " << getMax(num, size) << endl;
    cout << "Minimum value is " << getMin(num, size) << endl;
    
    return 0;
}
