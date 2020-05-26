// Stack.c
#include <stdlib.h>
#include "Stack.h"

// 스택 구조체 정의
struct __Stack {
	int* arr;
	int top;
	int size;
};

Stack createStack(int size) {
	Stack p = calloc(1, sizeof(struct __Stack));
	p->arr = malloc(sizeof(int) * size);
	p->size = size;
	return p;
}
