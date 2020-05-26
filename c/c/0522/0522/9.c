
#if 0
#include <stdio.h>

int main() {
	//printf("%d / %d = %d\n", 4, 3, 4 / 3);		// 몫: 양수
	//printf("%d / %d = %d\n", -4, 3, -4 / 3);		// 몫: 음수 
	//printf("%d / %d = %d\n", 4, -3, 4 / -3);		// 몫: 음수
	//printf("%d / %d = %d\n", -4, -3, -4 / -3);	// 몫: 양수

	// 나머지 연산의 결과가 항상 양수라고 가정하면 안됨
	printf("%d %% %d = %d\n", 4, 3, 4 % 3);		// 나머지: 양수
	printf("%d %% %d = %d\n", -4, 3, -4 % 3);	// 나머지: 음수
	printf("%d %% %d = %d\n", 4, -3, 4 % -3);	// 나머지: 양수
	printf("%d %% %d = %d\n", -4, -3, -4 % -3);	// 나머지: 음수 
}
#endif


#include <stdio.h>

#define Q_MAX	(10)
typedef struct {
	int buf[Q_MAX];
	unsigned int front;	// 데이터를 꺼내오기 위한 위치 정보
	size_t rear;	// 데이터를 저장하기 위한 위치 정보
} Q;

void Qinit(Q *q) { q->front = q->rear = 0; }

void Qput(Q* q, int data) {
	q->buf[q->rear] = data;
	q->rear = (q->rear + 1) % Q_MAX;
}

int main() {

}



















