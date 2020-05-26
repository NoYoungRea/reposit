#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// �е���Ʈ(padding bit): CPU�� ������� ������ �ϱ� ���� �����Ϸ��� �߰��ϴ� �޸�
// ����

// C99: ����ü �ȿ��� �̸��� ���� �е�(padding)�� �� �� ������ �� ��ġ�� �����Ϸ�����
// �ٸ��� �����˴ϴ�.

// ���! ����ü�� ũ�Ⱑ ������� �����̶�� �������� ����!
typedef struct {
	char buf[10];
	int len;
} cstring;

cstring* makeString(const char* str) {
	cstring* p = malloc(sizeof(cstring));	// malloc(14);
	strcpy(p->buf, str);
	p->len = strlen(str);
}

int main() {
	printf("%u\n", sizeof(cstring));
	cstring* hello = makeString("hello");
}