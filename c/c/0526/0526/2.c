
// ����� FILE ��ü�� ���Ͽ� ���纻�� ����Ͻø� �ȵ˴ϴ�.
// ����ϰ� �Ǹ� ���α׷��� ������ ����� �� �ֽ��ϴ�.
#include <stdio.h>

// void foo(FILE fp) {}

int main() {
	fputs("hello, world\n", stdout);

	FILE* fp = stdout;	// ���� ������
	fputs("hello, world\n", fp);

	FILE file = *stdout;
	fputs("hello, world\n", &file);	// ??
}