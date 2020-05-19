
// 함수의 반환과 인자 전달
#include <stdio.h>
typedef void(* FP)(int);

void foo(int a) {
	printf("foo(%d)\n", a);
}

//void goo(void(*fp)(int), int a) {
void goo(FP fp, int a) {
	fp(a);
}

//void(*hoo())(int) {
FP hoo() {
	return foo;
}

// void(*zoo(void(*fp)(int)))(int)  {
FP zoo(FP fp) {
	return fp;
}

int main() {
	foo(10);
	goo(foo, 10);
	hoo()(10);
	zoo(foo)(10);
}