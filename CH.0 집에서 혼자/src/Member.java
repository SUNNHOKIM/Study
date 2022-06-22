
public class Member {
	String name = "정보없음";
	String number = "정보없음";
	String major = "정보없음";
	String level = "정보없음";
	String eMail = "정보없음";
	String birth = "정보없음";
	String address = "정보없음";

	Member(String name, String number, String major, String level, String eMail, String birth, String address) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.level = level;
		this.eMail = eMail;
		this.birth = birth;
		this.address = address;

		System.out.println("이름 :" + name);
		System.out.println("전화번호 :" + number);
		System.out.println("전공:" + major);
		System.out.println("학년:" + level);
		System.out.println("이메일 :" + eMail);
		System.out.println("생일 :" + birth);
		System.out.println("주소 :" + address);

	}

	Member(String name, String number, String major, String level, String eMail) {
		this(name, number, major,level,eMail,"정보없음","정보없음" );
		//this.name = name;
		//this.number = number;
		//this.major = major;
		//this.level = level;
		//this.eMail = eMail;
		//this.birth = birth;
		//this.address = address;

		System.out.println("이름 :" + name);
		System.out.println("전화번호 :" + number);
		System.out.println("전공:" + major);
		System.out.println("학년:" + level);
		System.out.println("이메일 :" + eMail);
		System.out.println("생일 :" + birth);
		System.out.println("주소 :" + address);
	}

	public static void main(String[] args) {
		Member member = new Member("김선호", "01068602685", "정치외교학", "4학년", "tjsgh@naver.com", "95-02-21", "강서구");
		// System.out.println("이름 :" + member.name );
		System.out.println("-------------------------------");

		Member member2 = new Member("김선호", "01068602685", "정치외교학", "4학년", "tjsgh@naver.com");
	}

}
