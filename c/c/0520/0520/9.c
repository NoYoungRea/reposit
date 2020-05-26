
#include <stdio.h>

// 함수 선언 시, 타입 정보를 적절하게 선언해라!
int foo(int a, int b, int c);

int main() {
	//int ret = foo(1, 2);
	int(*fp)(int, int) = foo;
	fp(1, 2);
}

int foo(int a, int b, int c) {
	printf("foo(%d, %d, %d)\n", a, b, c);
	return 0;
}