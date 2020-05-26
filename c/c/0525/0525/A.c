
#include <stdio.h>
#include <stdlib.h>
#define MIN_SIZE	(32)

// ������ �߻�ȭ ������ ���� ��⿡�� �޸𸮸� �Ҵ��ϰ� �����ϴ� ���� �����ϴ�.
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