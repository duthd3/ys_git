#include<stdio.h>

void HanoiTowerMove(int num, int from, int by, int to) //num���� ������ by�� ���ļ� from���� to�� �̵��Ѵ�
{
	//Ż�� ����
	if(num==1) //�̵��� ������ ���� 1�����
		printf("����1�� %c���� %c�� �̵� \n", from, to);
	else
	{
		HanoiTowerMove(num-1, from, to, by); //num-1���� ������ from���� to�� ���� by�� �̵�
		printf("����%d�� %c���� %c�� �̵� \n", num, from, to); //�� �Ʒ� ������ from���� to�� �̵�
		HanoiTowerMove(num-1, by, from, to); //num-1���� ����(by���ִ�)�� by���� to�� �̵�
	
	}
}

int main()
{
	HanoiTowerMove(3, 'A', 'B', 'C');
	return 0;
}

