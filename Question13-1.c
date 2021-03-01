#include<stdio.h>

int main_Q_13_1(void)
{
	//문제1
/*	int arr[] = { 1,2,3,4,5 }; //배열 선언, 초기화
	int* ptr = arr; //ptr이 arr[0]를 가리킨다
	int i;

	for (i = 0; i < 5; i++)
	{
		*(ptr++) += 2;  //ptr의 값 자체를 변경하면서 접근
		printf("%d ", arr[i]);

	}
*/
	//문제2
/*	int arr[] = { 1,2,3,4,5 }; //배열 선언, 초기화
	int* ptr = arr; //ptr이 arr[0]를 가리킨다
	int i;

	for (i = 0; i < 5; i++)
	{
		*(ptr+i) += 2; //ptr의 값 변경 x
		printf("%d ", arr[i]);

	}
*/
	//문제3
/*	int arr[5] = { 1,2,3,4,5 };
	int* ptr = &arr[4]; 
	int i;
	int sum = 0;
	for (i = 0; i < 5; i++)
	{
		sum += *(ptr--);
	}
	printf("%d \n", sum);
*/
	//문제4
/*	int arr[6] = { 1,2,3,4,5,6 };
	int* frt = &arr[0];
	int* bac = &arr[5];
	int tmp;
	int i;
	for (i = 0; i < 3; i++)
	{
		tmp = *frt; //arr[0]의 값을 tmp에 저장
		*frt = *bac; //arr[5]의 값을 arr[0]에 저장
		*bac = tmp; //arr[0]의 값을 arr[5]에 저장  frt++,bac-- 수행 하면서 (1,4)(2,3) 바뀜
		frt++; 
		bac--;
	}
	
	for (i = 0; i < 6; i++)
	{
		printf("%d ", arr[i]);
	}
*/

	

	return 0;

}