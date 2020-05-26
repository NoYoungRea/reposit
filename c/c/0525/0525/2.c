
// 0.c의 파일을 복사해 오세요 :D
#include <stdio.h>
#define ARR_MAX	(4096)

// 배열에서 크기를 나타내는 인자가 유효한 범위 안에 있음을 보장하는 것이 좋습니다.
int print_arr(const int* arr, size_t len) { // unsigned int len) {
	if (arr == NULL || len > ARR_MAX)
		return -1;

	for (size_t i = 0; i < len; i++)
		printf("%d ", arr[i]);	// *(arr + i);
	return 0;
}

int main() {
	int arr[] = { 1, 2, 3, 4, 5 };
	print_arr(arr, -1);	
}