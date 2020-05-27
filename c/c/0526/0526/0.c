
// fgets 함수를 사용할 때, 항상 개행 문자가 읽혀질 거라고 가정하시면 안됩니다.
// fgets 함수는 보통 입력 스트립으로부터 개행 문자로 종료된 문자열을 읽기 위해
// 사용한다. 이 때, 문자열의 끝에는 개행과 널이 포함되는데 만약 주어진 버퍼의 
// 크기를 넘어서서 입력될 경우, 버퍼의 끝은 널로만 채워진다.
#include <stdio.h>
#include <string.h>

int main() {
	char buf[5];

	fgets(buf, sizeof(buf), stdin);
	
	// 해당 문자열에 특정 문자가 있는지 확인하는 함수: strchr
	char* p = strchr(buf, '\n');
	if (p) {
		*p = '\0';
	}
	for (int i = 0; i < 5; i++)
		printf("[%d]", buf[i]);
	printf("\n");

	return 0;
}