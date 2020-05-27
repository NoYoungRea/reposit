#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct _Array {
	int* arr;
	size_t size;
	size_t top;
}Array;
typedef int error_t;
#define INITIAL_SIZE (5)
#define MAX_SIZE	(4096)
#define OUT	
error_t arrayDestroy(Array* array);
Array* arrayCreate() {
	Array* array = calloc(1, sizeof(Array));//ㅇ
	if (array == NULL) {
		perror("arrayCreate");
		return NULL;
	}
	array->arr = malloc(sizeof(int) * INITIAL_SIZE);//x
	if (array->arr == NULL) {
		arrayDestroy(array);
		perror("arrayCreate");
		return NULL;
	}
	array->size = INITIAL_SIZE;//top은 자동으로 0 by calloc
	return array;

}
error_t arrayDestroy(Array* array) {
	if (array == NULL) {
		fprintf(stderr, "arrayDestroy:array is null\n");
		return -1;
	}
	//my
	if (array->arr == NULL) {
		fprintf(stderr, "arrayDestroy:arr is null,just remove array\n");
		memset(array, 0, sizeof(Array));
		free(array);
		array = NULL;
		return 0;
	}
	memset(array->arr, 0, sizeof(int) * array->size);
	free(array->arr);
	memset(array, 0, sizeof(Array));
	free(array);
	array = NULL;

	//my
	return 0;
}
int arrayCount(Array* array) {
	if (array == NULL) {
		fprintf(stderr, "arrayCount:array is null\n");
		return -1;
	}
	return array->top;
}
error_t increaseSize(Array* array, int size) {
	return 0;
}
error_t arrayDisplay(Array* array) {
	if (array == NULL) {
		fprintf(stderr, "arrayDisplay:array is null\n");
		return -1;
	}
	for (size_t i = 0; i < array->size; i++)
	{
		if (i < array->top)
			printf("[%2d]", array->arr[i]);
		else
			printf("[%2s]", " ");
	}
	getchar();
	return 0;
}
error_t arrayAdd(Array* array, int num) {
	if (array == NULL) {
		fprintf(stderr, "arrayAdd:array is null\n");
		return -1;
	}
	size_t top = array->top;
	if (top >= array->size) {
		size_t newSize = top * 2;
		if (newSize > MAX_SIZE || newSize < top) {
			newSize = MAX_SIZE;
		}
		int* temp = realloc(array->arr, newSize * sizeof(int));
		if (temp == NULL) {
			perror("arrayAdd");
			return -1;
		}
		array->arr = temp;
		array->size = newSize;
	}
	array->arr[array->top++] = num;
	return 0;
}
error_t arraySet(Array* array, size_t index, int num, int* out) {
	if (array == NULL || out == NULL) {
		fprintf(stderr, "arraySet:array is null\n");
		return -1;
	}
	if (index >= array->top) {
		fprintf(stderr, "arraySet:index is out of range\n");
		return -1;
	}
	*out = array->arr[index];
	array->arr[index] = num;
	return 0;
}
error_t arrayInsert(Array* array, size_t index, int num) {
	if (array == NULL) {
		fprintf(stderr, "arrayInsert:array is null\n");
		return -1;

	}
	size_t top = array->top;
	if (top >= array->size) {
		size_t newSize = top * 2;
		if (newSize > MAX_SIZE || newSize < top) {
			newSize = MAX_SIZE;
		}
		int* temp = realloc(array->arr, newSize * sizeof(int));
		if (temp == NULL) {
			perror("arrayAdd");
			return -1;
		}
		array->arr = temp;
		array->size = newSize;
	}
	if (index >= array->top) {
		fprintf(stderr, "arrayInsert:index is out of range");
		return -1;
	}
	memmove(array->arr + index + 1, array->arr + index, sizeof(int) * (array->top - index));
	array->arr[index] = num;
	++(array->top);

	return 0;
}
error_t arrayRemove(Array* array, size_t index, int* out) {
	if (array == NULL) {
		fprintf(stderr, "arrayRemove:array is null\n");
		return -1;
	}
	if (array->top == 0) {
		fprintf(stderr, "arrayRemove: array is empty\n");
		return -1;
	}
	if (index >= array->top) {
		fprintf(stderr, "arrayRemove:index is out of range\n");
		return -1;
	}
	*out = array->arr[index];
	int newTop = array->top - 1;
	if (newTop != index) {
		memmove(array->arr + index, array->arr + index + 1, sizeof(int) * (array->top - index - 1));
	}
	array->top = newTop;
	return 0;
}

error_t arrayGet(Array* array, size_t index, int* out) {
	if (array == NULL || out == NULL) {
		fprintf(stderr, "arrayGet:array is null\n");
		return -1;
	}
	if (index >= array->top) {
		fprintf(stderr, "arrayRemove:index is out of range\n");
		return -1;
	}
	*out = array->arr[index];
	return 0;
}

int main() {
	Array* array = arrayCreate();
	for (size_t i = 0; i < 3; i++)
	{
		arrayAdd(array, i);
		arrayDisplay(array);
	}
	int a = 0;
	arraySet(array, 2, 10, OUT & a);
	arrayDisplay(array);
	for (size_t i = 0; i < 4; i++)
	{
		arrayInsert(array, 2, 10);
		arrayDisplay(array);
	}
	int top = array->top;
	arrayGet(array, 1, &a);
	printf("%d", a);

	return 0;

}