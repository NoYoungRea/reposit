#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

// C언어에서 함수의 리턴 값은 반드시 조사해야 합니다.
int main() {
	int age;

	printf("input age: ");
	int ret = scanf("%d", &age);
	if (ret == 0 || ret == EOF) {
		printf("scanf error\n");
		return -1;
	}
	printf("%d\n", age);

	return 0;
}