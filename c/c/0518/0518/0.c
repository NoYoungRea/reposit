//현재 소스 코드를 컴파일에서 제외하기 위해 조건부 매크로를 사용. 조건절이 거짓이면 전처리기에 의해 제외됨. 
#if 0
#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char* argv[]) {
	printf("heelo,world\n");
	return 0;
}


//주소 이야기
//cpu가 메모리에 접근하기 위해 부여한 방 번호
//방 번호는 0으로 시작하는 양의 정수 
#include<stdio.h>

int main(void) {
	int age = 0;//메모리 어딘가에 4바이트의 크기를 확보하고 그 곳의 이름을 age로 하겠다는 의미. 자동 변수나 지역변수는 모두 스택에 쌓임 
	//자동변수라고 하는 이유 원래 malloc이라는 예약어로 매모리를 잡아야 하는데 함수 안에서 선언한 변수는 별 다른 노력 없이 메모리가 잡힘.
	//그래서 원래 auto를 명시해줘야 하지만 생략해도 된다.
	//주소의 값에 접근하기 위해서 주소를 외워야 하는데, 힘들기때문에 age로 대체.
	//$를 이요하여 실제 주소를 알 수 있음
	printf("%p\n", &age);
	printf("%u\n", &age);
	//000000000062FE1C가 나옴 ->age라는 변수가 위치한 주소.
	//원래 주소를 출력하기 위해 p를 사용하는데 굳이 p를 사용할 필요는 없음. 양의 정수이기 때문에 언사인드 형으로 사용해도 됨. 즉 주소를 복잡하게 
	//생각할 필요가 없음. 16진수로 표현을 하느냐 10진수로 표현을 하느냐 차이임

	return 0;
}

//함수 호출과 실제 인자 이야기
#include<stdio.h>

void initInt(int n) {
	n = 0;
}

void initInt2(int* n) {//그냥 int 로 받으면 안된다. 이넘이 받는게 주소인지 그냥 정수인지 어케 알음 
//* 연산자가 아님 기호라고 함. 저 별표 사이에 공백은 포인터 사용에 아무런 영향읆 미치지 않는다.	
//char* p,q->q는 그냥 char에게만 먹힘, *는 타입과 변수명 사이에 올때 의미 그래서 c언어 개발자들은 변수에 붙여 쓴다.
//반면 c++개발자들은 타입에 * 를 붙여 쓰고  변수를 연속적으로 선언하지 않음 
	*n = 0;//역참조 연산자 
}


int main(void) {
	int age = -343143;

	initInt(age); //initInt(-343143), call by value 참조변수? c에서는 제공 안함. 주소를 보내야 함. 
	printf("%d\n", age);
	initInt2(&age); //initInt(0x12f60) call by reference? 아니다. c언어에서는 값밖에 보내지 못한다. 단지 받을때 주소로 인식을 했다는 것 뿐.
	//참조에 의한 호출을 흉내내는 것. 
	printf("%d\n", age);

	return 0;

}


//다중 포인터의 의미
#include<stdio.h>
//main에서 선언한 변수를 다른 곳에서 참조하기 위해서 포인터를 사용. 이때 대상체가 int일때는 int*를 int*일때는 int**를 사용하는 것 뿐이다. 
void initInt(int* p) {
	*p = 0;
}

void initPtr(int** pp) {
	**pp = 1;
}
void initPPtr(int*** ppp) {
	***ppp = 2;
}

int main() {
	int a = -1234343;
	initInt(&a);
	printf("%d\n", a);

	int* ptr = &a;
	initPtr(&ptr);
	printf("%d\n", a);

	int** pptr = &ptr;
	initPPtr(&pptr);
	printf("%d\n", a);
}



//사용자로부터 이름을 입력받는 코드를 생각해 봅시다. 
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(void) {
	char* pName;
	getName(pName);
	free(pName);
}

void getName(char* pName) {
	//사용자의 이름을 저장하는 임시 버퍼를 사용
	char buf[4096];//왜 이렇게 크게? 운영체제는 데이터를 할당하기 위해 페이지 단위로 할당하는데 2의 지수승 단위로 데이터를 할당하는게 효율적 

	printf("사용자의 이름을 입력해주세요: ");
	scanf("%s", buf);

	int len = strlen(buf);
	printf("%d\n", len);

	pName = malloc(sizeof(char) * (len + 1));//널때문에 +1 해주어야 한다. 
	strcpy(pName, buf);
	printf("your name: %s", pName);


}

#endif

#include <stdio.h>

int main() {
	int a = 10;
	a = 0;//변수

	const int b = 20;
	//b=30;//x

	int* p = (int*)&b;
	*p = 0;
	printf("%d\n", b);

	//값 변경 가능. 컴파일에서 보장되지만, 런타임에서는 보장이 되지 않는다. 
}