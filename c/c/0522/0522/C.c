
#include <stdio.h>
#include <limits.h>

// C 언어에서 부호 있는 정수에 대하여 연산을 수행할 경우, 결과 값이 표현 범위를
// 넘어서면 이를 오버플로라고 합니다.

// C언어에서 정수 오버플로는 미정의 동작이므로 부호 있는 정수에 대하여 산술 연산 시,
// 정수 오버플로가 발생되지 않도록 해야 함
int main() {
	signed int sint1, sint2, result = 0;
	sint1 = INT_MAX;
	sint2 = 1;

	if ((((sint1 > 0) && (sint2 > 0)) && (sint1 + sint2 < 0)) ||
		(((sint1 < 0) && (sint2 < 0)) && (sint1 + sint2 > 0))) {
		fprintf(stderr, "정수 오버플로 발생\n");
		return -1;
	}

	result = sint1 + sint2;
	printf("%d\n", result);

	return 0;
}