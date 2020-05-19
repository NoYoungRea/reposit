
// 2차원 배열의 동적 할당
#include <stdio.h>
#include <stdlib.h>

int main() {
	int arr[2][3] = { {1, 2, 3}, {4, 5, 6} };	// 스택
	int* p1 = arr;
	for (int i = 0; i < 6; i++)
		printf("%d ", p1[i]);
	printf("\n");


	int(*p)[3] = malloc(sizeof(int) * 2 * 3);	// 힙

	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++)
			p[i][j] = i * j;
	}

	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++)
			printf("%d ", p[i][j]);
		printf("\n");
	}
	free(p);	// 사용된 메모리는 반드시 해제해야 합니다.


}