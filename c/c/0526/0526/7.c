
#include <stdio.h>
#include <stdlib.h>
#include <errno.h>

int main() {
	const char* str = "10000000000";	// 100억
	char* endPtr = NULL;

	// LONG_MAX 또는 LONG_MIN에 대한 오류를 구분하기 어렵다는 단점이 있습니다.
	// 이러한 문제를 해결하기 위해 오류 코드를 설정합니다.
	errno = 0;	// 이 변수는 전역 변수이므로 다른 값이 저장되어 있을 수 있습니다.
				// 따라서 사용 전에는 반드시 0으로 설정해야 합니다.
	long num = strtol(str, &endPtr, 0);	// 10진수: 0
	// if (endPtr == str || (num == LONG_MAX || num == LONG_MIN)) {
	if (endPtr == str || ((num == LONG_MAX || num == LONG_MIN) && errno == ERANGE)) {
		fprintf(stderr, "strtol error\n");
		return -1;
	}

	printf("%d\n", num);
}
