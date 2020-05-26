
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
	CreateThread(0, 0, threadMain, 0, 0, 0);	// �� ���� �����尡 �����ǰ� �����մϴ�.

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

// volatile: ���� ���α׷��� �ƴ� �ܺ����� ���ο� ���Ͽ� �� ���� ����� �� �ִٰ�
// �����Ϸ����� �˷� ĳ���� ������ �� ����ϴ� Ű�����Դϴ�.
// ���� ĳ�õǾ�� �ȵǴ� �����Ϳ� ���ؼ��� �ݵ�� volatile�� ����ؾ� �մϴ�.
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
