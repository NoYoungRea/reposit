
#include <stdio.h>
#include <stdlib.h>

int main() {
	signed int si = -1;
	unsigned int ui = 1;

	if ((int)ui > si)
		printf("true\n");
	else
		printf("false\n");

	char* p = malloc(-1);
	printf("%p\n", p);
}