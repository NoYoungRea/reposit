
#include <stdio.h>

// �迭�� ũ�⸦ ���� ��, �����͸� sizeof�� �ǿ����ڷ� ������� �ʴ� ���� �����ϴ�.

void print_arr(int arr[], int len) {	// void print_arr(int *arr) {
	//for (int i = 0; i < sizeof(arr) / sizeof(*arr); i++)
	for (int i = 0; i < len; i++)
		printf("%d ", arr[i]);
}

int main() {
	int arr[] = { 1, 2, 3, 4, 5 };	// int arr[1024];
	for (int i = 0; i < sizeof(arr) / sizeof(*arr); i++)
		printf("%d ", arr[i]);
	printf("\n");

	// �迭���� ũ�� ������ �����Ƿ� �Լ��� ���� ��, ũ�� ������ ���� �����ؾ� �մϴ�.
	print_arr(arr, 5);	// print_arr(0x12FF60);
}