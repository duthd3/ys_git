
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int visitCount = 1;
//		if(visitCount == 0){
//			System.out.println("ó�� �湮�� �ּż� �����մϴ�.");
//		}
//		visitCount++;
		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ����(�ڹ�[1] / JSP[2]) :");
		int sub = sc.nextInt();
		if(sub == 1){
			System.out.println("�ڹٰ����� ���� ��û �Ǿ����ϴ�.");
		}
		if(sub == 2){
			System.out.println("JSP������ ���� ��û �Ǿ����ϴ�.");
		}
		*/
//		String gender;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("����[����/����]: ");
//		gender = sc.nextLine();
//		
//		if(gender.equals("����")) {
//			System.out.println("������ �ڳʴ� 12�� �Դϴ�.");
//		}
//		
//		if(gender.equals("����")) {
//			System.out.println("������ �ڳʴ� 2�� �Դϴ�.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("����[����/����]: ");
//		String gender = sc.nextLine();
//		
//		if(gender.equals("����")) {
//			System.out.println("������ �ڳʴ� 12�� �Դϴ�.");
//		}
//		
//		else {
//			System.out.println("������ �ڳʴ� 2�� �Դϴ�.");
//		}
		
		/*int visitCount = 1;
		
		if(visitCount == 0){
			System.out.println("ó�� �湮�� �ּż� �����մϴ�.");
		}else {
			System.out.println("�ٽ� �湮�� �ּż� �����մϴ�.");
		}
		visitCount++;*/
		
/*
 * System.currentTimeMills() :1970�� 1�� 1�� 0�ú��� ���� ������ �ð��� 1ms������ ��ȯ
 * long t = System.currentTimeMills();
 * long sec = t/1000;
 * long min = sec/60;
 * long hour = min/60;
 * long day = hour/24;
 * long mon = day/30;
 * long year =mon/12;
 */
/*     	long ct = System.currentTimeMillis();
    	long sec = ct/1000;
		long min = sec/60;
		long hour = min/60;
		int day = (int)hour/24;
		int month = day / 30;
		int year = month /12;
		System.out.println("current Time: " + year);
*/
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("����⵵ �Է�: ");
//		int age = sc.nextInt();
//		long ct = System.currentTimeMillis();
//    	long sec = ct/1000;
//		long min = sec/60;
//		long hour = min/60;
//		int day = (int)hour/24;
//		int month = day / 30;
//		int year = month /12;
//		if(age >= 20) {
//			System.out.printf("%d ����� %d ��� �����Դϴ�. %n", age, 2021-age);
//		}
//		else
//		{
//			System.out.printf("%d ����� %d ��� �̼����Դϴ�. %n", age, 2021-age);
//		}
		
		/*String fd;
		double d = 12345.6789;
		DecimalFormat df;
		
		df = new DecimalFormat("0");
		fd = df.format(d);
		System.out.println(fd);
		df = new DecimalFormat("0.0");
		fd = df.format(d);
		System.out.println(fd);
		
		df = new DecimalFormat("0.#####"); //#-�����Ͱ� ������ ���,������ x
		fd = df.format(d);
		System.out.println(fd);
		
		df = new DecimalFormat("0.00000");
		fd = df.format(d);
		System.out.println(fd);
		
		df = new DecimalFormat("#,###.##");
		fd = df.format(d);
		System.out.println(fd);*/
	/*	
		Date today = new Date();
		System.out.println(today);
		
		long mSec = System.currentTimeMillis();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		String cDate = df.format(today); 
		System.out.println(cDate);
		
		df = new SimpleDateFormat("MM/dd/yy");
		cDate = df.format(today);
		System.out.println(cDate);
		
		cDate = df.format(mSec); 
		System.out.println(cDate);
		*/
		
		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.print("�湮 Ƚ�� �Է�: ");
		int visitCount = sc.nextInt();
		
		if(visitCount < 1){
			System.out.println("ó�� �湮�� �ּż� �����մϴ�.");
		}else {
			if(visitCount >= 10) {
				System.out.println("���� ���� ���� �޾� ������.");
			}else {
			System.out.println("�ٽ� �湮�� �ּż� �����մϴ�.");
			}
		}
		visitCount++;*/
		
		/*
		 * Math.random() : 0.0 ~ 1���� ���� ������ �Ǽ��� ������ �ִ� �Լ�
		 */
		
