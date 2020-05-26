
#include <stdio.h>

void printBinary(float f) {
	unsigned int* p = (unsigned int*)&f;
	for (int i = 31; i >= 0; i--) {
		if ((*p >> i) & 0x1)
			printf("1");
		else
			printf("0");
	}
	printf("\n");
}

int main() {
	float f = 10.25f;	// 0 10000010 01001
	printBinary(f);     // 0 10000010 01001000000000000000000
}