
// 스택에 대하여 큰 메모리를 사용하지 말라
// 1. 가변 길이 배열
// 2. 재귀 호출
#include <stdio.h>

int copy_file(FILE* dst, FILE* src, size_t buf_size) {
	// int arr[20];			// 배열의 크기에 상수가 올 수 있다.
	int buf[buf_size];		// 배열의 크기에 변수가 올 수 있다.(C99, 가변 길이 배열)

	// ...
}

int main() {
	copy_file(..., ..., 304394832948328432);
}
