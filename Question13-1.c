#include<stdio.h>

int main_Q_13_1(void)
{
	//����1
/*	int arr[] = { 1,2,3,4,5 }; //�迭 ����, �ʱ�ȭ
	int* ptr = arr; //ptr�� arr[0]�� ����Ų��
	int i;

	for (i = 0; i < 5; i++)
	{
		*(ptr++) += 2;  //ptr�� �� ��ü�� �����ϸ鼭 ����
		printf("%d ", arr[i]);

	}
*/
	//����2
/*	int arr[] = { 1,2,3,4,5 }; //�迭 ����, �ʱ�ȭ
	int* ptr = arr; //ptr�� arr[0]�� ����Ų��
	int i;

	for (i = 0; i < 5; i++)
	{
		*(ptr+i) += 2; //ptr�� �� ���� x
		printf("%d ", arr[i]);

	}
*/
	//����3
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
	//����4
/*	int arr[6] = { 1,2,3,4,5,6 };
	int* frt = &arr[0];
	int* bac = &arr[5];
	int tmp;
	int i;
	for (i = 0; i < 3; i++)
	{
		tmp = *frt; //arr[0]�� ���� tmp�� ����
		*frt = *bac; //arr[5]�� ���� arr[0]�� ����
		*bac = tmp; //arr[0]�� ���� arr[5]�� ����  frt++,bac-- ���� �ϸ鼭 (1,4)(2,3) �ٲ�
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