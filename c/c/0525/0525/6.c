#define _CRT_SECURE_NO_WARNINGS	// ���� �ҽ� �ڵ忡�� ������ ������ :D
#include <stdio.h>
#include <string.h>

// strtok �Լ� ���, �Ľ̵Ǵ� ���ڿ��� �����ȴٴ� ������ �Ͻø� �ȵ˴ϴ�.
// ���� ������ �����Ϸ��� �����Ͽ� ����ؾ� �մϴ�.
int main() {
	char str[] = "hello, world";
	char copy[32];
	strcpy(copy, str);

	char *token = strtok(copy, ",");
	//printf("%s\n", token);
	printf("%s\n", str);

	return 0;
}