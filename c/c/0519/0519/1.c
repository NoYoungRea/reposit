#if 0

// 2차원 배열: 원소가 1차원 배열인 1차원 배열
// N차원 배열: 원소가 N-1차원의 배열을 갖는 1차원 배열

#include <stdio.h>

int main() {
	int arr1[3] = { 1,2,3 };
	int* pArr1 = arr1;

	int arr2[2][3] = { {1,2,3}, {4,5,6 } };
	int(*pArr2)[3] = arr2;

}
#endif



#if 0
// 포인터의 연산
#include <stdio.h>

int main() {
	int *p = 0;
	int *q = 0;

	// p + q;	// 포인터 + 포인터 = 에러
	// p - q;	// 포인터 - 포인터 = 거리(정수)
	// p * q;	// 포인터 * 포인터 = 에러
	// p / q;  // 포인터 / 포인터 = 에러

	// p + 1;	// 포인터 + 정수 = 포인터
	// p - 1;	// 포인터 - 정수 = 포인터
	// p * 1;	// 포인터 * 정수 = 에러
	// p / 1;	// 포인터 / 정수 = 에러
}

// 결론! 포인터는 제한적인 산술 연산이 가능합니다.
// p - q;	// 포인터 - 포인터 = 거리(정수)
// p + 1;	// 포인터 + 정수 = 포인터
// p - 1;	// 포인터 - 정수 = 포인터

#endif



#if 0
// 포인터와 산술 연산 2
#include <stdio.h>

int main() {
	int i = 0;
	printf("%d\n", i + 1);	// ?

	// 포인터와 정수의 연산 결과는 대상체 크기의 배수 만큼 계산됩니다.
	int* p = 0;
	printf("%d\n", p + 1);	// p + (sizeof(*p) * 1)
}
#endif


#if 0
#include <stdio.h>

int main() {
	int arr[6] = { 1, 2,3,4,5,6 };
	for (int i = 0; i < 6; i++)
		printf("arr[%d] = %d\n", i, *(arr + i));
}

#endif

#if 1
#include <stdio.h>

int main() {
	int arr[2][3] = { {1,2,3}, {4,5,6} };

	int(*p)[3] = 0;
	// printf("%d\n", p + 1);	// 12

	printf("arr[1][2] = %d\n", arr[1][2]);
	printf("arr[1][2] = %d\n", (*(arr+1))[2]);
	printf("arr[1][2] = %d\n", *((*(arr+1)) + 2));
	printf("arr[1][2] = %d\n", *(*(arr+1) + 2));
	
}

#endif












































