
#include <stdio.h.>

// 문자열 상수에 대한 포인터를 선언할 경우, 반드시 상수 지시 포인터를
// 사용해야 합니다.

int main() {
	// 둘의 차이점을 생각해 보세요 :D
    char s1[] = "hello, world";				// 문자열 배열
	const char *s2 = "hello, world";		// 문자열 포인터

	 s1[0] = ' ';	// OK
	 s2[0] = ' ';	// ??

	 printf("%s\n", s1);
	 printf("%s\n", s2);
}