#include <stdio.h>
#include <stdlib.h>

// step 5. ���� �ڷᱸ���� �ڷᱸ���� ���ؽ�Ʈ�� �����ϱ� ���� ���� �޸𸮸� ����ϰ� �ִٴ�
// ������ �ֽ��ϴ�. �̸� �ذ��ϱ� ���� ���� ����ü�� ���� �����ϵ��� �մϴ�.
typedef struct Array {
	int contents[5];
	int size;
	int count;
} Array;

//int arrayInitiate(Array* array) {
int arrayCreate(Array **array) {
	if (array == NULL) {
		fprintf(stderr, "arrayAdd: argument is null\n");
		return -1;
	}

	Array* temp = malloc(sizeof(Array));
	if (temp == NULL) {
		perror("malloc");
		return -1;
	}

	temp->count = 0;
	temp->size = 5;
	*array = temp;
	return 0;
}

void arrayDestroy(Array* array) {
	if (array == NULL)
		return;
	free(array);
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
	Array* arr;// Array arr;
	arrayCreate(&arr); //arrayInitiate(&arr);
	//----------------------------
	arrayDisplay(arr);
	for (int i = 0; i < 10; i++) {
		arrayAdd(arr, i + 1);
		arrayDisplay(arr);
	}
	//----------------------------
	arrayDestroy(arr);
}




