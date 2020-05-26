
#if 0
// ���� ó�� �̾߱�
// ��ǻ��: compute + er
#include <stdio.h>

int div(int a, int b) {
	return a / b;
}

int main() {
	int ret = div(4, 0);
	printf("%d\n", ret);
}
#endif

#if 0
#include <stdio.h>

// step 1. �Ʒ��� �Լ��� ġ������ ������ �����մϴ�.
// ������ 0�� ���, ������ �����̱� �����Դϴ�.
//int div(int a, int b) { return a / b; }

// C ������ ���������� �Լ��� ������ ����Ͽ� ���� �ڵ带 ��ȯ�մϴ�.
// 0: �Լ� ȣ���� ������ ���(������ �߻����� ���� ���)
// 0�̿��� ������ -> �Ϲ������� -1�� ���: �Լ� ȣ���� ������ ���(������ �߻��� ���)
int div(int a, int b) {
	if (b == 0)
		return -1;
	return a / b;
}

int main() {
	// �Լ��� ȣ��� ���Ŀ��� �Լ��� ��ȯ ���� Ȯ���ؾ� �մϴ�.
	int ret = div(4, 0);
	if (ret == -1) {
		fprintf(stderr, "divide by zero\n");
		return -1;
	}
	printf("%d\n", ret);
}
#endif



#if 0
#include <stdio.h>

// step 2. ������ �ڵ忡���� �Լ��� ���Ͽ� ����� ���� �ڵ尡 ȥ��Ǿ� �ִٴ�
// ������ �ֽ��ϴ�. �̸� �ذ��ϱ� ���� ����� �����ڵ带 �и��մϴ�.

// �ذ� ���
// 1. ���� �ڵ带 �Լ��� ��ȯ���� ó���մϴ�.
// 2. ���� ����� ���ڷ� �����մϴ�.
int div(int a, int b, int *out) {
	// ������ ���
	if (b == 0 || out == NULL)
		return -1;

	*out = a / b;
	return 0;
}

int main() {
	// �Լ��� ȣ��� ���Ŀ��� �Լ��� ��ȯ ���� Ȯ���ؾ� �մϴ�.
	int ret;
	if (div(4, 0, &ret) == -1) {
		fprintf(stderr, "divide by zero\n");
		return -1;
	}
	printf("%d\n", ret);
}
#endif

#if 1
#include <stdio.h>

// step 2. ������ �ڵ�� �Լ��� ���� �ڵ� �Ǵ� ���� ������ ��ȯ�ϴ��� �� �� ���ٴ�
// ������ �ֽ��ϴ�. �̸� �ذ��ϱ� ���� typedef�� ����մϴ�.
typedef int error_t;
//int div(int a, int b, int *out) {
error_t div(int a, int b, int *out) {
	// ������ ���
	if (b == 0 || out == NULL)
		return -1;

	*out = a / b;
	return 0;
}

int main() {
	// �Լ��� ȣ��� ���Ŀ��� �Լ��� ��ȯ ���� Ȯ���ؾ� �մϴ�.
	int ret;
	if (div(4, 0, &ret) == -1) {
		fprintf(stderr, "divide by zero\n");
		return -1;
	}
	printf("%d\n", ret);
}
#endif

// ���! ���� �ڵ带 ��ȯ�ϴ� �Լ��� ��ȯ Ÿ���� ���ڵ��Ͽ� ����ڿ��� �˷��ִ� ���� ����. :D


