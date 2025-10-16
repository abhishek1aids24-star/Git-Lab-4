#include <stdio.h>


long factorial(int n) {
    long result = 1;
    for (int c = 1; c <= n; c++) {
        result = result * c;
    }
    return result;
}

int main() {
    int rows, i, c;

    printf("Enter the number of rows for Pascal's Triangle: ");
    scanf("%d", &rows);
 // Calculate and print the numbers in each row
    for (i = 0; i < rows; i++) {
      // Calculate and print the numbers in each row
        for (c = 0; c <= (rows - i - 2); c++) {
            printf(" ");
        }

       
        for (c = 0; c <= i; c++) {
            long value = factorial(i) / (factorial(c) * factorial(i - c));
            printf("%ld ", value);
        }
        printf("\n"); // Move to the next line after each row
    }

    return 0;
}
