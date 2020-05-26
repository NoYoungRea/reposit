
// 인라인 키워드는 명령이 아니라 힌트이므로 상황에 따라
// 동작하지 않을 수 있습니다.

#if 0
// 인라인 키워드가 동작하지 않는 경우 1. 함수 포인터를 사용하는 경우
// 함수 포인터는 함수의 시그니처가 동일한 경우, 다 호출할 수 있습니다.
#include <stdio.h>

       void foo() {}
inline void goo() {}

int main() {
    foo();  // call foo
    goo();  // inline goo

    int n;
    scanf("%d", &n);

    void(*fp)();
    if (n == 0)
        fp = foo;
    else
        fp = goo;

    fp();   // call
}
#endif

// 인라인 키워드가 동작하지 않는 경우 2. 함수의 크기가 큰 경우
// 때문에 함수의 라인 수가 2~3줄 이하인 경우의 함수에만 inline 키워드를 사용하기를 권장합니다.

#include <stdio.h>

// 인라인 키워드가 동작하지 않는 경우 3. 재귀 호출
inline int fact(int n) {
    if (n == 1)
        return 1;
    return n * fact(n - 1);
}

int main() {
    printf("%d\n", fact(5));
}

// 인라인 함수의 단점: 자칫 목적 파일의 크기가 커질 수 있습니다.
