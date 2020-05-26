
// z.c
// void*: 순수하게 주소만 담을 수 있는 포인터
// 대상체의 정보가 없기 때문에 역참조, 제한적인 산술 연산이 불가능
int main() {
	int age = 10;
	void* p = &age;
	// *p = 0;	// ERROR

	void* q;
	p - q;
	p + 1;
	p - 1;


}