
#include <stdio.h>

// 매직넘버를 회피하는 방법 1. 상수(constant)
// 단점: 메모리 낭비, 분기문(switch)에 사용 불가능
//const int RED = 0;
//const int GREEN = 1;
//const int BLUE = 2;

// 매직넘버를 회피하는 방법 2. 매크로 상수
// 단점: 유지 보수하기 어려움, 디버깅이 어려움
//#define RED	(0)
//#define GREEN	(1)
//#define BLUE	(2)

// 매직넘버를 회피하는 방법 3. 열거자
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