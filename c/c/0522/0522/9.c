
#if 0
#include <stdio.h>

int main() {
	//printf("%d / %d = %d\n", 4, 3, 4 / 3);		// ��: ���
	//printf("%d / %d = %d\n", -4, 3, -4 / 3);		// ��: ���� 
	//printf("%d / %d = %d\n", 4, -3, 4 / -3);		// ��: ����
	//printf("%d / %d = %d\n", -4, -3, -4 / -3);	// ��: ���

	// ������ ������ ����� �׻� ������ �����ϸ� �ȵ�
	printf("%d %% %d = %d\n", 4, 3, 4 % 3);		// ������: ���
	printf("%d %% %d = %d\n", -4, 3, -4 % 3);	// ������: ����
	printf("%d %% %d = %d\n", 4, -3, 4 % -3);	// ������: ���
	printf("%d %% %d = %d\n", -4, -3, -4 % -3);	// ������: ���� 
}
#endif


#include <stdio.h>

#define Q_MAX	(10)
typedef struct {
	int buf[Q_MAX];
	unsigned int front;	// �����͸� �������� ���� ��ġ ����
	size_t rear;	// �����͸� �����ϱ� ���� ��ġ ����
} Q;

void Qinit(Q *q) { q->front = q->rear = 0; }

void Qput(Q* q, int data) {
	q->buf[q->rear] = data;
	q->rear = (q->rear + 1) % Q_MAX;
}

int main() {

}



















