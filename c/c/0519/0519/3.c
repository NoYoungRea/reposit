
#if 0
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

// ������� �̸��� �����ϴ� �ڵ带 ������ ���ô�.
int main() {
	char names[3][32];

	for (int i = 0; i < 3; i++) {
		printf("input name: ");
		scanf("%s", names[i]);
	}

	for (int i = 0; i < 3; i++)
		printf("your name: %s\n", names[i]);
}
#endif

#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

// ���� �ڵ�� ��뷮�� �ڷᱸ���� ���ÿ� �����Ѵٴ� ������ �ֽ��ϴ�.
// ���� �� �����͸� ���� �����մϴ�.
int main() {
	// �Ʒ��� �迭�� ���� �����ϸ� �˴ϴ�. :D
	char(*names)[32] = malloc(sizeof(char) * 3 * 32);	// char names[3][32];

	for (int i = 0; i < 3; i++) {
		printf("input name: ");
		scanf("%s", names[i]);
	}

	for (int i = 0; i < 3; i++)
		printf("your name: %s\n", names[i]);

	free(names);
}
#endif


#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// ���� �ڵ�� �� �޸𸮿� ���Ͽ� ���� �߻��մϴ�.
// �̸� �ذ��ϱ� ���� ���ڿ� �����͸� ����մϴ�.
int main() {
	char* names[3];
	for (int i = 0; i < 3; i++) {
		char buf[32];
		printf("input name: "), scanf("%s", buf);
		names[i] = malloc(sizeof(char) * (strlen(buf) + 1));
													//  ^--- ASCII NUL(\0)
		strcpy(names[i], buf);
	}

	for (int i = 0; i < 3; i++)
		printf("your name: %s\n", names[i]);

	for (int i = 0; i < 3; i++)
		free(names[i]);
}
#endif
#if 1
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// ���� �ڵ�� �ٽ� ���� �޸𸮸� ����Ѵٴ� ������ �߻��մϴ�.
// �̸� �ذ��ϱ� ���� ������ �迭�� ���� �����մϴ�.
int main() {
	// char* names[3];	// stack
	char** names = malloc(sizeof(char*) * 3);	// heap

	for (int i = 0; i < 3; i++) {
		char buf[32];
		printf("input name: "), scanf("%s", buf);
		names[i] = malloc(sizeof(char) * (strlen(buf) + 1));
													//  ^--- ASCII NUL(\0)
		strcpy(names[i], buf);
	}

	for (int i = 0; i < 3; i++)
		printf("your name: %s\n", names[i]);

	// �޸��� ������ �ݵ�� ������ �������� �����ؾ� �մϴ�.
	for (int i = 0; i < 3; i++)
		free(names[i]);
	free(names);
}
#endif
