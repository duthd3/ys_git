#include<stdio.h>

void HanoiTowerMove(int num, int from, int by, int to) //num개의 원반을 by를 거쳐서 from에서 to로 이동한다
{
	//탈출 조건
	if(num==1) //이동할 원반의 수가 1개라면
		printf("원반1을 %c에서 %c로 이동 \n", from, to);
	else
	{
		HanoiTowerMove(num-1, from, to, by); //num-1개의 원반을 from에서 to를 거쳐 by로 이동
		printf("원반%d를 %c에서 %c로 이동 \n", num, from, to); //맨 아래 원반을 from에서 to로 이동
		HanoiTowerMove(num-1, by, from, to); //num-1개의 원반(by에있는)을 by에서 to로 이동
	
	}
}

int main()
{
	HanoiTowerMove(3, 'A', 'B', 'C');
	return 0;
}

