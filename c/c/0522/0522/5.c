

#include <stdio.h>
#include <stdint.h>	// unitmax_t -> �ش� �ý��ۿ��� ������ �� �ִ� ��ȣ ���� ���� ū Ÿ��

// �Ʒ��� �ڵ�� �÷����� ���� �ٸ� ���� ������ �˴ϴ�.
// Windows: 64��Ʈ �ý��ۿ��� long�� 4����Ʈ
// Linux: 64��Ʈ �ý��ۿ��� long�� 8����ƮƮ

int main() {
	unsigned int a, b;
	uintmax_t c;// unsigned long c;

	a = 1000000000;	// 10��
	b = 10;

	c = (uintmax_t)a * b;
	printf("%llu\n", c);
}