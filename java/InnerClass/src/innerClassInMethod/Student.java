package innerClassInMethod;
interface Readable{
	
}
public class Student {
	public static final String TYPE="student";
	public String major;
	
	public Student(String major) {
		this.major=major;
	}
//-------------------------------
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	//-----------------------------------
	public void study() {
		class Book{
			String bookName;
			int price;
			
			Book(String bookName,int price){
				this.bookName=bookName;
				this.price=price;
			}
			void show() {
				System.out.println(TYPE);
				System.out.println(Student.this.major);
			}
			
		}
		Book book=new Book("A",3000);
		System.out.println("book"+book.bookName);
		System.out.println("price"+book.price);
		System.out.println("type"+TYPE);
	}
}
