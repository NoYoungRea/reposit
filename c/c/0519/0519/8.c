
#include <stdio.h>
#define SQR(x)	x*x

int __stdcall sqr(int x) {
	int result = x * x; 
	return result;  // mov eax, result
}

int main() {
	int n = SQR(2);	// int n = 2*2; -> int n = 4;

	// int result = sqr(2);	
	// int n;

	// _asm ��ɾ ����ϸ� �ҽ� �ڵ� �ȿ� ������� �ڵ带 ������ �� �ֽ��ϴ�.
	//  sqr(2); -> �Ű������� �����ʿ������� ���ÿ� ����˴ϴ�.
	//__asm {
	//	push 2
	//	call sqr
	//	mov n, eax
	//}

	printf("%d\n", n);
}