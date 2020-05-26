
#include <stdio.h>
#include <stdlib.h>
#define MIN_SIZE	(32)

// 동일한 추상화 레벨의 같은 모듈에서 메모리를 할당하고 해제하는 것이 좋습니다.
int verify_list(char* list, size_t size) {
	if (size < MIN_SIZE) {
		free(list);
		return -1;
	}
	return 0;
}

void process_list(size_t size) {
	char* list = malloc(size);

	if (verify_list(list, size) < 0) {
		free(list);
		return;
	}
	// ...
	free(list);
}