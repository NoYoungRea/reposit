
#include <stdio.h>
#include <stdlib.h>

typedef struct Stack {
#define STACK_SIZE	(5)
	int top;
	int arr[STACK_SIZE];
} Stack;

int isFull(const Stack* p) { return p->top == STACK_SIZE; }

// 오류가 발생할 경우, 오류 처리 정책을 사용자에게 강요하고 있습니다.
// 이러한 코드는 좋지 못하며 오류가 발생되면 사용자에게 알려주어 적절하게 처리하도록 하는 
// 것이 좋습니다.
int push(Stack* p, int data) {
	// if (p == NULL) return -1;
	assert(p != NULL);	// 경우에 따라서는 종료시키는 것도 좋은 방법입니다.(예) OS)

	if (isFull(p)) {
		// exit(-1);	// abort();
		return -1;
	}
	return 0;
}

int main() {
	Stack s = { 0, };
	if (push(&s, 10) == -1) {
		// 오류 처리
	}
}