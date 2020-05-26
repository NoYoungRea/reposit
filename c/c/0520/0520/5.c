
// #include "Point.h"
// #include "Point.h"

// 인클루드 가드(include guard): 조건부 매크로를 사용하여 헤더 파일이 중복 포함되지 않도록 하는 기법
#ifndef _POINT_H_
#define _POINT_H_

typedef struct {
    int x, y;
} Point;
void printPoint(Point p);

#endif

#ifndef _POINT_H_
#define _POINT_H_

typedef struct {
    int x, y;
} Point;
void printPoint(Point p);

#endif