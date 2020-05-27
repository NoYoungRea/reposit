
// 가변 인자 함수의 원리
// 숙제: 가변 인자 매크로 분석 기술 문서 제출(이번주 금요일까지)
// 의무는 아닙니다.
#include <stdio.h>

int total(int cnt, ...) {
	int* ptr = &cnt + 1;
	for (int i = 0; i < cnt; i++)
		printf("%d ", ptr[i]);
	printf("\n");
	return 0;
}

int main() {
	int result = total(10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
}