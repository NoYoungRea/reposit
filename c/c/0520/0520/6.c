
#include <stdio.h>

// ������ �ʴ� ��ü�� ���ؼ��� const�� �����϶�!
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