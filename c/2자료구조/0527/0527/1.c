
#include <stdio.h>

// �迭�� �Ѱ�
// 1. �迭�� ũ��(����) ������ ����
// 2. �迭�� ������ �Ѿ ��츦 �� �� ����
// 3. �迭�� ũ�⸦ ������ �� ����
#define ARR_SIZE(a)		(sizeof((a))/sizeof(*(a)))
void printArray(const int arr[]) {	// void printArray(const int *arr) {
	for (int i = 0; i < ARR_SIZE(arr); i++)
		printf("%d ", arr[i]);
	printf("\n");
}

int main() {
	//            0 1 2 3 4
	int arr[] = { 1,2,3,4,5 };

	// for (int i = 0; i < 5; i++)
	//for (int i = 0; i < ARR_SIZE(arr); i++)
	//	printf("%d ", arr[i]);
	//printf("\n");
	printArray(arr);

	arr[5] = 10;	// ??
}