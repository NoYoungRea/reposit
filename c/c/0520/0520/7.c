
#if 0
#include <stdio.h>
#include <assert.h>

// assert: 취약성이 될 수 있는 소프트웨어의 결점을 찾아내는데 효과적인 도구
// 단점
// 1. abort 함수를 호출하므로 서버나 임베디드 시스템에는 사용하기가 부적합 함!
// 2. 함수이므로 반드시 프로그램이 구동되어야만 검사 가능함(런타임 오버헤드가 발생)
// 3. 경우에 따라서는 동작하지 않을 수도 있음
typedef struct {
	char cmd;	// 패킷의 종류
	int  len;	// 패킷의 길이
	// 데이터
} Header;

void foo(int* p) {
	// if (p == NULL) return;
	assert(p != NULL);
}

int main() {
	//if (sizeof(Header) != 5) {
	//	fprintf(stderr, "header size is not 5\n");
	//	return -1;
	//}
	if (0)
		assert(sizeof(Header) == 5);	// 헤더의 크기는 5이어야 합니다.(단정)
}
#endif

#if 1
//#include <stdio.h>
//#include <assert.h>
#define __JOIN(x, y)  x##y
#define JOIN(x, y)  __JOIN(x, y)
#define STATIC_ASSERT(e)  \
  typedef char JOIN(assertion_failed_at_line_, __LINE__)[(e) ? 1 : -1]

typedef struct {
	char cmd;
	int  len;
} Header;


int main() {
	int arr;
	// assert(sizeof(Header) == 5);	
	STATIC_ASSERT(sizeof(Header) == 5);	
}
#endif
