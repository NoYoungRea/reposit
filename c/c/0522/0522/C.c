
#include <stdio.h>
#include <limits.h>

// C ���� ��ȣ �ִ� ������ ���Ͽ� ������ ������ ���, ��� ���� ǥ�� ������
// �Ѿ�� �̸� �����÷ζ�� �մϴ�.

// C���� ���� �����÷δ� ������ �����̹Ƿ� ��ȣ �ִ� ������ ���Ͽ� ��� ���� ��,
// ���� �����÷ΰ� �߻����� �ʵ��� �ؾ� ��
int main() {
	signed int sint1, sint2, result = 0;
	sint1 = INT_MAX;
	sint2 = 1;

	if ((((sint1 > 0) && (sint2 > 0)) && (sint1 + sint2 < 0)) ||
		(((sint1 < 0) && (sint2 < 0)) && (sint1 + sint2 > 0))) {
		fprintf(stderr, "���� �����÷� �߻�\n");
		return -1;
	}

	result = sint1 + sint2;
	printf("%d\n", result);

	return 0;
}