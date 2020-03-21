package genericb1;

public class Worker extends Person{
	public final static String TYPE ="Worker";
	private String job;
	
	public Worker(String name,String job) {
		super(name);
		this.job=job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
