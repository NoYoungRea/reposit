#define _CRT_SECURE_NO_WARNINGS

#if 0
// 매크로를 견고하게 만드는 방법 1. 매크로 함수의 모든 인자에 괄호를 사용하라!
#include <stdio.h>
// #define SQR(x)	x*x
#define SQR(x)	(x)*(x)

int main() {
	// int n = SQR(2);
	int n = SQR(2 + 1);	// 2 + 1*2 + 1 -> (2 + 1)*(2 + 1)
	printf("%d\n", n);
}
#endif

#if 0
// 매크로를 견고하게 만드는 방법 1. 매크로 함수의 모든 인자에 괄호를 사용하라!
// 매크로를 견고하게 만드는 방법 2. 치환될 매크로의 최 외곽에도 괄호를 사용하라!
#include <stdio.h>
//#define DBL(x) (x)+(x)
#define DBL(x) ((x)+(x))

int main() {
	// int n = DBL(2);
	int n = DBL(2) * DBL(2); // (2)+(2) * (2)+(2) -> ((2)+(2)) * ((2)+(2))
	printf("%d\n", n);
}
#endif



#if 1
// 매크로를 견고하게 만드는 방법 1. 매크로 함수의 모든 인자에 괄호를 사용하라!
// 매크로를 견고하게 만드는 방법 2. 치환될 매크로의 최 외곽에도 괄호를 사용하라!
// 매크로를 견고하게 만드는 방법 3. 매크로 상수에 괄호를 사용하라
#include <stdio.h>
#define INFO	(-1)
#define WARN	(-2)
#define ERR		(-3)
	
void printLog(int level, const char* msg) {
	if (level INFO)		// if (-3() -1)
		printf("[INFO] %s\n", msg);
	else if (level == WARN)
		printf("[WARN] %s\n", msg);
	else if (level == ERR)
		printf("[ERR] %s\n", msg);
}

int main() {
	printLog(ERR, "hello, world");
}
#endif







