// 1.c(main.c)

#include <stdio.h>
extern void create();
extern void destroy();
 
// ��� �ҽ� ���Ͽ��� �迭�� ���� �ɺ���
// �ϰ��� ǥ�� ����� ����ϴ� ���� �����մϴ�.
// int arr[];  // �迭
int* arr;

int main() {
    create();
    // -----------------------------------
    for (int i = 0; i < 10; i++)
        arr[i] = i + 1;

    for (int i = 0; i < 10; i++)
        printf("arr[%d] = %d\n", i, arr[i]);
    //------------------------------------
    destroy();
}

