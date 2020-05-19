
#if 0
#include <stdio.h>

int add(int a, int b) { return a + b; }
int sub(int a, int b) { return a - b; }
int mul(int a, int b) { return a * b; }

int main() {
	// ����ڷκ��� �ǿ����ڿ� �����ڸ� �Է� �޾Ҵٰ� �����մϴ�.
	int n1 = 1, n2 = 1;
	int op = 0;	// 0: ����, 1: ����, 2: ����

	int result;
	switch (op) {
	case 0:
		result = add(n1, n2);
	case 1:
		result = sub(n1, n2);
	case 2:
		result = mul(n1, n2);
	}

	printf("%d\n", result);
}
#endif

#if 1 
#include <stdio.h>
// ������ �ڵ�� ��ɿ� ���� �ڵ尡 ��Ȳ�ϴٴ� ������ �ֽ��ϴ�.
int add(int a, int b) { return a + b; }
int sub(int a, int b) { return a - b; }
int mul(int a, int b) { return a * b; }

int main() {
	// ����ڷκ��� �ǿ����ڿ� �����ڸ� �Է� �޾Ҵٰ� �����մϴ�.
	int n1 = 1, n2 = 1;
	int op = 0;	// 0: ����, 1: ����, 2: ����

	int(*arr[3])(int, int) = { add, sub, mul };

	int result = arr[op](n1, n2);
	printf("%d\n", result);
}
#endif