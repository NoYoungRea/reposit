
#include <stdio.h>

int main() {
	double sum = 0.0;
	for (int i = 0; i < 1000; i++)
		sum += 0.1;
	printf("%f\n", sum);
}