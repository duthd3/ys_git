#include<stdio.h>

int main_PointerOperation(void)
{
	int num1 = 100, num2 = 100;
	int* pnum;
	pnum = &num1; //������ pnum�� ���� num1 �� ����Ŵ
	(*pnum) += 30; //num1+=30; �� ���Ϲ���

	pnum = &num2; //������ pnum�� ���� num2 �� ����Ŵ
	(*pnum) -= 30;//num2-=30; �� ���Ϲ���

	printf("num1:%d, num2:%d \n", num1, num2);
	return 0;
}