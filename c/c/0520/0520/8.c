
#include <stdio.h>

// �����ѹ��� ȸ���ϴ� ��� 1. ���(constant)
// ����: �޸� ����, �б⹮(switch)�� ��� �Ұ���
//const int RED = 0;
//const int GREEN = 1;
//const int BLUE = 2;

// �����ѹ��� ȸ���ϴ� ��� 2. ��ũ�� ���
// ����: ���� �����ϱ� �����, ������� �����
//#define RED	(0)
//#define GREEN	(1)
//#define BLUE	(2)

// �����ѹ��� ȸ���ϴ� ��� 3. ������
enum Color { RED, GREEN, BLUE };
enum Log { ERR, WRAN, INFO };

//void paintColor(int color) {
void paintColor(enum Color color) {
	switch (color) {
	case RED: printf("RED\n"); break;
	case GREEN: printf("GREEN\n"); break;
	case BLUE: printf("BLUE\n"); break;
	}
}

int main() {
	paintColor(RED);
	paintColor(0);
	paintColor(ERR);
}