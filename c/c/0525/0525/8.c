#define _CRT_SECURE_NO_WARNINGS	// ���� �ҽ� �ڵ忡�� ������ ������ :D
#include <stdio.h>
#include <string.h>

// �׻� ���ڿ��� ���� �� ���ڷ� ���� �� �ֵ��� �����ؾ� �մϴ�.
// ����� ���ڿ� ó�� ��, �������� �� ���ڸ� �����ϴ� ���Դϴ�.
#define STR_SZ	(5)

int main() {
	const char str[] = "abcdefghijklmnopqrstuvwxyz";

	char dst[STR_SZ] = { 0, };
	// ...
	// dst[sizeof(dst) - 1] = '\0';
	strncpy(dst, str, sizeof(dst));
	dst[sizeof(dst) - 1] = '\0';
	printf("%s\n", dst);
}

