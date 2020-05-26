#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

// strncpy, fgets 등은 버퍼 오버플로를 회피하기 위해 사용되는 대표적인 함수들이다.
// 하지만 이러한 함수들은 지정한 제한을 넘는 문자열에 대해서는 단순히 잘라버린다는 단점이
// 있다. 이는 데이터의 손실과 더불어 소프트웨어의 취약성이 될 수 있다.

int main() {
	const char* src = "hello, world";
	char dst[5];

	strncpy(dst, src, sizeof(dst)); // strcpy(dst, src);
	printf("%s\n", dst);
}
#endif

#if 1
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

// 데이터의 손실 또는 널 문자로 종료되지 않는 것에 대한 대비 코드를 작성하는 것이 좋습니다.
int main() {
	const char* src = "hello, world";
	char dst[5];


	// 1. 널 검사
	if (src == NULL) {
		fprintf(stderr, "문자열이 없습니다.\n");
		return -1;
	}
	// 2. 사본의 크기보다 원본의 크기가 더 큰지를 조사
	else if (strlen(src) >= sizeof(dst)) {
		fprintf(stderr, "문자열이 너무 깁니다.\n");
		return -1;
	}
	else {
		strncpy(dst, src, sizeof(dst));
		printf("%s\n", dst);
	}
	return 0;

}












#endif