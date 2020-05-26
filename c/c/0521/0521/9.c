
#include <stdio.h>
#include <string.h>

// 결론! 상수 타입의 객체를 비 상수 타입으로 캐스팅하지 말자!
int mystrlen(const char* str) {
	const char* base = str;
	while (*str)
		++str;
	return str - base;
}

int main() {
	const double PI = 3.14;
	double* p = (double*)&PI;
	*p = 0;
	printf("%f\n", PI);

	char str[] = "hello";
	printf("%d\n", strlen(str));
	printf("%s\n", str);
	printf("%d\n", mystrlen(str));
	printf("%s\n", str);

}
