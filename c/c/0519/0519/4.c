#define _CRT_SECURE_NO_WARNINGS

#if 0
// Ÿ�� ���ڵ� ���: typedef ���� Ÿ�� ���οĪ
typedef unsigned int size_t;
typedef int(*arr_t)[3];

// ������ �迭�� ����


//int(*)[3] foo() {
// int(*foo())[3] {
arr_t foo(int row, int col) {
	int arr[2][3];
	return arr;
}

int main() {
	int(*p)[3] = foo();
}
#endif



// ��� ���� �������� ���� ���� Ÿ���� 2���� �迭�� �����ϴ� ���̺귯���� ������
// ���ô�.
#include <stdlib.h>
#include <stdio.h>
int** createArray(int row /* = 3 */, int col /* = 4 */) {
    int** p = malloc(sizeof(int*) * row);
    for (int i = 0; i < row; i++)
        p[i] = malloc(sizeof(int) * col);
    return p;
}

void freeArray(int** arr, int row) {
    // ������ ������ �������� ó���ؾ� �մϴ�.
    for (int i = 0; i < row; i++)
        free(arr[i]);
    free(arr);
}

int main() {
    int** arr = createArray(2, 3);
    int cnt = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++)
            arr[i][j] = ++cnt;
    }
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++)
            printf("%d ", arr[i][j]);
        printf("\n");
    }
}



















