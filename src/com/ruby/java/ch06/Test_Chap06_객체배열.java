package com.ruby.java.ch06;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
 * static 멤버 함수 구현
 * toString() 함수 구현과 사용
 * 객체 배열 사용
 */
abstract class InterfaceStudents {
	public abstract void showObject();
}

//------------------------------------------------------------------------------
class Student extends InterfaceStudents {
	static int countStudents;// 객체수
	int sid;// 학번
	String sname; // 학생 이름
	String city; // 주소 도시

	public Student() { // default 생성자

	}

	public Student(int sid) {
		this.sid = sid;
		countStudents++;
	}

	public Student(int sid, String name, String city) {
		this.sid =sid;
		this.sname = name;
		this.city = city;
		countStudents++;
		
	}

	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", city=" + city;
	}

	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
	}

	static void showNumberObjects() { // 생성된 객체수를 출력한다.
		System.out.println(" 생성객체수=" + countStudents);
	}
}
//------------------------------------------------------------------------------
class WorkStudent extends Student {
	String eno;
	String company;

	public WorkStudent(int sid, String sname, String city, String eno, String company) {
//		this.sid = sid;
//		this.sname = sname;
//		this.city = city;
		super(sid, sname, city);
		this.eno = eno;
		this.company = company;
	}

	@Override
	public String toString() {
		
		 return super.toString() + ", eno=" + eno + ", company=" + company;
	 }

	public void showObject() {
		
		
		System.out.println("["  + sid + ", " + sname + ", " + city +", "+ eno + ", " + company + "]");
	}
}
//---------------------------------------------------------------------------
class CodingWorkStudent extends WorkStudent {
	String language;
	
	public CodingWorkStudent(int sid, String sname, String city, String eno, String company, String language) {
		super(sid, sname, city, eno, company);
		this.language = language;
	}

	
	public String toString() {
		 return super.toString() + ", language=" + language;
	 }

	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + ", " + eno + ", " + company + ", " + language + "]");
	}
}

//-------------------------------------------------------------------------------------------
public class Test_Chap06_객체배열 {
	static void showObjects(InterfaceStudents is) {
		is.showObject();
	}

	public static void main(String[] args) {
		
		Student arry[] = new Student[5];
		Student.showNumberObjects();
		
		arry[0] = new Student(); // default 생성자
		arry[1] = new Student(202301);
		arry[2] = new Student(202301, "Hong", "Busan");
		arry[3] = new WorkStudent(1234, "Hong", "Busan", "e1", "naver");
		arry[4] = new CodingWorkStudent(202303, "Bob", "Japan", "E002", "Company2", "language");
		
		Student.showNumberObjects();
		
		for (Student s : arry) {
			System.out.println(s.toString());
		}
		for (Student sx : arry) {
			showObjects(sx);
		}
	}

}
