
#if 0
// ���� ����
// ������ �����ϴ� ���� �ڷᱸ���� ������ ���ô�.
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
//	struct Node* next;	// OK, �������� ũ��� �̹� �����Ǿ� �ֱ� ����
//	struct Node node;	// ERROR, Ÿ�� ������ �Ϻ��ϰ� ���ǵǾ� ���� �ʱ� ���� 
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
