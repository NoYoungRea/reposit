; first.asm 

segment .data

segment .text	
	global _asm_main


_asm_main:
	; 레지스터를 사용한 인자 전달 방식은 빠르지만 개수의 제한이 있습니다.
	; 이를 해결하기 위해 스택을 사용합니다.
	; ESP(Extended Stack Pointer)은 top의 개념으로 스택에 저장할 다음 위치를
	; 가리키고 있는 포인터입니다. push 명령어를 사용할 때마다 ESP가 아래로 증가합니다.
	push 20
	push 10
	call add

	; 인자 전달 시 사용한 스택 메모리를 호출한 곳에서 파괴합니다.
	; add esp, 8	

	ret

add:
	mov eax, dword[esp+4]	; eax = 10
	add eax, dword[esp+8]	; eax += 20
	; ret

	; 호출당한 곳에서 스택 메모리를 파괴합니다.
	ret 8	;add esp, 8
