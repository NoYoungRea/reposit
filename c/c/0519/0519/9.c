#define _CRT_SECURE_NO_WARNINGS

#if 0
// ��ũ�θ� �߰��ϰ� ����� ��� 1. ��ũ�� �Լ��� ��� ���ڿ� ��ȣ�� ����϶�!
#include <stdio.h>
// #define SQR(x)	x*x
#define SQR(x)	(x)*(x)

int main() {
	// int n = SQR(2);
	int n = SQR(2 + 1);	// 2 + 1*2 + 1 -> (2 + 1)*(2 + 1)
	printf("%d\n", n);
}
#endif

#if 0
// ��ũ�θ� �߰��ϰ� ����� ��� 1. ��ũ�� �Լ��� ��� ���ڿ� ��ȣ�� ����϶�!
// ��ũ�θ� �߰��ϰ� ����� ��� 2. ġȯ�� ��ũ���� �� �ܰ����� ��ȣ�� ����϶�!
#include <stdio.h>
//#define DBL(x) (x)+(x)
#define DBL(x) ((x)+(x))

int main() {
	// int n = DBL(2);
	int n = DBL(2) * DBL(2); // (2)+(2) * (2)+(2) -> ((2)+(2)) * ((2)+(2))
	printf("%d\n", n);
}
#endif



#if 1
// ��ũ�θ� �߰��ϰ� ����� ��� 1. ��ũ�� �Լ��� ��� ���ڿ� ��ȣ�� ����϶�!
// ��ũ�θ� �߰��ϰ� ����� ��� 2. ġȯ�� ��ũ���� �� �ܰ����� ��ȣ�� ����϶�!
// ��ũ�θ� �߰��ϰ� ����� ��� 3. ��ũ�� ����� ��ȣ�� ����϶�
#include <stdio.h>
#define INFO	(-1)
#define WARN	(-2)
#define ERR		(-3)
	
void printLog(int level, const char* msg) {
	if (level INFO)		// if (-3() -1)
		printf("[INFO] %s\n", msg);
	else if (level == WARN)
		printf("[WARN] %s\n", msg);
	else if (level == ERR)
		printf("[ERR] %s\n", msg);
}

int main() {
	printLog(ERR, "hello, world");
}
#endif







