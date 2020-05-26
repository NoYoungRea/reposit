
#include <stdio.h>

// 변하지 않는 객체에 대해서는 const로 선언하라!
typedef struct {
	int x, y;
	// ...
} Point;

//void printPoint(Point p) {
void printPoint(const Point *p) {
	printf("(%d,%d)\n", p->x, p->y);
}

int main() {
	Point p = { 0, };
	printPoint(&p);
}