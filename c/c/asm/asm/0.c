
// �Լ��� ���� ����
#include <stdio.h>

int add(int a, int b) {
	int c;
	c = a + b;
	//return c;
	// ���� x86�� ���, eax �������͸� ����մϴ�.
	__asm {
		mov eax, c    ; eax = c
	}
}

int main() {
	int n = 0;
	add(1, 2); // n = add(1, 2);

	__asm {
		mov n, eax    ; n = eax
	}

	printf("%d\n", n);
}