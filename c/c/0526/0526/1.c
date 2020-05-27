
#include <stdio.h>

// fgets 함수 실패 시, 인자로 전달된 버퍼는 알 수 없는 상태로 정의되므로
// 사용하시면 안됩니다. 
// 이 문제를 해결하려면 해당 버퍼를 널 문자열로 설정하면 됩니다.
int main() {
	char buf[5] = { 0, };
	if (fgets(buf, sizeof(buf), stdin) == NULL) {
		//  return -1;  exit(-1);
		fprintf(stderr, "fgets error\n");
		*buf = '\0';
	}

	// ...
}
