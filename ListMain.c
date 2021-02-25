#include<stdio.h>
#include "ArrayList.h"

int main(void)
{
	//ArrayList의 생성 및 초기화//////
	List list;
	int data;
	ListInit(&list);
	int sum = 0;
	int i;
	//5개의 데이터 저장/////
	/*LInsert(&list, 1); LInsert(&list, 2);
	LInsert(&list, 3); LInsert(&list, 4);
	LInsert(&list, 5); LInsert(&list, 6);
	LInsert(&list, 7); LInsert(&list, 8);
	LInsert(&list, 9);*/
	
	for (i = 1; i < 10; i++)
	{
		LInsert(&list, i);
	}

	//저장된 데이터의 전체 출력/////
	printf("현재 데이터의 수: %d \n", LCount(&list));

	if (LFirst(&list, &data))
	{
		printf("%d ", data);
		sum += data;
		while (LNext(&list, &data)) {
			printf("%d ", data);
			sum += data;
		}
	}
	
	printf("\n\n");

	//숫자 22을 탐색하여 모두 삭제//////
	if (LFirst(&list, &data))
	{
		if (data % 2 == 0 || data % 3 == 0)
		{
			LRemove(&list);
		}


	
		while (LNext(&list, &data))
		{
			if (data % 2 == 0 || data % 3 == 0)
			LRemove(&list);
				
		}
	}

	//삭제 후 남은 데이터 전체 출력/////
	printf("현재 데이터의 수: %d \n", LCount(&list));
	
	if (LFirst(&list, &data))
	{
		printf("%d ", data);

		while (LNext(&list, &data))
			printf("%d ", data);
	}
	
	printf("\n\n");
	printf("합:%d\n", sum);
	return 0;
}