// 2.c�� ��� �ڵ带 ������ ������ 
#include <stdio.h>
#include <stdlib.h>	// system()

// step 2. ���� �ڷᱸ���� �߰��� �� �����ϳ� 2�� �̻��� �ڷᱸ���� ���� �� ���ٴ�
// ������ �ֽ��ϴ�. �̴� �Լ��� ���� �ɺ��� ���������� ����ϰ� �ֱ� �����Դϴ�.
// ���� �� ������ �ذ��ϱ� ���� ���� �ɺ��� ���� �ɺ��� �����Ͽ� ó���մϴ�.
int arrayAdd(int *arr, int size, int *count, int data) {
	if (*count == size)
		return -1;
	arr[(*count)++] = data;
	return 0;
}

void arrayDisplay(const int *arr, int size, int count) {
	system("cls");
	for (int i = 0; i < size; i++) {
		if (i < count)
			printf("[%2d]", arr[i]);
		else
			printf("[%2c]", ' ');
	}
	getchar();
}

int main() {
	// ���� 2�� �̻��� �ڷᱸ���� ������ �� �ֽ��ϴ�.
	int arr[5];
	int size = 5;
	int count = 0;
	arrayDisplay(arr, size, count);
	for (int i = 0; i < 10; i++) {
		arrayAdd(arr, size, &count, i + 1);
		arrayDisplay(arr, size, count);
	}

	int arr1[5];
	int size1 = 5;
	int count1 = 0;
	arrayDisplay(arr1, size1, count1);
	for (int i = 0; i < 10; i++) {
		arrayAdd(arr1, size1, &count1, i + 10);
		arrayDisplay(arr1, size1, count1);
	}
}




