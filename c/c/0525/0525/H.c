
#if 0
#include <stdio.h>

// fopen: 존재하는 파일에 대하여 읽기 전용으로 열었는지 또는 새로운 파일을 생성했는지
// 알 수 없다는 단점이 있습니다.

// 가급적 파일 관련 처리는 운영 체제가 제공하는 API를 사용하는 것이 좋습니다.
// Linux: open, ...
// Windows: CreateFile, ...
int main() {
	const char* fname = "d:\a.txt";	// 이 파일이 존재한다고 가정합니다.
	FILE* fp = fopen(fname, "wt");
	// ...
}
#endif


// rename: 기존의 파일을 새로운 이름으로 변경하는 함수
// 만약 변경할 새로운 이름이 기존 시스템에 존재할 경우
// 1. Linux: 이미 존재하는 파일을 삭제 -> access
// 2. Windows: rename 함수 호출 실패















