

#if 0
#include <stdio.h>
#include <stdarg.h>

// int average(int a, int b, int c) { return (a + b + c) / 3; }
// ...: ���� ���ڷ� �����Ϸ��� �Ͽ��� �Ű������� ������ �������� ����� ����
// �������ڸ� ����Ϸ��� �ݵ�� ù ��° �Ű������� �����Ǿ� �־�� �մϴ�.
#define VA_END		(-1)
int average(int a, ...) {
	// 1. ���� ���� ����Ʈ ����
	va_list args;

	// 2. ���� ���� ����Ʈ �ʱ�ȭ
	va_start(args, a);

	int cnt = 0;
	int sum = 0;

	int i = a;
	while (i != VA_END) {
		sum += i;
		++cnt;
		i = va_arg(args, int);	// 3. ���� �Ű� ������ �о��
	}

	// 4. �������� ����Ʈ ������(cleanup)
	va_end(args);
	return cnt ? sum / cnt : 0;
}

int main() {
	// printf("%d\n", average(10, 20, 30, VA_END));
	//                                       ^--- ��Ƽ��

	// ��Ƽ���� ������� �ʰ� ����� �ùٸ��� ����� �� �ֵ��� �Լ��� ������ ������ :D
	printf("%d\n", average(10, 20, 30));
}
// FTP �ּ�: 192.168.30.105
#endif

#if 1
#include <stdio.h>
#include <stdarg.h>

// ���� �ڵ�� ��Ƽ���� �ݵ�� ����ؾ� �Ѵٴ� ������ �ֽ��ϴ�. �̸� �ذ��ϱ� ����
// �Ű������� ������ ����ڷκ��� ���� �޵��� �մϴ�.
int average(int cnt, ...) {
	if (cnt == 0)
		return 0;
	else if (cnt < 0)
		return -1;

	va_list args;
	va_start(args, cnt);

	int sum = 0;
	for (int i = 0; i < cnt; i++)
		sum += va_arg(args, int);
	va_end(args);

	return sum / cnt;
}

int main() {
	printf("%d\n", average(3, 10, 20, 30));
}
#endif