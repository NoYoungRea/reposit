
#include <stdio.h>
#include <stdlib.h>

typedef struct Stack {
#define STACK_SIZE	(5)
	int top;
	int arr[STACK_SIZE];
} Stack;

int isFull(const Stack* p) { return p->top == STACK_SIZE; }

// ������ �߻��� ���, ���� ó�� ��å�� ����ڿ��� �����ϰ� �ֽ��ϴ�.
// �̷��� �ڵ�� ���� ���ϸ� ������ �߻��Ǹ� ����ڿ��� �˷��־� �����ϰ� ó���ϵ��� �ϴ� 
// ���� �����ϴ�.
int push(Stack* p, int data) {
	// if (p == NULL) return -1;
	assert(p != NULL);	// ��쿡 ���󼭴� �����Ű�� �͵� ���� ����Դϴ�.(��) OS)

	if (isFull(p)) {
		// exit(-1);	// abort();
		return -1;
	}
	return 0;
}

int main() {
	Stack s = { 0, };
	if (push(&s, 10) == -1) {
		// ���� ó��
	}
}