
#include <stdio.h>
#include <stdlib.h>
#include <errno.h>

int main() {
	const char* str = "10000000000";	// 100��
	char* endPtr = NULL;

	// LONG_MAX �Ǵ� LONG_MIN�� ���� ������ �����ϱ� ��ƴٴ� ������ �ֽ��ϴ�.
	// �̷��� ������ �ذ��ϱ� ���� ���� �ڵ带 �����մϴ�.
	errno = 0;	// �� ������ ���� �����̹Ƿ� �ٸ� ���� ����Ǿ� ���� �� �ֽ��ϴ�.
				// ���� ��� ������ �ݵ�� 0���� �����ؾ� �մϴ�.
	long num = strtol(str, &endPtr, 0);	// 10����: 0
	// if (endPtr == str || (num == LONG_MAX || num == LONG_MIN)) {
	if (endPtr == str || ((num == LONG_MAX || num == LONG_MIN) && errno == ERANGE)) {
		fprintf(stderr, "strtol error\n");
		return -1;
	}

	printf("%d\n", num);
}
