
// 루프 카운터로 부동 소수점을 사용하지 말자!
#include <stdio.h>

int main() {
	int cnt = 0;
	// for (float f = 0.0f; f <= 1.0f; f += 0.1f)
	for (int i = 0; i <= 10; i++)
		++cnt;

	printf("%d\n", cnt);
}