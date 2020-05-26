#define _CRT_SECURE_NO_WARNINGS	// 이전 소스 코드에서 복사해 오세요 :D
#include <stdio.h>
#include <string.h>

// strtok 함수 사용, 파싱되는 문자열이 보존된다는 가정을 하시면 안됩니다.
// 따라서 원본을 보존하려면 복사하여 사용해야 합니다.
int main() {
	char str[] = "hello, world";
	char copy[32];
	strcpy(copy, str);

	char *token = strtok(copy, ",");
	//printf("%s\n", token);
	printf("%s\n", str);

	return 0;
}