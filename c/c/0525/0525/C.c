
#include <stdio.h>
#include <stdlib.h>
typedef struct {
	char name[32];
	int age;
} Person;

typedef struct {
	char name[32];
	int age;
	int id;	// �й�
} Student;

// �޸� �Ҵ� �Լ��� ��ȯ ���� ��� �Ҵ�� Ÿ���� �����ͷ� ��ȯ��Ű�� ���� ����.
// �̴� ������ ������ Ÿ�԰� ��ġ���� ���� ���, ��� �߻���ų �� �ֱ� �����̴�.

#define MALLOC(T)	(T*)malloc(sizeof(T))
int main() {
	//Student* p = (Student*)malloc(sizeof(Person));		
	//Student* p = (Person*)malloc(sizeof(Person));		
	Student* p = MALLOC(Person);
	p->age = 20;
	getchar();
	p->id = 20190201;
}
