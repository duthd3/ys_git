#include<stdio.h>

int main(void)
{
	int num1 = 10;
	int num2 = 20;

	int* ptr1 = &num1;
	int* ptr2 = &num2;
	int* temp = 0;

	(*ptr1) += 10; //num1=20
	(*ptr2) -= 10; //num2=10
	temp = ptr1;
	ptr1 = ptr2; //ptr1¿Ã num2∏¶ ∞°∏Æ≈¥
	ptr2 = temp; //ptr2∞° num1¿ª ∞°∏Æ≈¥

	printf("num1:%d, num2:%d \n", *ptr1, *ptr2);
	return 0;

}