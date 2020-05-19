
#if 0
#include <stdio.h>

// 함수 호출과 실제 인자 이야기
// 포인터 변수 선언 방법: 타입 * 변수명;
// 포인터 변수 선언 시, *기호 주위의 공백은
// 포인터 선언에 아무런 영향이 없습니다.
// int * a;
// int *a;
// int* a;
// int          *        a;
// int*a;
void initInt(int* n) {
    // 역참조 연산자: *포인터;
    *n = 0;
}

int main() {
    int age = -343143;

    // 아래와 같이 변수의 값을 사용하여 호출하는 방식을
    // 값에 의한 호출(call by value)이라고 합니다.
    // initInt(age);  // initInt(-343143);

    // 아래와 같이 주소를 사용하여 호출하는 방식을
    // 역시 값에 의한 호출이라고 합니다.
    initInt(&age);    // initInt(0x12FF60);

    printf("age = %d\n", age);
    return 0;
}
#endif


#if 0
// 다중 포인터의 의미
#include <stdio.h>
// 포인터: 일반적으로 다른 함수 안에 사용된 변수를 참조 하기 위해 사용
// 일중 포인터: 일반적으로 다른 지역의 일반 변수를 참조하기 위해 사용
// 이중 포인터: 일반적으로 다른 지역의 일중 포인터를 참조하기 위해 사용
// 삼중 포인터: 일반적으로 다른 지역의 이중 포인터를 참조하기 위해 사용
void initInt(int* p) { *p = 0; }
void initPtr(int** pp) { *pp = 0; }
void initPPtr(int*** ppp) { *ppp = 0; }

int main() {
    // 해당 변수의 타입을 알고 싶다면 변수 선언에서 변수명을 제거하면 됩니다.
    int n = -1234343; // 쓰레기 값
    int* ptr = &n;
    int** pptr = &ptr;

    initInt(&n), printf("%d\n", n);
    initPtr(&ptr), printf("%d\n", ptr);
    initPPtr(&pptr), printf("%d\n", pptr);

}
#endif

#if 0
// 사용자로부터 이름을 입력 받는 코드를 생각해 봅시다.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// 연습 문제
// getName 함수를 구현하여 pName에 입력된 이름을 저장해 
// 보세요
void getName(char** ppName) {
    char buf[4096];
    scanf("%s", buf);
    int len = strlen(buf);
    *ppName = malloc(sizeof(char) * (len + 1));
    strcpy(*ppName, buf);
}

int main() {
    // 사용자의 이름을 저장하는 임시 버퍼를 사용합니다.
    // char buf[4096]; // 버퍼의 크기는 2의 지수승 단위로 할당하는 것이 좋습니다.

    // printf("input name: ");
    // scanf("%s", buf);

    // int len = strlen(buf);
    // char *pName = malloc(sizeof(char) * (len + 1));
    //                                         // ^--- ASCII NUL(\0)
    // strcpy(pName, buf);
    char* pName;
    getName(&pName);
    printf("your name: %s", pName);
    free(pName);
    return 0;
}
#endif

#if 0
// 포인터와 상수 이야기
#include <stdio.h>

// 리터럴, 상수(constant)

int main() {
    int a = 10;
    a = 0;  // 변수(값이 변하는 공간)
    const int b = 20;
    // b = 30; // ??

    int* p = (int*)&b;
    *p = 0;
    printf("%d\n", b);
}
#endif


#if 0
#include <stdio.h>

int main(void) {
     int i = 0;
     int *p = &i;  // 포인터(pointer to integer)
     *p = 10;  // OK, 대상체는 변수
     p = 0;    // OK, 포인터는 변수

     int i = 0;
     선언된 포인터에 대하여 변수명을 제거하면 
     대상체의 타입을 의미합니다.
     const int *p = &i; // 상수 지시 포인터(pointer to constant)
     *p = 10;  // ERROR, 대상체는 상수
     p = 0;  // OK, 포인터는 변수

     int i = 0;
     int * const p = &i; // 상수 포인터(constant pointer to)
     *p = 10;  // OK, 대상체는 변수
     p = 0;  // ERROR, 포인터는 상수

     int i = 0;
     int const * p = &i; // 상수 지시 포인터(pointer to constant)
     *p = 10;  // ERRPR, 대상체는 상수
     p = 0;  // OK, 포인터는 변수

    int i = 0;
    const int* const p = &i; // 상수 지시 상수 포인터
                              // (constant pointer to constant)
    *p = 0; // ERROR, 대상체도 상수
    p = 0;  // ERROR, 포인터도 상수
}

// 정리! 포인터 기호를 중심으로 *가
// 왼쪽에 있으면 대상체가 상수화
// 오른쪽에 있으면 포인터가 상수화됩니다.
#endif

#if 0
// 포인터 타입의 이해
#include <stdio.h>

int main(void) {
       int i = 0;    int *pI = 0;
     float f = 0;  float *pF = 0;
     double d = 0; double *pD = 0;

     포인터 변수에서 포인터 타입의 의미
     컴파일러에게 대상체의 크기(offset) 정보를 알려주기 위함
     int x = 300;
     char *p = &x;
     printf("%d\n", *p);

    // 2바이트 이상의 변수를 선언합니다.
    unsigned int x = 1; // 0x00000001
    unsigned char* p = (unsigned char*)&x;
    if (*p == 1)
        printf("little endian\n");
    else
        printf("big endian\n");
}
#endif


// 배열의 포인터 선언
#include <stdio.h>

int main(void) {
    // 배열의 선언: 타입 배열명[크기];
    int arr[3];

    // 배열명의 의미: 첫 번째 원소의 시작 주소를 의미하는 상수 포인터
    // arr = 0; // ERROR
    printf("%d\n", arr);
    printf("%d\n", &arr);

    // 배열 포인터 선언
    int* p1 = arr;
    int(*p2)[3] = &arr; // int *p2 = &arr;

    printf("sizeof(arr) = %u\n", sizeof arr);

}











