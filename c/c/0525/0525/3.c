#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

// strncpy, fgets ���� ���� �����÷θ� ȸ���ϱ� ���� ���Ǵ� ��ǥ���� �Լ����̴�.
// ������ �̷��� �Լ����� ������ ������ �Ѵ� ���ڿ��� ���ؼ��� �ܼ��� �߶�����ٴ� ������
// �ִ�. �̴� �������� �սǰ� ���Ҿ� ����Ʈ������ ��༺�� �� �� �ִ�.

int main() {
	const char* src = "hello, world";
	char dst[5];

	strncpy(dst, src, sizeof(dst)); // strcpy(dst, src);
	printf("%s\n", dst);
}
#endif

#if 1
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

// �������� �ս� �Ǵ� �� ���ڷ� ������� �ʴ� �Ϳ� ���� ��� �ڵ带 �ۼ��ϴ� ���� �����ϴ�.
int main() {
	const char* src = "hello, world";
	char dst[5];


	// 1. �� �˻�
	if (src == NULL) {
		fprintf(stderr, "���ڿ��� �����ϴ�.\n");
		return -1;
	}
	// 2. �纻�� ũ�⺸�� ������ ũ�Ⱑ �� ū���� ����
	else if (strlen(src) >= sizeof(dst)) {
		fprintf(stderr, "���ڿ��� �ʹ� ��ϴ�.\n");
		return -1;
	}
	else {
		strncpy(dst, src, sizeof(dst));
		printf("%s\n", dst);
	}
	return 0;

}












#endif