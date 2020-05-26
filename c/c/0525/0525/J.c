#if 1
#define _CRT_SECURE_NO_WARNINGS
// ������ ũ�⸦ ����ϴ� �ڵ带 ������ ���ô�.
#include <stdio.h>

// ���� ����� �Լ��� ��ȯ ���� ����� ���� int�� ����ؾ� �մϴ�.
// �׷��� ���� ���� ���, EOF�� ������ �� �����ϴ�.
// fgetc, getc, getchar...

int main() {
	FILE* fp = fopen("d:\\a.exe", "rb");
	if (fp == NULL) {
		fprintf(stderr, "fopen");
		return -1;
	}

	size_t fsize = 0;
	int ch = fgetc(fp);	// ������ ���� ������ EOF(End Of File)�� ��ȯ�˴ϴ�.
	// 1. ���Ϸκ��� �о�� ����Ʈ�� ��ȣ ���� ���� Ÿ���� ����Ʈ�� ��ȯ�մϴ�.
	// 0xFF => unsigned char
	
	// 2. �о�� ����Ʈ�� 4����Ʈ�� ��ȣ �ִ� ������ Ȯ���մϴ�.
	// 0x000000FF => 255

	while (ch != EOF) {	// 0xFFFFFFFF
		++fsize;
		ch = fgetc(fp);
	}

	printf("%u\n", fsize);
	return 0;
}
#endif



#if 0
#include <stdio.h>

int main() {
	// ��ȣ ���� ���� Ÿ���� Ȯ��� ���, Ȯ�� ��Ʈ�� 0���� ä������ �˴ϴ�.
	//unsigned char sc = 0xFF;	//                               1111 1111 == 255
	//signed int si = sc;			// 0000 0000 0000 0000 0000 0000 1111 1111
	//printf("%d\n", si);

	// ��ȣ �ִ� ���� Ÿ���� Ȯ��� ���, Ȯ�� ��Ʈ�� 1�� ä������ �˴ϴ�.
	signed char sc = 0xFF;		//                               1111 1111 == -1 
	signed int si = sc;			// 1111 1111 1111 1111 1111 1111 1111 1111
	printf("%d\n", si);
}
#endif














