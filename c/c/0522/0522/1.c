
// ������ ����Ʈ(sequence point): ��� ���� ��(���)�� �Ϸ�ǰ� �� ���� �޸𸮿�
// ����Ǵ� ������ �ǹ��մϴ�.
// ����: �Լ� ȣ�� ������(()), ��ǥ(,), �����ݷ�(;), for(), while(), ...

// ������ ����Ʈ���� ��ü�� ���� ���� �� �����ϴ� ���� ������ �����Դϴ�.
// �̴� ������ ����Ʈ���� ��� ���� �򰡵��� ������ ���� �ǵ��� �Һи� �Ǵ� ��ȣ������
// �����Դϴ�. ���� ������ ������ ��� ������ �����Դϴ�.
// ++i + ++i;
// i = ++i + 1;
// arr[i++] = i;
// func(n++, n);

#if 0
#include <stdio.h>
#define SQR(x)	((x)*(x))

int main() {
	int n = 2;
	++n;
	int result = SQR(n);	// int result = ((++n)*(++n));
	printf("%d\n", result);
}
#endif


#include <stdio.h>
#include <assert.h>

int fact(int n) {
	if (n <= 1)
		return 1;
	//return n * fact(--n);
	return n * fact(n - 1);
}

int main() {
	printf("%d\n", fact(5));

	// ������ ��ũ�� �Լ��̹Ƿ� �Լ� ������ ���� �Ҵ�, ����, ���� ���� ������ �����Դϴ�.
	int n = 0;
	assert(++n > 0);
}



















