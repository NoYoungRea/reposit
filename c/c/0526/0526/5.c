
#include <stdio.h>
#include <stdlib.h>

int foo() {
	// return 0;
	exit(0);	// ���α׷� �Ǵ� ���μ����� ��� �����Ű���� exit �Լ��� ���
	printf("call foo()\n");
}

int main() {
	// return 0;	// ���� �Լ����� ��ȯ�Ǹ� ���α׷��� ����˴ϴ�. -> exit(main());
	// foo();
	// printf("hello, world\n");
}

// ���α׷� ���� ���
// 1. ���� �Լ����� ����
// 2. exit �Լ� ȣ�� -> ���� ����
// 3. abort �Լ� ȣ�� -> ������ ����