
#if 0
#include <stdio.h>

struct Test {
	int arr[0];	//  OK
};

int main() {
	// int arr[0];	// ERROR
	struct Test t;
}
#endif

#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct {
	int age;
	char name[32];
} Person;

int main() {
	// 사용자로부터 이름과 나이를 입력 받았다고 가정합니다.
	char name[32] = "daniel";
	int age = 20;

	Person* p = (Person*)malloc(sizeof(Person));
	strcpy(p->name, name);
	p->age = age;
	printf("%s, %d\n", p->name, p->age);

	free(p);
}
#endif

#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// 이전 코드는 이름을 저장하기 위해 정적 배열을 사용하고 있다는 단점이 있습니다.
// 이를 해결하기 위해 포인터를 사용합니다.
typedef struct {
	int age;
	char *name; // char name[32];
} Person;

int main() {
	char name[32] = "daniel";
	int age = 20;

	Person* p = (Person*)malloc(sizeof(Person));
	p->name = malloc(strlen(name) + 1);
	strcpy(p->name, name);
	p->age = age;
	printf("%s, %d\n", p->name, p->age);

	// 자원의 해제는 생성의 역순으로!
	free(p->name);
	free(p);
}
#endif


#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>`
// 이전 코드는 동적 할당으로 인한 성능 상의 이슈와 메모리 누수 가능성이 있습니다.
// 이를 해결해 봅시다.
typedef struct {
	int age;
	char name[1];	// char *name;
		//    ^--- ASCII NUL;
} Person;

int main() {
	char name[32] = "susan";
	int age = 20;

	Person* p = (Person*)malloc(sizeof(Person) + strlen(name));
	// p->name = malloc(strlen(name) + 1);
	strcpy(p->name, name);
	p->age = age;
	printf("%s, %d\n", p->name, p->age);

	// free(p->name);
	free(p);
}
#endif

#if 0
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct {
	int age;
	char name[0];
} Person;

int main() {
	char name[32] = "susan";
	int age = 20;

	Person* p = (Person*)malloc(sizeof(Person) + strlen(name) + 1);
	strcpy(p->name, name);
	p->age = age;
	printf("%s, %d\n", p->name, p->age);

	free(p);
}
#endif

#if 1
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct {
	int age;
	char name[];	// flexible array member(C99): 배열의 길이 정보가 없는 멤버 필드
					// 제약 조건: 반드시 구조체의 마지막 멤버로 위치해야 합니다.
					// 반드시 1개만 존재해야 합니다.
} Person;

int main() {
	char name[32] = "susan";
	int age = 20;

	Person* p = (Person*)malloc(sizeof(Person) + strlen(name) + 1);
	strcpy(p->name, name);
	p->age = age;
	printf("%s, %d\n", p->name, p->age);

	free(p);
}
#endif
