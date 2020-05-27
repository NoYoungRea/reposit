
// 함수의 리턴 원리
#include <stdio.h>

int add(int a, int b) {
	int c;
	c = a + b;
	//return c;
	// 인텔 x86의 경우, eax 레지스터를 사용합니다.
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