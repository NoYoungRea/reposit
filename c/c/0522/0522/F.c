
#if 0
#include <stdio.h>

float mean(const float* arr, int len) {
	if (len == 0)
		return 0.0F;

	float total = 0.0F;
	for (int i = 0; i < len; i++) {
		total += arr[i];
		printf("arr[%d]=%f\t\ttotal=%f\n", i, arr[i], total);
	}
	return total / len;
}

int main() {
	float arr[10];
	for (int i = 0; i < 10; i++)
		arr[i] = 10.1F;

	float result = mean(arr, 10);
}
#endif

#if 1
#include <stdio.h>

// 이전 코드는 누적 오차가 발생한다는 문제가 있습니다. 이를 해결하기 위해 부동소수점을 정수로
// 변경하여 계산합니다.
float mean(const float* arr, int len) {
	if (len == 0)
		return 0.0F;

	int total = 0;
	for (int i = 0; i < len; i++) {
		total += arr[i];
		printf("arr[%d]=%f\t\ttotal=%f\n", i, arr[i] / 100.0, total /100.0);
	}
	return (float)total / len;
}

int main() {
	float arr[10];
	for (int i = 0; i < 10; i++)
		arr[i] = 1010;

	float result = mean(arr, 10);
	printf("%f\n", result / 100.0);
}
#endif
