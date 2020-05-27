#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <errno.h>	// errno;
#include <string.h>	// strerror()

void print_error(const char* msg) {
	fprintf(stderr, "%s: %s\n", msg, strerror(errno));
}

int main() {
	FILE* fp = fopen("xxx", "r");
	if (fp == NULL) {
		// fprintf(stderr, "fopen error\n");

		// 표준 라이브러리는 함수 호출 실패 시, 이를 식별할 수 있도록 에러 코드를 제공합니다.
		// 이를 사용하려면 errno.h 파일을 포함시켜야 합니다.
		//fprintf(stderr, "fopen error: %d\n", errno);

		// 표준 라이브러리는 에러 코드를 문자열로 변환해주는 함수를 제공합니다.
		//fprintf(stderr, "fopen error: %s\n", strerror(errno));

		
		// print_error("fopen");
		// 이미 위와 같은 함수는 표준 라이브러리에서 제공합니다.
		perror("fopen");
		return -1;
	}

	char buf[4096];
	fgets(buf, sizeof(buf), fp);
	fputs(buf, stdout);

	fclose(fp);
	return 0;
}