#include <stdio.h>
#include <stdlib.h>	// system()

// step 1. ������ �����ϴ� �迭�� ������ ���ô�.
int arr[5];
int size = 5;
int count;	// �迭 ���� ������ ���� & ������ ���� ��ġ

int arr1[5];
int size1 = 5;
int count1;	// �迭 ���� ������ ���� & ������ ���� ��ġ

// �ٸ� ���̺귯���� �ɺ��� �浹�� ���� ���� ���������� ���̺귯�� �̸���
// ���ξ�� ����մϴ�.
int arrayAdd(int data) {
	// �迭�� ���� á������ ����
	if (count == size)
		return -1;
	arr[count++] = data;
	return 0;
}

int arrayAdd(int data) {
	// �迭�� ���� á������ ����
	if (count1 == size1)
		return -1;
	arr1[count1++] = data;
	return 0;
}

// ����� �ڵ�
void arrayDisplay() {
	system("cls");	// cls: �����쿡�� ȭ���� ����� ��ɾ�
					// clear: ���������� ȭ���� ����� ��ɾ�

	for (int i = 0; i < size; i++) {
		if (i < count)
			printf("[%2d]", arr[i]);
		else
			printf("[%2c]", ' ');
	}
	getchar();
}

int main() {
	arrayDisplay();
	for (int i = 0; i < 10; i++) {
		arrayAdd(i + 1);
		arrayDisplay();
	}
}




