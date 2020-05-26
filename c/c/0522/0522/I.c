
#if 0
#include <stdio.h>
#include <limits.h>

int main() {
	float f = 10000000000.0f; // 100억
	int i = 0;

	if (f > (float)INT_MAX || f < (float)INT_MIN) {
		fprintf(stderr, "부동소수점 수가 너무 큽니다.\n");
		return -1;
	}
	
	i = f;
	printf("%f\n", f);
	printf("%d\n", i);
}
#endif



#include <stdio.h>
#include <float.h>

int main() {
	float f;
	double d = DBL_MAX;

	if (d > FLT_MAX || d < -FLT_MAX) {
		fprintf(stderr, "부동소수점이 수가 너무 큽니다.\n");
		return -1;
	}

	f = d;
	printf("%f\n", DBL_MAX);
	printf("%f\n", f);
}

















