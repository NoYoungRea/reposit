//���� �ҽ� �ڵ带 �����Ͽ��� �����ϱ� ���� ���Ǻ� ��ũ�θ� ���. �������� �����̸� ��ó���⿡ ���� ���ܵ�. 
#if 0
#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char* argv[]) {
	printf("heelo,world\n");
	return 0;
}


//�ּ� �̾߱�
//cpu�� �޸𸮿� �����ϱ� ���� �ο��� �� ��ȣ
//�� ��ȣ�� 0���� �����ϴ� ���� ���� 
#include<stdio.h>

int main(void) {
	int age = 0;//�޸� ��򰡿� 4����Ʈ�� ũ�⸦ Ȯ���ϰ� �� ���� �̸��� age�� �ϰڴٴ� �ǹ�. �ڵ� ������ ���������� ��� ���ÿ� ���� 
	//�ڵ�������� �ϴ� ���� ���� malloc�̶�� ������ �Ÿ𸮸� ��ƾ� �ϴµ� �Լ� �ȿ��� ������ ������ �� �ٸ� ��� ���� �޸𸮰� ����.
	//�׷��� ���� auto�� �������� ������ �����ص� �ȴ�.
	//�ּ��� ���� �����ϱ� ���ؼ� �ּҸ� �ܿ��� �ϴµ�, ����⶧���� age�� ��ü.
	//$�� �̿��Ͽ� ���� �ּҸ� �� �� ����
	printf("%p\n", &age);
	printf("%u\n", &age);
	//000000000062FE1C�� ���� ->age��� ������ ��ġ�� �ּ�.
	//���� �ּҸ� ����ϱ� ���� p�� ����ϴµ� ���� p�� ����� �ʿ�� ����. ���� �����̱� ������ ����ε� ������ ����ص� ��. �� �ּҸ� �����ϰ� 
	//������ �ʿ䰡 ����. 16������ ǥ���� �ϴ��� 10������ ǥ���� �ϴ��� ������

	return 0;
}

//�Լ� ȣ��� ���� ���� �̾߱�
#include<stdio.h>

void initInt(int n) {
	n = 0;
}

void initInt2(int* n) {//�׳� int �� ������ �ȵȴ�. �̳��� �޴°� �ּ����� �׳� �������� ���� ���� 
//* �����ڰ� �ƴ� ��ȣ��� ��. �� ��ǥ ���̿� ������ ������ ��뿡 �ƹ��� ���⟼ ��ġ�� �ʴ´�.	
//char* p,q->q�� �׳� char���Ը� ����, *�� Ÿ�԰� ������ ���̿� �ö� �ǹ� �׷��� c��� �����ڵ��� ������ �ٿ� ����.
//�ݸ� c++�����ڵ��� Ÿ�Կ� * �� �ٿ� ����  ������ ���������� �������� ���� 
	*n = 0;//������ ������ 
}


int main(void) {
	int age = -343143;

	initInt(age); //initInt(-343143), call by value ��������? c������ ���� ����. �ּҸ� ������ ��. 
	printf("%d\n", age);
	initInt2(&age); //initInt(0x12f60) call by reference? �ƴϴ�. c������ ���ۿ� ������ ���Ѵ�. ���� ������ �ּҷ� �ν��� �ߴٴ� �� ��.
	//������ ���� ȣ���� �䳻���� ��. 
	printf("%d\n", age);

	return 0;

}


//���� �������� �ǹ�
#include<stdio.h>
//main���� ������ ������ �ٸ� ������ �����ϱ� ���ؼ� �����͸� ���. �̶� ���ü�� int�϶��� int*�� int*�϶��� int**�� ����ϴ� �� ���̴�. 
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



//����ڷκ��� �̸��� �Է¹޴� �ڵ带 ������ ���ô�. 
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(void) {
	char* pName;
	getName(pName);
	free(pName);
}

void getName(char* pName) {
	//������� �̸��� �����ϴ� �ӽ� ���۸� ���
	char buf[4096];//�� �̷��� ũ��? �ü���� �����͸� �Ҵ��ϱ� ���� ������ ������ �Ҵ��ϴµ� 2�� ������ ������ �����͸� �Ҵ��ϴ°� ȿ���� 

	printf("������� �̸��� �Է����ּ���: ");
	scanf("%s", buf);

	int len = strlen(buf);
	printf("%d\n", len);

	pName = malloc(sizeof(char) * (len + 1));//�ζ����� +1 ���־�� �Ѵ�. 
	strcpy(pName, buf);
	printf("your name: %s", pName);


}

#endif

#include <stdio.h>

int main() {
	int a = 10;
	a = 0;//����

	const int b = 20;
	//b=30;//x

	int* p = (int*)&b;
	*p = 0;
	printf("%d\n", b);

	//�� ���� ����. �����Ͽ��� ���������, ��Ÿ�ӿ����� ������ ���� �ʴ´�. 
}