
#if 0
// 임시 객체 이야기
#include <stdio.h>

int main() {
	int a = 10;	// 지역 객체: 이름이 있음, 함수가 종료되면 파괴됨
	int b = 20;
	int c;

				   // 임시 객체: 이름이 없음, 문장의 끝을 만나면 파괴됨
	int c = a + b; // int temp = a + b; int c = temp; delete temp;
}
#endif

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

typedef struct {
	char buf[32];
	int len;
} String;

String makeString(const char* str) {
	String s;
	strcpy(s.buf, str);
	s.len = strlen(str);
	return s;
}


// 함수의 반환 값을 시퀀스에서 접근하거나 수정하지 말자!
int main() {
	//printf("%s\n", makeString("hello").buf);

	// 함수의 반환 값을 즉시 사용하지 말고, 변수에 저장하여 사용하는 것이 좋습니다.
	String s = makeString("hello");
	printf("%s\n", s.buf);
}




















