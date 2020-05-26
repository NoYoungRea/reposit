
#include <stdio.h>
#include <stdlib.h>
typedef struct {
	char name[32];
	int age;
} Person;

typedef struct {
	char name[32];
	int age;
	int id;	// 학번
} Student;

// 메모리 할당 함수의 반환 값은 즉시 할당된 타입의 포인터로 변환시키는 것이 좋다.
// 이는 좌측의 포인터 타입과 일치하지 않을 경우, 경고를 발생시킬 수 있기 때문이다.

#define MALLOC(T)	(T*)malloc(sizeof(T))
int main() {
	//Student* p = (Student*)malloc(sizeof(Person));		
	//Student* p = (Person*)malloc(sizeof(Person));		
	Student* p = MALLOC(Person);
	p->age = 20;
	getchar();
	p->id = 20190201;
}
