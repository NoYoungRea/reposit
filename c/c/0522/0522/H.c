
// �ε��Ҽ��� ����� ������ �ݵ�� �ε��Ҽ������� ���� �����϶�!
#if 0
#include <stdio.h>

int main() {
	int a = 533;
	float f = a / 7.0f;
	printf("%f\n", f);
}
#endif

#include <stdio.h>
#include <time.h>

int main() {
	clock_t start = clock();
	// -----------------------------
	for (int i = 0; i < 100000; i++)
		printf("hello, world\n");
	// -----------------------------
	clock_t elapsed = clock() - start;

	printf("%f sec\n", (double)elapsed / CLOCKS_PER_SEC);
}