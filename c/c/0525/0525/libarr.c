// libarr.c

#include <stdlib.h>


int* arr; // �迭

void create() {
    arr = calloc(10, sizeof(int));
}

void destroy() {
    free(arr);
}

