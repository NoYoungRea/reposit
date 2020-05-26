#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 패딩비트(padding bit): CPU가 입출력을 빠르게 하기 위해 컴파일러가 추가하는 메모리
// 공간

// C99: 구조체 안에는 이름이 없는 패딩(padding)이 들어갈 수 있으며 이 위치는 컴파일러마다
// 다르게 생성됩니다.

// 결론! 구조체의 크기가 멤버들의 총합이라고 가정하지 말자!
typedef struct {
	char buf[10];
	int len;
} cstring;

cstring* makeString(const char* str) {
	cstring* p = malloc(sizeof(cstring));	// malloc(14);
	strcpy(p->buf, str);
	p->len = strlen(str);
}

int main() {
	printf("%u\n", sizeof(cstring));
	cstring* hello = makeString("hello");
}