
// 2���� �迭�� ������
#include <stdio.h>

int main() {
	int arr1[6] = { 1,2,3,4,5,6 };		// ������ ����: 6
	int* p1 = arr1;

	int arr2[2][3] = { {1,2,3}, {4,5,6} };		// ������ ����: 6
	int(*p2)[3] = arr2;

	int arr3[1][2][3];
	int (*p3)[2][3] = arr3;

	return 0;
}