
#if 0
// 정보 은닉
// 정수를 저장하는 스택 자료구조를 생각해 봅시다.
#include <stdlib.h>

struct Stack {
	int* arr;	// int arr[3];
	int top;
	int size;
};
typedef struct Stack Stack;

Stack* createStack(int size) {
	Stack* p = calloc(1, sizeof(Stack));
	p->arr = malloc(sizeof(int) * size);
	p->size = size;
	return p;
}

int main() {
	Stack* s = createStack(5);
	// ...
}
#endif

#if 1

//typedef struct Node {
//	// ...
//	struct Node* next;	// OK, 포인터의 크기는 이미 결정되어 있기 때문
//	struct Node node;	// ERROR, 타입 정보가 완벽하게 정의되어 있지 않기 때문 
//} Node;


// 2.c(main.c)
#include "Stack.h"

int main() {
	Stack s = createStack(5);
	// push(s, 10); // top => 1
	// push(s, 20); // top => 2
    s->top = 0;	// ??
}
#endif
