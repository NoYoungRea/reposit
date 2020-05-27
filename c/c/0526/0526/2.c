
// 입출력 FILE 객체에 대하여 복사본을 사용하시면 안됩니다.
// 사용하게 되면 프로그램이 비정상 종료될 수 있습니다.
#include <stdio.h>

// void foo(FILE fp) {}

int main() {
	fputs("hello, world\n", stdout);

	FILE* fp = stdout;	// 파일 포인터
	fputs("hello, world\n", fp);

	FILE file = *stdout;
	fputs("hello, world\n", &file);	// ??
}