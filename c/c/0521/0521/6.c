
// ���! ������ �켱������ ��Ȯ�ϰ� �˴��� �׻� �������!

#if 0
// ¦���� �Ǻ��ϴ� �ڵ带 ������ ���ô�.
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


















