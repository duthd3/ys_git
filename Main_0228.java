
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int visitCount = 1;
//		if(visitCount == 0){
//			System.out.println("처음 방문해 주셔서 감사합니다.");
//		}
//		visitCount++;
		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목 선택(자바[1] / JSP[2]) :");
		int sub = sc.nextInt();
		if(sub == 1){
			System.out.println("자바과목이 수강 신청 되었습니다.");
		}
		if(sub == 2){
			System.out.println("JSP과목이 수강 신청 되었습니다.");
		}
		*/
//		String gender;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("성별[남자/여자]: ");
//		gender = sc.nextLine();
//		
//		if(gender.equals("남자")) {
//			System.out.println("남성복 코너는 12층 입니다.");
//		}
//		
//		if(gender.equals("여자")) {
//			System.out.println("여성복 코너는 2층 입니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("성별[남자/여자]: ");
//		String gender = sc.nextLine();
//		
//		if(gender.equals("남자")) {
//			System.out.println("남성복 코너는 12층 입니다.");
//		}
//		
//		else {
//			System.out.println("여성복 코너는 2층 입니다.");
//		}
		
		/*int visitCount = 1;
		
		if(visitCount == 0){
			System.out.println("처음 방문해 주셔서 감사합니다.");
		}else {
			System.out.println("다시 방문해 주셔서 감사합니다.");
		}
		visitCount++;*/
		
/*
 * System.currentTimeMills() :1970년 1월 1일 0시부터 현재 까지의 시간을 1ms단위로 반환
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
//		System.out.print("출생년도 입력: ");
//		int age = sc.nextInt();
//		long ct = System.currentTimeMillis();
//    	long sec = ct/1000;
//		long min = sec/60;
//		long hour = min/60;
//		int day = (int)hour/24;
//		int month = day / 30;
//		int year = month /12;
//		if(age >= 20) {
//			System.out.printf("%d 년생은 %d 살로 성인입니다. %n", age, 2021-age);
//		}
//		else
//		{
//			System.out.printf("%d 년생은 %d 살로 미성년입니다. %n", age, 2021-age);
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
		
		df = new DecimalFormat("0.#####"); //#-데이터가 있으면 출력,없으면 x
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
		
		System.out.print("방문 횟수 입력: ");
		int visitCount = sc.nextInt();
		
		if(visitCount < 1){
			System.out.println("처음 방문해 주셔서 감사합니다.");
		}else {
			if(visitCount >= 10) {
				System.out.println("강의 무료 쿠폰 받아 가세요.");
			}else {
			System.out.println("다시 방문해 주셔서 감사합니다.");
			}
		}
		visitCount++;*/
		
		/*
		 * Math.random() : 0.0 ~ 1보다 작은 임의의 실수를 생성해 주는 함수
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
				System.out.println("더블!");
			}else {
				System.out.println("합은 짝수 입니다.");
			}
		}
		else {
			if(dice1 == dice2) {
				System.out.println("더블!");
			}
			
			else {
				System.out.println("합은 홀수 입니다.");
			}
		}*/
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
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
		
		System.out.print("점수 입력: ");
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
		
		System.out.println("점수 : " + score);
		System.out.println("등급 : " + grade);
		*/
		
//		Scanner sc = new Scanner(System.in);
//		int mon;
//		System.out.print("여행가고 싶은 달을 입력하세요: ");
//		mon = sc.nextInt();
//		
//		String season = null;
//		String coupon = null;
//		switch(mon) {
//		case 12: case 1:	case 2:
//		{
//			season = "겨울";
//			coupon = "평생 무료 시즌권";
//			break;			
//		}
//		case 3:	case 4:	case 5:
//		{
//			season = "봄";
//			coupon = "자전거";
//			break;
//		}
//		case 6:	case 7:	case 8:
//		{
//			season = "여름";;
//			coupon = "제트스키";
//			break;
//		}
//		case 9:	case 10:	case 11:
//		{
//			season = "가을";
//			coupon = "캠핑카";
//			break;
//		}
//		default:
//			season = "행운의 달";
//			coupon = "행운";
//			break;
//		}
//		System.out.println(season + "에 여행가시면 " + coupon + "를 사은품으로 드립니다.");
		
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
//		System.out.println("등급 : " + label);
//		System.out.println("상금 : " + prize + "만원");
		
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
			System.out.print("정수 입력(종료 -1): ");
			num = sc.nextInt();
			if(num % 2 == 1)
			{
				count++;
			}
			if(num == -1)
				break;
		}
		
		System.out.println("홀수의 개수: " + count + " 개 입니다.");
		*/
		
		Scanner sc = new Scanner(System.in);
		int dan, is=1;
		System.out.print("구구단 단 입력: ");
		dan = sc.nextInt();
		while(is<=9) {
			System.out.printf("%d * %d = %d %n", dan, is, dan * is);
			is++;	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
