
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
// fgets: ���ۺ��� ���� ���� ������ ������ ���Եǰ� �� ���� �η� �����ϴ�.
// ������ ũ�⺸�� ���ų� ū ���� ������ ���� ���� �߰��մϴ�.

int main() {
	char buf[32];
	for (int i = 0; i < 32; i++)
		buf[i] = 'X';

	// fgets �Լ��� ������ ���, NULL�� ��ȯ�մϴ�.
	if (fgets(buf, sizeof(buf), stdin)) {
		// ABCE�� ���� ���
		//  0  1  2  3   4  5
		// [A][B][C][D][10][0]

		// ��Ȳ�� ���� ������ �ƴ� ���� �Էµ� ���
		// [0]....
		if (*buf) {	// ==> ���� �ƴ� ���ڷ� ���۵Ǵ� ���
			printf("%d\n", strlen(buf));	// 0
			buf[strlen(buf) - 1] = '\0'; // -> �Էµ� ���ڿ����� ������ ����� �ڵ�
		}
		printf("%s", buf);
	}
	else {
		printf("fgets error\n");
		return -1;
	}
	return 0;
}