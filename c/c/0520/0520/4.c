
#if 0
// 미리 정의된 매크로
#include <stdio.h>

int main() {
	printf("%s\n", __FILE__);	// 현재 전처리중인 파일 이름
	printf("%s\n", __DATE__);
	printf("%s\n", __TIME__);
	printf("%d\n", __LINE__);
	printf("%s\n", __func__);		// 함수의 이름, 컴파일러가 제공하는 심볼입니다.(표준)
	printf("%s\n", __FUNCTION__);	// 함수의 이름, 컴파일러가 제공하는 심볼입니다.(비표준)
}
#endif


#include <stdio.h>
#define _TO_STR(x)	#x
#define TO_STR(x)	_TO_STR(x)	
int main() {
	//  x;	// ?
	// 아래의 기능을 사용하여 메시지를 전달하면 다음과 같은 형식으로 출력되도록 매크로를
	// 구현해 보세요 

	// printf("hello" "world");	// 문자열과 문자열 사이에 구분자(공백, 탭, 엔터)가 있을 경우
								// 이를 하나의 문자열로 해석합니다.

	//printf("hello\n");
	//printf("world\n");
	//printf("hello\n"
	//	   "world\n");`
	// printf("hello"6"world");
#pragma message(__FILE__"("__LINE__"):" "hello, world") // D:\....\4.c(23): hello, world
//printf(__FILE__"("__LINE__"):" "hello, world");
printf(__FILE__"("_TO_STR(__LINE__)"):" "hello, world");
#pragma message(__FILE__"("TO_STR(__LINE__)"):" "hello, world")
printf(__FILE__"("TO_STR(__LINE__)"):" "hello, world");

}

