#define _CRT_SECURE_NO_WARNINGS	// ���� �ҽ� �ڵ忡�� ������ ������ :D
#include <stdio.h>

// ��谡 �Һи��� �ҽ��κ��� ������ ������ �迭�� �����ϴ� ���� �ſ� �����մϴ�.
// ���� �����÷ΰ� �߻��� �� �ֱ� �����Դϴ�.

// �ذ� ���
// 1. ���� �Ҵ� -> �ӽ� ���ۿ��� �����÷ΰ� �߻��� �� �����Ƿ� �������� �ʽ��ϴ�.
// 2. ��� ������ ���̸� ����ϴ� �Լ� ���
// 3. ���� ������ ���

#define TO_STR(x)	#x
#define STR_SIZE(x)	TO_STR(x)
int main() {
	char buf[32];
	// fgets(buf, sizeof(buf), stdin);	// gets(buf);	// scanf("%s", buf);
	scanf("%"STR_SIZE(20)"s", buf);
	printf("%s\n", buf);

	return 0;
}