#define _CRT_SECURE_NO_WARNINGS	// ���� �ҽ� �ڵ忡�� ������ ������ :D
#include <stdio.h>
#include <string.h>

// char, signed char, unsigned char�� ���� Ÿ��
// ������ �̴� ���� �ٸ� Ÿ������ ���� ȣȯ �������� �ʽ��ϴ�.
// ���� ���� �Ǵ� ���ڿ��� ó���Ϸ��� ������ char Ÿ���� ����ϴ� ���� �����մϴ�.

int main() {
	char str1[] = "hello, world";;
	char str2[] = "hello, world";;
	char str3[] = "hello, world";;

	printf("%d\n", strlen(str1));
	printf("%d\n", strlen(str2));
	printf("%d\n", strlen(str3));
}