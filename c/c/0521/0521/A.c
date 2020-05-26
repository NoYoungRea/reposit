
#include <stdio.h>
#define BUFSZ	(10)

int main() {
	int buf[BUFSZ];

	//int* cur = buf;
	//while (cur < ((char*)buf + sizeof(buf)))
	//	*cur++ = 0;

	for (int i = 0; i < BUFSZ; i++)
		buf[i] = 0;

	for (int i = 0; i < BUFSZ; i++)
		printf("buf[%d] = %d\n", i, buf[i]);
}