
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// �������� �Ҵ�� �޸𸮸� �����ؾ� �մϴ�.

int main() {
	const char* name = "daniel";

	// char* p = realloc(name, strlen(name) * 2);
	// ...

	char* p = malloc(strlen(name) * 2);
	strcpy(p, name);
	
}