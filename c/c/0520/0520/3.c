
// 매크로 연산자 이야기
// 1. a##b: 두 개의 토큰을 연결하는 연산자자
// 2. #x: 토큰을 문자열화 하는 연산자
// 3. #@x: 길이가 1인 토큰을 문자화하는 연산자
#include <stdio.h>
#define CONCAT(x, y)	x##y
#define TO_STR(x)		#x
#define TO_CHAR(x)		#@x  // 마이크로소프트 컴파일러 전용

int main() {
	printf("%d\n", CONCAT(2020, 12));	// 2020##12);
	printf("%s\n", TO_STR(hello));
	printf("%c\n", TO_CHAR(h));

}
