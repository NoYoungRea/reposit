package compareTest;

public class Member implements Comparable<Member>{

	private String name;
	private int kor;
	private int eng;
	
	public Member(String name,int kor,int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Member o) {
		return -(new Integer(sum(this)).compareTo((sum(o))));
	}
	public int sum(Member o) {
		return (o.kor+o.eng);
	}
	public String toString() {
		return String.format("%8s %4d %4d %4d %7.2f", name,kor,eng,(kor+eng),(kor+eng)/2.0);
	}
}
