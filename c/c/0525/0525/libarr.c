// libarr.c

#include <stdlib.h>


int* arr; // ¹è¿­

void create() {
    arr = calloc(10, sizeof(int));
}

void destroy() {
    free(arr);
}

