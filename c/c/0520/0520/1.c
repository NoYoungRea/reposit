
#include <stdio.h>

// 매크로 안에서 단항 연산자와 같은 연산자를 사용하시면 안됩니다.
// 이는 미정의 동작입니다.
#define SQR(x)	((x)*(x))

// 인라인 함수: 함수 호출의 코드에 함수 호출 명령어(call)가 아닌
// 함수의 기계어 코드로 치환(inlining)되는 함수
// 이는 C99에서 표준으로 채택된 문법으로 C++에서 차용해 왔습니다.
inline int sqr(int x) { return x * x; }

// 인라인 문법은 최적화 문법이므로 최적화 옵션을 사용하지 않으면 전달하지 않습니다.

int main() {
	int x = 2;
	// int n = SQR(++x);	// ((++x)*(++x))
	int n = sqr(++x);
	printf("%d\n", n);
}