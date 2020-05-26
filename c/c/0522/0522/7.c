#define  _CRT_SECURE_NO_WARNINGS

#if 0
#include <stdio.h>

int main() {
	int age;
	printf("input age: ");

	int ret = scanf("%d", &age);
	if (ret != 1 || ret == EOF) {
		fprintf(stderr, "scanf error\n");
		return -1;
	}
	printf("%d\n", age);
	return 0;
}
#endif

#if 0
#include <stdio.h>
#include <stdlib.h>

int main() {
	char buf[32];
	printf("input age: ");
	fgets(buf, sizeof(buf), stdin);

	int age = atoi(buf);
	printf("%d\n", age);
	return 0;
}
#endif

#if 1
#include <stdio.h>
#include <stdlib.h>
#include <errno.h>	// int errno;

// atoi, atol, atoll 함수의 문제점
// 1. 에러 발생 시, errno 값을 설정하지 않음
// 2. 표현할 수 없는 값을 얻을 경우, 미정의 동작
// 3. 문자열에 숫자가 아닌 다른 문자가 포함될 경우, 0을 반환함 -> 오류 처리 불가능

// strtol, strtoll, ...
int main() {
	char buf[32];
	printf("input age: ");
	fgets(buf, sizeof(buf), stdin);

	char* endPtr;
	errno = 0;	// 이 변수는 자동 초기화가 안되므로 사용 전 반드시 0으로 초기화해야 합니다.
	long age = strtol(buf, &endPtr, 10);
	if (errno == ERANGE) {	// 1. 값의 범위를 넘어설 경우
		perror("strtol");
		return -1;
	}
	else if (endPtr == buf) {
		fprintf(stderr, "숫자가 아닙니다.\n");
		return -1;
	}
	else if (*endPtr != '\n' && *endPtr != '\0') {
		fprintf(stderr, "숫자가 아닌 문자가 포함되어 있습니다.\n");
		return -1;
	}

	printf("%d\n", age);
	return 0;
}
#endif