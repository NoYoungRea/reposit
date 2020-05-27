#include <stdio.h>
#include <stdlib.h>

// step 4. ���� �ڷᱸ���� �ڷᱸ�� ���� ��, ���� �����Ͱ� �ʱ�ȭ���� �ʴ´ٴ�
// ������ �ֽ��ϴ�. �̸� �ذ��ϱ� ���� �ڷᱸ���� �ʱ�ȭ�ϴ� �Լ��� �߰��մϴ�.
typedef struct Array {
	int contents[5];
	int size;
	int count;
} Array;

int arrayInitiate(Array* array) {
	if (array == NULL) {
		fprintf(stderr, "arrayAdd: argument is null\n");
		return -1;
	}
	array->count = 0;
	array->size = 5;
	return 0;
}

int arrayAdd(Array* array, int data) {
	if (array == NULL) {
		fprintf(stderr, "arrayAdd: argument is null\n");
		return -1;
	}

	if (array->count == array->size)
		return -1;

	array->contents[array->count] = data;
	++(array->count);
	return 0;
}

void arrayDisplay(const Array* array) {
	system("cls");
	for (int i = 0; i < array->size; i++) {
		if (i < array->count)
			printf("[%2d]", array->contents[i]);
		else
			printf("[%2c]", ' ');
	}
	getchar();
}

int main() {
	Array arr1;
	arrayInitiate(&arr1);

	arrayDisplay(&arr1);
	for (int i = 0; i < 10; i++) {
		arrayAdd(&arr1, i + 1);
		arrayDisplay(&arr1);
	}
}




