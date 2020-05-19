
#if 0
#include <stdio.h>

// �Լ� ȣ��� ���� ���� �̾߱�
// ������ ���� ���� ���: Ÿ�� * ������;
// ������ ���� ���� ��, *��ȣ ������ ������
// ������ ���� �ƹ��� ������ �����ϴ�.
// int * a;
// int *a;
// int* a;
// int          *        a;
// int*a;
void initInt(int* n) {
    // ������ ������: *������;
    *n = 0;
}

int main() {
    int age = -343143;

    // �Ʒ��� ���� ������ ���� ����Ͽ� ȣ���ϴ� �����
    // ���� ���� ȣ��(call by value)�̶�� �մϴ�.
    // initInt(age);  // initInt(-343143);

    // �Ʒ��� ���� �ּҸ� ����Ͽ� ȣ���ϴ� �����
    // ���� ���� ���� ȣ���̶�� �մϴ�.
    initInt(&age);    // initInt(0x12FF60);

    printf("age = %d\n", age);
    return 0;
}
#endif


#if 0
// ���� �������� �ǹ�
#include <stdio.h>
// ������: �Ϲ������� �ٸ� �Լ� �ȿ� ���� ������ ���� �ϱ� ���� ���
// ���� ������: �Ϲ������� �ٸ� ������ �Ϲ� ������ �����ϱ� ���� ���
// ���� ������: �Ϲ������� �ٸ� ������ ���� �����͸� �����ϱ� ���� ���
// ���� ������: �Ϲ������� �ٸ� ������ ���� �����͸� �����ϱ� ���� ���
void initInt(int* p) { *p = 0; }
void initPtr(int** pp) { *pp = 0; }
void initPPtr(int*** ppp) { *ppp = 0; }

int main() {
    // �ش� ������ Ÿ���� �˰� �ʹٸ� ���� ���𿡼� �������� �����ϸ� �˴ϴ�.
    int n = -1234343; // ������ ��
    int* ptr = &n;
    int** pptr = &ptr;

    initInt(&n), printf("%d\n", n);
    initPtr(&ptr), printf("%d\n", ptr);
    initPPtr(&pptr), printf("%d\n", pptr);

}
#endif

#if 0
// ����ڷκ��� �̸��� �Է� �޴� �ڵ带 ������ ���ô�.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// ���� ����
// getName �Լ��� �����Ͽ� pName�� �Էµ� �̸��� ������ 
// ������
void getName(char** ppName) {
    char buf[4096];
    scanf("%s", buf);
    int len = strlen(buf);
    *ppName = malloc(sizeof(char) * (len + 1));
    strcpy(*ppName, buf);
}

int main() {
    // ������� �̸��� �����ϴ� �ӽ� ���۸� ����մϴ�.
    // char buf[4096]; // ������ ũ��� 2�� ������ ������ �Ҵ��ϴ� ���� �����ϴ�.

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
// �����Ϳ� ��� �̾߱�
#include <stdio.h>

// ���ͷ�, ���(constant)

int main() {
    int a = 10;
    a = 0;  // ����(���� ���ϴ� ����)
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
     int *p = &i;  // ������(pointer to integer)
     *p = 10;  // OK, ���ü�� ����
     p = 0;    // OK, �����ʹ� ����

     int i = 0;
     ����� �����Ϳ� ���Ͽ� �������� �����ϸ� 
     ���ü�� Ÿ���� �ǹ��մϴ�.
     const int *p = &i; // ��� ���� ������(pointer to constant)
     *p = 10;  // ERROR, ���ü�� ���
     p = 0;  // OK, �����ʹ� ����

     int i = 0;
     int * const p = &i; // ��� ������(constant pointer to)
     *p = 10;  // OK, ���ü�� ����
     p = 0;  // ERROR, �����ʹ� ���

     int i = 0;
     int const * p = &i; // ��� ���� ������(pointer to constant)
     *p = 10;  // ERRPR, ���ü�� ���
     p = 0;  // OK, �����ʹ� ����

    int i = 0;
    const int* const p = &i; // ��� ���� ��� ������
                              // (constant pointer to constant)
    *p = 0; // ERROR, ���ü�� ���
    p = 0;  // ERROR, �����͵� ���
}

// ����! ������ ��ȣ�� �߽����� *��
// ���ʿ� ������ ���ü�� ���ȭ
// �����ʿ� ������ �����Ͱ� ���ȭ�˴ϴ�.
#endif

#if 0
// ������ Ÿ���� ����
#include <stdio.h>

int main(void) {
       int i = 0;    int *pI = 0;
     float f = 0;  float *pF = 0;
     double d = 0; double *pD = 0;

     ������ �������� ������ Ÿ���� �ǹ�
     �����Ϸ����� ���ü�� ũ��(offset) ������ �˷��ֱ� ����
     int x = 300;
     char *p = &x;
     printf("%d\n", *p);

    // 2����Ʈ �̻��� ������ �����մϴ�.
    unsigned int x = 1; // 0x00000001
    unsigned char* p = (unsigned char*)&x;
    if (*p == 1)
        printf("little endian\n");
    else
        printf("big endian\n");
}
#endif


// �迭�� ������ ����
#include <stdio.h>

int main(void) {
    // �迭�� ����: Ÿ�� �迭��[ũ��];
    int arr[3];

    // �迭���� �ǹ�: ù ��° ������ ���� �ּҸ� �ǹ��ϴ� ��� ������
    // arr = 0; // ERROR
    printf("%d\n", arr);
    printf("%d\n", &arr);

    // �迭 ������ ����
    int* p1 = arr;
    int(*p2)[3] = &arr; // int *p2 = &arr;

    printf("sizeof(arr) = %u\n", sizeof arr);

}











