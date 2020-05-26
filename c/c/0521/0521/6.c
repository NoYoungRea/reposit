
// 결론! 연산자 우선순위를 명확하게 알더라도 항상 사용하자!

#if 0
// 짝수를 판별하는 코드를 구현해 봅시다.
#include <stdio.h>

int isEven(int x) {
	// return x % 2 == 0;
	return (x & 1) == 0 ? 1 : 0;
}

int main() {
	int n = 4;
	if (isEven(n))
		printf("even\n");
	else
		printf("odd\n");
}
#endif

#include <stdio.h>

void increase(int* p) {
	(*p)++;
}

int main() {
	int age = 18;

	increase(&age);
	printf("%d\n", age);
}


















