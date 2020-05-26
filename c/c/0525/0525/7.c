
#include <stdio.h>
#define ARR_SIZE	(6)

// 문자열을 위한 공간이 문자 데이터와 널 종료 문자를 담기에 충분함을 보장해야 합니다.
int main() {
	char src[ARR_SIZE];
	for (int i = 0; i < ARR_SIZE; i++)
		src[i] = 'A' + i;

	char dst[ARR_SIZE];
	int i;
	//for (i = 0; src[i] && i < sizeof(dst); i++)	// 버퍼 오버플로 발생
	for (i = 0; src[i] && i < sizeof(dst) - 1; i++)
		dst[i] = src[i];			//      ^--- ASCII NUL('\0');
	dst[i] = '\0';
	printf("%s\n", dst);

	return 0;
}