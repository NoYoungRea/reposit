
#include <stdio.h>
// Ÿ�� ���ڵ� ��, ��ũ�� ��� typedef�� ����϶�!

// #define cstring char*
typedef char* cstring;

int main() {
	// char *s1;
	cstring s1, s2;	// char* s1, s2;

	s1 = "hello";
	s2 = "world";
	printf("%s\n", s1);
	printf("%s\n", s2);
}