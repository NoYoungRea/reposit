
// 시퀀스 포인트(sequence point): 모든 식의 평가(계산)가 완료되고 그 값이 메모리에
// 저장되는 시점을 의미합니다.
// 종류: 함수 호출 연산자(()), 쉼표(,), 세미콜론(;), for(), while(), ...

// 시퀀스 포인트에서 객체의 값을 여러 번 수정하는 것은 미정의 동작입니다.
// 이는 시퀀스 포인트에서 모든 식이 평가되지 않으면 식의 의도가 불분명 또는 모호해지기
// 때문입니다. 따라서 다음의 동작은 모두 미정의 동작입니다.
// ++i + ++i;
// i = ++i + 1;
// arr[i++] = i;
// func(n++, n);

#if 0
#include <stdio.h>
#define SQR(x)	((x)*(x))

int main() {
	int n = 2;
	++n;
	int result = SQR(n);	// int result = ((++n)*(++n));
	printf("%d\n", result);
}
#endif


#include <stdio.h>
#include <assert.h>

int fact(int n) {
	if (n <= 1)
		return 1;
	//return n * fact(--n);
	return n * fact(n - 1);
}

int main() {
	printf("%d\n", fact(5));

	// 어썰션은 매크로 함수이므로 함수 내에서 값의 할당, 증가, 감소 등은 미정의 동작입니다.
	int n = 0;
	assert(++n > 0);
}



















