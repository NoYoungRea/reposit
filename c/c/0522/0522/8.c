
#include <stdio.h>

// char, signed char, unsigned char를 통틀어 문자 타입이라고 한다.
// 이 때, char 타입은 C 표준에서 명확하게 부호 있는 타입인지 부호 없는 타입인지를
// 명시하지 않고 있다.
// 다만 문자를 저장할 때는 char를 부호 없는 정수를 저장할 때는 unsigned char를
// 부호 있는 정수를 저장할 때는 signed char를 사용하라고 권장하고 있다.

// 따라서 수를 저장할 때는 부호의 유무를 정확하게 명시하여 사용해야 한다!

int main() {
	unsigned char c = 200;
	int i = 1000;
	printf("%d\n", i / c);
	
}