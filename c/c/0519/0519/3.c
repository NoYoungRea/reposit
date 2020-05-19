
#if 0
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

// 사용자의 이름을 저장하는 코드를 생각해 봅시다.
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

// 이전 코드는 대용량의 자료구조를 스택에 생성한다는 단점이 있습니다.
// 이제 이 데이터를 힙에 생성합니다.
int main() {
	// 아래의 배열을 힙에 생성하면 됩니다. :D
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

// 이전 코드는 힙 메모리에 대하여 낭비가 발생합니다.
// 이를 해결하기 위해 문자열 포인터를 사용합니다.
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

// 이전 코드는 다시 스택 메모리를 사용한다는 단점이 발생합니다.
// 이를 해결하기 위해 포인터 배열을 힙에 생성합니다.
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

	// 메모리의 해제는 반드시 생성의 역순으로 해제해야 합니다.
	for (int i = 0; i < 3; i++)
		free(names[i]);
	free(names);
}
#endif
