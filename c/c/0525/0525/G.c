
#include <stdio.h>

// ���� ���ڿ� ��� ��, ��Ȯ�� ���ڿ��� ����ؾ� �մϴ�.
// �߸��� ���� ���ڿ� ��� ��, �̴� ������ �����Դϴ�.
int main() {
	const char* msg = "not enough memory";
	int err_code = 3;

	//printf("Report: %d(%s)\n", msg, err_code);
	printf("Report: %s(%d)\n", msg, err_code);
}