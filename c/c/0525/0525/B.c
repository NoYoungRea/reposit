
#if 0
#include <stdio.h>
#include <stdlib.h>
#define ARR_SZ	(10)

int main() {
	int* p = malloc(sizeof(int) * ARR_SZ);
	if (p == NULL) {
		fprintf(stderr, "malloc error\n");
		return -1;
	}

	// ...
	free(p);
	// p = NULL;

	// 널을 해제하는 것은 안전합니다.
	// free(0);	// ?

	free(p);
}
#endif

#if 0
#include <stdio.h>
#include <stdlib.h>

void Free(void** p) {
	if (p == NULL)
		return;
	if (*p != NULL) {
		free(*p);
		*p = NULL;
	}
}

int main() {
	int* p = malloc(sizeof(int) * 10);
	if (p == NULL) {
		fprintf(stderr, "malloc error\n");
		return -1;
	}

	// ...
	Free(&p);
	printf("%p\n", p);

	Free(&p);
}
#endif

#if 1
#include <stdio.h>
#include <stdlib.h>

#define SAFE_FREE(p)	do {	\
    if ((p)) {					\
	  free((p));				\
	  (p) = NULL;				\
    }							\
  } while(0)

int main() {
	int* p = malloc(sizeof(int) * 10);
	if (p == NULL) {
		fprintf(stderr, "malloc error\n");
		return -1;
	}

	// ...
	FREE(p);
	printf("%p\n", p);

	FREE(p);
}
#endif
