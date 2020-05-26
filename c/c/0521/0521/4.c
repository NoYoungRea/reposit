
#include <stdio.h>
#include <string.h>

// restrict: 포인터에만 사용할 수 있는 한정자로 그 포인터가 객체에 접근할 수 있는 유일한
// 수단임을 컴파일러에게 알려주는 역할을 합니다.
// 포인터가 restrict 키워드로 한정되면 그 포인터가 가리키는 객체는 그 포인터만 접근 가능하므로
// 컴파일러가 좀 더 적극적인 최적화를 수행할 수 있습니다.
// 만약 이 한정자를 사용한 포인터에 대하여 같은 객체를 가리키면(참조) 그 결과는 미정의 동작입니다.
void printArray(const int *arr, int len) {
	for (int i = 0; i < len; i++)
		printf("%d ", arr[i]);
	printf("\n");
}

int main() {
	int cnt = 10;
	int arr[10] = { 0,1,2,3,4,5,6,7,8,9 };
	printArray(arr, cnt);

	// 위의 배열 자료구조에서 0번째 원소를 제거한다고 가정합니다.
	--cnt;
	// arr[0] = arr[cnt];
	//memcpy(arr, arr + 1, sizeof(int) * cnt);
	memmove(arr, arr + 1, sizeof(int) * cnt);
	printArray(arr, cnt);

}
