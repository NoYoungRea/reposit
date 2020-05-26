
// 초기화되지 않은 변수는 참조하지 마라!
#include <stdio.h>

int sum(const int* arr, int len) {
	int sum = 0;
	for (int i = 0; i < len; i++)
		sum += arr[i];
	return sum;
}

int main() {
	int arr[5] = { 1,2,3,4,5 };
	printf("%d\n", sum(arr, 5));
}