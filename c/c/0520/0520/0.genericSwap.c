
#if 0
// 스왑 함수를 생각해 봅시다.
#include <stdio.h>

void swap(void* a, void* b) {
	int t = *(int*)a;
	*(int*)a = *(int*)b;
	*(int*)b = t;
}

int main() {
	int a = 10, b = 1000;
	swap(&a, &b);
	printf("a = %d, b = %d\n", a, b);

	double d = 3.14, e = 4.14;
	swap(&d, &e);
	printf("d = %f, e = %f\n", d, e);
	return 0;
}
#endif


#if 0
#include <stdio.h>

// step 1. 이전 코드는 정수 타입만 스왑 가능하다는 문제가 있습니다.
// 모든 타입에 대하여 스왑 가능하도록 타입 정보를 사용자로부터 받습니다.
enum Type { INT, DOUBLE };	// 타입 코드(type code)
void swap(void* a, void* b, enum Type t) {
	switch (t) {
	case INT: {
		int t = *(int*)a;
		*(int*)a = *(int*)b;
		*(int*)b = t;
	}
			break;
	case DOUBLE: {
		double t = *(double*)a;
		*(double*)a = *(double*)b;
		*(double*)b = t;
	}
		   break;
	}
}

int main() {
	int a = 10, b = 1000;
	swap(&a, &b, INT), printf("a = %d, b = %d\n", a, b);
	double d = 3.14, e = 4.14;
	swap(&d, &e, DOUBLE), printf("d = %f, e = %f\n", d, e);
	return 0;
}
#endif

#if 0
#include <stdio.h>
#include <stdlib.h>	// malloc, free
#include <string.h>	// memcpy

typedef struct { int x, y; } Point;

// step 2. 이전 코드는 타입 코드가 사용되었으므로 새로운 타입이 추가되면
// 코드를 수정해야 한다는 문제가 있습니다. 타입 코드는 분기문을 수반하기 때문입니다.
void swap(void* a, void* b, int size) {
	void* t = malloc(size);
	memcpy(t, a, size);		// t = a;
	memcpy(a, b, size);		// a = b;
	memcpy(b, t, size);		// b = t;
	free(t);
}

int main() {
	int a = 10, b = 1000;
	swap(&a, &b, sizeof(int)), printf("a = %d, b = %d\n", a, b);
	double d = 3.14, e = 4.14;
	swap(&d, &e, sizeof(double)), printf("d = %f, e = %f\n", d, e);

	Point p1 = { 0, 0 };
	Point p2 = { 10, 10 };
	swap(&p1, &p2, sizeof(Point));
	printf("p1(%d,%d), p2(%d,%d)\n", p1.x, p1.y, p2.x, p2.y);

	return 0;
}
#endif

#if 0
#include <stdio.h>
typedef struct { int x, y; } Point;

// step 3. 이전 코드는 내부적으로 동적 할당을 하기 때문에 성능 상의 이슈가 발생합니다.
// 이를 해결하기 위해 매크로를 도입합니다.
#define SWAP(x, y, t)	\
	(t) = (x);		\
	(x) = (y);		\
	(y) = t;

int main() {
	int a = 10, b = 1000;

	int t1;
	SWAP(a, b, t1);		// t1 = (a);
						// (a) = (b);
						// (b) = t;
	printf("a = %d, b = %d\n", a, b);

	double d = 3.14, e = 4.14;

	double t2;
	SWAP(d, e, t2);		// t2 = (d);
						// (d) = (e);
						// (e) = t;
	printf("d = %f, e = %f\n", d, e);
	return 0;
}
#endif

#if 0
#include <stdio.h>
typedef struct { int x, y; } Point;

// step 4. 이전 코드는 임시 변수를 사용한다는 단점이 있습니다.
// 이를 해결하기 위해 이름 없는 중괄호를 도입합니다.
#define SWAP(x, y, T) {	\
	T t = (x);		\
	(x) = (y);		\
	(y) = t; }

int main() {
	int a = 10, b = 1000;
	SWAP(a, b, int);
	printf("a = %d, b = %d\n", a, b);

	double d = 3.14, e = 4.14;
	SWAP(d, e, double);
	printf("d = %f, e = %f\n", d, e);
	return 0;
}
#endif

#if 0
#include <stdio.h>
// 4. 매크로를 견고하게 만드는 방법 4. 여러 줄의 매크로에 대해서는 do-while(0)로 묶어주어야 합니다.
// 이 함수는 이름 없는 중괄호를 사용하므로 if-else 사용 시, 세미콜론을 사용하면 안됩니다.(do-while이 없다면)
#define SWAP(x, y, T) do {	\
	T t = (x);		\
	(x) = (y);		\
	(y) = t; } while(0)


int main() {
	// if (1) {
	//	// ...
	// };	
	// else {	// dangling else
	// 	// ...
	// }

	int a = 10, b = 1000;
	if (a > b)
		SWAP(a, b, int);
	else 
		printf("a = %d, b = %d\n", a, b);

	return 0;
}
#endif

// 연습 문제: 매크로를 사용하지 않고 일반 함수를 사용하여 완벽하게 일반화된 
// 스왑 함수를 구현해 보세요 :D

#if 1
#include <stdio.h>

//void swap(void* a, void* b, size_t size) {
//	char* pA = (char*)a;
//	char* pB = (char*)b;
//	for (size_t i = 0; i < size; i++, pA++, pB++) {
//		char t = *pA;
//		*pA = *pB;
//		*pB = t;
//	}
//}

void swap(void* a, void* b, int size) {
	char t;
	do {
		t = *(char*)a;
		*(char*)a = *(char*)b;
		*(char*)b = t;
		a = (char*)a + 1;
		b = (char*)b + 1;

		//*(char*)a++ = *(char*)b;
		//*(char*)b++ = t;
	} while (--size > 0);
}

int main() {
	int a = 10, b = 1000;
	swap(&a, &b, sizeof(int));
	printf("a = %d, b = %d\n", a, b);

	return 0;
}
#endif









