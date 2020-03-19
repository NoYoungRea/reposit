package compareTest;

public class Member implements Comparable<Member>{

	private String name;
	
	public Member(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Member o) {
		return this.name.compareTo(o.name);
	}
}