/*		double rNum = Math.random();
		
		int num = (int)(rNum*10)+1;
		System.out.println(rNum + " : " + num);
*/		
		
/*		int dice1, dice2;
		int sum = 0;
		
		
		dice1 = (int)(Math.random()*6) + 1;
		dice2 = (int)(Math.random()*6) + 1;
		
		System.out.printf("dice1: %d, dice2: %d %n", dice1, dice2);
		sum = dice1 +dice2;
		if(sum%2 == 0) {	
			if(dice1 == dice2) {
				System.out.println("����!");
			}else {
				System.out.println("���� ¦�� �Դϴ�.");
			}
		}
		else {
			if(dice1 == dice2) {
				System.out.println("����!");
			}
			
			else {
				System.out.println("���� Ȧ�� �Դϴ�.");
			}
		}*/
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		
		char grade;
		if(score >= 90) {
			grade = 'A';
			System.out.println(grade);
		}
		else if(score >=80) {
			grade = 'B';
			System.out.println(grade);
		}
		else if(score >= 70) {
			grade = 'C';
			System.out.println(grade);
		}
		else if(score >= 60) {
			grade = 'D';
			System.out.println(grade);
		}
		else {
			grade = 'F';
			System.out.println(grade);
		}*/
		
	/*Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		
		int label = score / 10;
		char grade;
		switch(label) {
		
		
		case 10 :			
		case 9 :	
			grade = 'A';
			break;
		case 8 :	
			grade = 'B';
			break;
		case 7 :	
			grade = 'C';
			break;
		case 6 :	
			grade = 'D';
			break;
		
		default:
			grade = 'F';
			break;
		
				
		}
		
		System.out.println("���� : " + score);
		System.out.println("��� : " + grade);
		*/
		
//		Scanner sc = new Scanner(System.in);
//		int mon;
//		System.out.print("���డ�� ���� ���� �Է��ϼ���: ");
//		mon = sc.nextInt();
//		
//		String season = null;
//		String coupon = null;
//		switch(mon) {
//		case 12: case 1:	case 2:
//		{
//			season = "�ܿ�";
//			coupon = "��� ���� �����";
//			break;			
//		}
//		case 3:	case 4:	case 5:
//		{
//			season = "��";
//			coupon = "������";
//			break;
//		}
//		case 6:	case 7:	case 8:
//		{
//			season = "����";;
//			coupon = "��Ʈ��Ű";
//			break;
//		}
//		case 9:	case 10:	case 11:
//		{
//			season = "����";
//			coupon = "ķ��ī";
//			break;
//		}
//		default:
//			season = "����� ��";
//			coupon = "���";
//			break;
//		}
//		System.out.println(season + "�� ���డ�ø� " + coupon + "�� ����ǰ���� �帳�ϴ�.");
		
//		char label = (char)(Math.random()*26 + 'A');
//		int prize = 0;
//		
//		switch(label) {
//		case 'A' : 
//			prize = 1000;
//			break;
//		case 'B' : 
//			prize = 800;
//			break;
//		case 'C' : 
//			prize = 700;
//			break;
//		case 'D' : 
//			prize = 600;
//			break;
//		case 'F' : 
//			prize = 10;
//			break;
//		default : 
//			prize = 10;
//		
//		}
//		System.out.println("��� : " + label);
//		System.out.println("��� : " + prize + "����");
		
	/*	int num = 0;
		
		
		
		while(num<10000){
			if(num<10000) {
			System.out.println(num);
			}
		
			num++;
		}*/
		
	/*	int num=0;
		int sum = 0;
		
		while(num<10) {
			num++;
			sum+=num;
		}
		System.out.println(sum);
		*/
		
		/*Scanner sc = new Scanner(System.in);
		int num;
		int count = 0;
		boolean t =true;
		while(t) {
			System.out.print("���� �Է�(���� -1): ");
			num = sc.nextInt();
			if(num % 2 == 1)
			{
				count++;
			}
			if(num == -1)
				break;
		}
		
		System.out.println("Ȧ���� ����: " + count + " �� �Դϴ�.");
		*/
		
		Scanner sc = new Scanner(System.in);
		int dan, is=1;
		System.out.print("������ �� �Է�: ");
		dan = sc.nextInt();
		while(is<=9) {
			System.out.printf("%d * %d = %d %n", dan, is, dan * is);
			is++;	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
