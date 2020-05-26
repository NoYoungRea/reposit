#define  _CRT_SECURE_NO_WARNINGS

#if 0
#include <stdio.h>

int main() {
	int age;
	printf("input age: ");

	int ret = scanf("%d", &age);
	if (ret != 1 || ret == EOF) {
		fprintf(stderr, "scanf error\n");
		return -1;
	}
	printf("%d\n", age);
	return 0;
}
#endif

#if 0
#include <stdio.h>
#include <stdlib.h>

int main() {
	char buf[32];
	printf("input age: ");
	fgets(buf, sizeof(buf), stdin);

	int age = atoi(buf);
	printf("%d\n", age);
	return 0;
}
#endif

#if 1
#include <stdio.h>
#include <stdlib.h>
#include <errno.h>	// int errno;

// atoi, atol, atoll �Լ��� ������
// 1. ���� �߻� ��, errno ���� �������� ����
// 2. ǥ���� �� ���� ���� ���� ���, ������ ����
// 3. ���ڿ��� ���ڰ� �ƴ� �ٸ� ���ڰ� ���Ե� ���, 0�� ��ȯ�� -> ���� ó�� �Ұ���

// strtol, strtoll, ...
int main() {
	char buf[32];
	printf("input age: ");
	fgets(buf, sizeof(buf), stdin);

	char* endPtr;
	errno = 0;	// �� ������ �ڵ� �ʱ�ȭ�� �ȵǹǷ� ��� �� �ݵ�� 0���� �ʱ�ȭ�ؾ� �մϴ�.
	long age = strtol(buf, &endPtr, 10);
	if (errno == ERANGE) {	// 1. ���� ������ �Ѿ ���
		perror("strtol");
		return -1;
	}
	else if (endPtr == buf) {
		fprintf(stderr, "���ڰ� �ƴմϴ�.\n");
		return -1;
	}
	else if (*endPtr != '\n' && *endPtr != '\0') {
		fprintf(stderr, "���ڰ� �ƴ� ���ڰ� ���ԵǾ� �ֽ��ϴ�.\n");
		return -1;
	}

	printf("%d\n", age);
	return 0;
}
#endif