; first.asm 

segment .data

segment .text	
	global _asm_main


_asm_main:
	; �������͸� ����� ���� ���� ����� �������� ������ ������ �ֽ��ϴ�.
	; �̸� �ذ��ϱ� ���� ������ ����մϴ�.
	; ESP(Extended Stack Pointer)�� top�� �������� ���ÿ� ������ ���� ��ġ��
	; ����Ű�� �ִ� �������Դϴ�. push ��ɾ ����� ������ ESP�� �Ʒ��� �����մϴ�.
	push 20
	push 10
	call add

	; ���� ���� �� ����� ���� �޸𸮸� ȣ���� ������ �ı��մϴ�.
	; add esp, 8	

	ret

add:
	mov eax, dword[esp+4]	; eax = 10
	add eax, dword[esp+8]	; eax += 20
	; ret

	; ȣ����� ������ ���� �޸𸮸� �ı��մϴ�.
	ret 8	;add esp, 8
