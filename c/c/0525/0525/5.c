
#include <stdio.h.>

// ���ڿ� ����� ���� �����͸� ������ ���, �ݵ�� ��� ���� �����͸�
// ����ؾ� �մϴ�.

int main() {
	// ���� �������� ������ ������ :D
    char s1[] = "hello, world";				// ���ڿ� �迭
	const char *s2 = "hello, world";		// ���ڿ� ������

	 s1[0] = ' ';	// OK
	 s2[0] = ' ';	// ??

	 printf("%s\n", s1);
	 printf("%s\n", s2);
}