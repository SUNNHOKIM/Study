import java.util.Scanner;   //6.10(금) 문제 1번 재구성

public class NOTE {
	public static void main(String[] args) { // 나이를 구해봄
		int thisYear = 2022; // 대입식에 숫자를 바로 넣는것은 좋은 코딩이 아님으로 thisYear 변수를 선언하여 값을 넣어줌
		Scanner in = new Scanner(System.in);
		System.out.println("당신의 출생년도는 ?");
		int line = in.nextInt();
		int age = thisYear - line;// 위에서 값을 넣은 변수를 식에 활용
		System.out.println("당신의나이는 " + age + "입니다");

		checkVaccine(age);  //아래 메소드 중 checkVaccine을 콜하는 문구 // 메인메소드가 static으로 선언되었기때문에 아래 메소드에서 static을 없애면 동작하지않음
		checkMedi(age);  //아래 메소드 중 checkMedi를 콜하는 문구
	}

	// 백신접종가능여부 확인
	public static void checkVaccine(int age) {
		if (age >= 60 || age < 13) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료예방접종 대상이 아닙니다.");
		}
	}
	// 건강검진 대상여부 확인
	public static void checkMedi(int age) {
		if (age % 2 == 0) {
			System.out.println("짝수해에 태어난 사람은 올해가 짝수년이라면 검사대상이 됩니다.");
		}else {
				System.out.println("홀수해에 태어난 사람은 올해가 홀수년이라면 검사대상이 됩니다.");
				if (age >= 40) {
					System.out.println("40세 이상의 경우는 암 검사도 무료로 할 수 있습니다.");
				}
			}

		}

	}
