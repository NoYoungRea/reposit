
#include <stdio.h>

// fgets �Լ� ���� ��, ���ڷ� ���޵� ���۴� �� �� ���� ���·� ���ǵǹǷ�
// ����Ͻø� �ȵ˴ϴ�. 
// �� ������ �ذ��Ϸ��� �ش� ���۸� �� ���ڿ��� �����ϸ� �˴ϴ�.
int main() {
	char buf[5] = { 0, };
	if (fgets(buf, sizeof(buf), stdin) == NULL) {
		//  return -1;  exit(-1);
		fprintf(stderr, "fgets error\n");
		*buf = '\0';
	}

	// ...
}
