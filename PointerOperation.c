#include<stdio.h>

int main_PointerOperation(void)
{
	int num1 = 100, num2 = 100;
	int* pnum;
	pnum = &num1; //포인터 pnum이 변수 num1 을 가리킴
	(*pnum) += 30; //num1+=30; 과 동일문장

	pnum = &num2; //포인터 pnum이 변수 num2 를 가리킴
	(*pnum) -= 30;//num2-=30; 과 동일문장

	printf("num1:%d, num2:%d \n", num1, num2);
	return 0;
}