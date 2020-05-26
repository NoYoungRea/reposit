#define _CRT_SECURE_NO_WARNINGS	// 이전 소스 코드에서 복사해 오세요 :D
#include <stdio.h>

// 경계가 불분명한 소스로부터 고정된 길이의 배열에 복사하는 것은 매우 위험합니다.
// 버퍼 오버플로가 발생할 수 있기 때문입니다.

// 해결 방법
// 1. 동적 할당 -> 임시 버퍼에서 오버플로가 발생할 수 있으므로 권장하지 않습니다.
// 2. 허용 가능한 길이를 명시하는 함수 사용
// 3. 포맷 지정자 사용

#define TO_STR(x)	#x
#define STR_SIZE(x)	TO_STR(x)
int main() {
	char buf[32];
	// fgets(buf, sizeof(buf), stdin);	// gets(buf);	// scanf("%s", buf);
	scanf("%"STR_SIZE(20)"s", buf);
	printf("%s\n", buf);

	return 0;
}