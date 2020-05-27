#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <errno.h>	// errno;
#include <string.h>	// strerror()

void print_error(const char* msg) {
	fprintf(stderr, "%s: %s\n", msg, strerror(errno));
}

int main() {
	FILE* fp = fopen("xxx", "r");
	if (fp == NULL) {
		// fprintf(stderr, "fopen error\n");

		// ǥ�� ���̺귯���� �Լ� ȣ�� ���� ��, �̸� �ĺ��� �� �ֵ��� ���� �ڵ带 �����մϴ�.
		// �̸� ����Ϸ��� errno.h ������ ���Խ��Ѿ� �մϴ�.
		//fprintf(stderr, "fopen error: %d\n", errno);

		// ǥ�� ���̺귯���� ���� �ڵ带 ���ڿ��� ��ȯ���ִ� �Լ��� �����մϴ�.
		//fprintf(stderr, "fopen error: %s\n", strerror(errno));

		
		// print_error("fopen");
		// �̹� ���� ���� �Լ��� ǥ�� ���̺귯������ �����մϴ�.
		perror("fopen");
		return -1;
	}

	char buf[4096];
	fgets(buf, sizeof(buf), fp);
	fputs(buf, stdout);

	fclose(fp);
	return 0;
}