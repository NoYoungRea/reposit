
#include <stdio.h>
// ���ÿ� ���� ������ ���� �� ���� �ʴ� ���� �����ϴ�.
// �ϳ��� ������ ���ÿ� �� ���, �̿� ���� ������ ����(�����Ϸ�)���� �ٸ��� ���ǵǾ� �־�
// ��� ������ �� ������ �� �����ϴ�.
#define LOG_FILE	"log.txt"

void foo(FILE *log) {
	//FILE* log = fopen(LOG_FILE, "a");
	// ...
}

int main() {
	FILE* log = fopen(LOG_FILE, "a");

	foo(log);

	// ...

}