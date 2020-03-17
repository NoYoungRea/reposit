package equalsTest;

public class Student extends Person{
	private String major;
	private int score;
	
	public Student(String name,int age, String major, int score) {
		super(name,age);
		this.major=major;
		this.score=score;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public String getDescript() {
		StringBuffer sb=new StringBuffer();
		sb.append("name: "+name+"\n")
		.append("age: "+name+"\n")
		.append("major: "+major+"\n")
		.append("score: "+score+"\n");
		//System.out.println(sb);
		return sb.toString();
		
	}
	public boolean equals(Object o) {
		if(super.equals(o)==false)
			return false;
		else {
			if(!(o instanceof Student))
				return false;
			Student obj=(Student)o;
			if(obj.major!=null) {
				if(this.major==null)
					return false;
				else {
					if(obj.major!=this.major)
						return false;
				}
			}
			else {
				if(obj.major!=null)
					return false;
			}
			if(obj.score!=this.score)
				return false;
			return true;
			
		}
	}
}
