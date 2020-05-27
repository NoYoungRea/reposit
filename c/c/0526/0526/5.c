
#include <stdio.h>
#include <stdlib.h>

int foo() {
	// return 0;
	exit(0);	// 프로그램 또는 프로세스를 즉시 종료시키려면 exit 함수를 사용
	printf("call foo()\n");
}

int main() {
	// return 0;	// 메인 함수에서 반환되면 프로그램은 종료됩니다. -> exit(main());
	// foo();
	// printf("hello, world\n");
}

// 프로그램 종료 방법
// 1. 메인 함수에서 리턴
// 2. exit 함수 호출 -> 정상 종료
// 3. abort 함수 호출 -> 비정상 종료