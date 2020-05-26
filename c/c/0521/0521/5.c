
#if 0
#include <Windows.h>	// CreateThread
#include <stdio.h>

unsigned long __stdcall threadMain(void* p) {
	for (int i = 0; i < 10; i++) {
		Sleep(1000);
		printf("\t\t[worker thread]\n");
	}
	return 0;
}

int main() {
	CreateThread(0, 0, threadMain, 0, 0, 0);	// 이 순간 쓰레드가 생성되고 동작합니다.

	while (1) {
		Sleep(1000);
		printf("[main thread]\n");
	}
	return 0;
}
#endif

#if 1
#include <Windows.h>
#include <stdio.h>

// volatile: 값이 프로그램이 아닌 외부적인 요인에 의하여 그 값이 변경될 수 있다고
// 컴파일러에게 알려 캐싱을 제한할 때 사용하는 키워드입니다.
// 따라서 캐시되어서는 안되는 데이터에 대해서는 반드시 volatile을 사용해야 합니다.
volatile int flag = 1;
unsigned long __stdcall threadMain(void* p) {
	Sleep(5000);
	flag = 0;
	return 0;
}

int main() {
	CreateThread(0, 0, threadMain, 0, 0, 0);	

	while (flag)
		;

	return 0;
}
#endif
