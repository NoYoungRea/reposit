#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

// C���� �Լ��� ���� ���� �ݵ�� �����ؾ� �մϴ�.
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