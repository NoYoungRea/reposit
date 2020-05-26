
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 동적으로 할당된 메모리만 해제해야 합니다.

int main() {
	const char* name = "daniel";

	// char* p = realloc(name, strlen(name) * 2);
	// ...

	char* p = malloc(strlen(name) * 2);
	strcpy(p, name);
	
}