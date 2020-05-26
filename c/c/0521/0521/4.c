
#include <stdio.h>
#include <string.h>

// restrict: �����Ϳ��� ����� �� �ִ� �����ڷ� �� �����Ͱ� ��ü�� ������ �� �ִ� ������
// �������� �����Ϸ����� �˷��ִ� ������ �մϴ�.
// �����Ͱ� restrict Ű����� �����Ǹ� �� �����Ͱ� ����Ű�� ��ü�� �� �����͸� ���� �����ϹǷ�
// �����Ϸ��� �� �� �������� ����ȭ�� ������ �� �ֽ��ϴ�.
// ���� �� �����ڸ� ����� �����Ϳ� ���Ͽ� ���� ��ü�� ����Ű��(����) �� ����� ������ �����Դϴ�.
void printArray(const int *arr, int len) {
	for (int i = 0; i < len; i++)
		printf("%d ", arr[i]);
	printf("\n");
}

int main() {
	int cnt = 10;
	int arr[10] = { 0,1,2,3,4,5,6,7,8,9 };
	printArray(arr, cnt);

	// ���� �迭 �ڷᱸ������ 0��° ���Ҹ� �����Ѵٰ� �����մϴ�.
	--cnt;
	// arr[0] = arr[cnt];
	//memcpy(arr, arr + 1, sizeof(int) * cnt);
	memmove(arr, arr + 1, sizeof(int) * cnt);
	printArray(arr, cnt);

}
