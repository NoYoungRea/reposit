
#if 0
#include <stdio.h>

int add(int a, int b) { return a + b; }
int sub(int a, int b) { return a - b; }
int mul(int a, int b) { return a * b; }

int main() {
	// 사용자로부터 피연산자와 연산자를 입력 받았다고 가정합니다.
	int n1 = 1, n2 = 1;
	int op = 0;	// 0: 덧셈, 1: 뺄셈, 2: 곱셈

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
// 이전의 코드는 기능에 비해 코드가 장황하다는 단점이 있습니다.
int add(int a, int b) { return a + b; }
int sub(int a, int b) { return a - b; }
int mul(int a, int b) { return a * b; }

int main() {
	// 사용자로부터 피연산자와 연산자를 입력 받았다고 가정합니다.
	int n1 = 1, n2 = 1;
	int op = 0;	// 0: 덧셈, 1: 뺄셈, 2: 곱셈

	int(*arr[3])(int, int) = { add, sub, mul };

	int result = arr[op](n1, n2);
	printf("%d\n", result);
}
#endif