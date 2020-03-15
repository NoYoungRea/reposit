public class A9_StaticTest {

	int kor;
	int eng;

	public A9_StaticTest() {
			this(0,0);
		}

	public A9_StaticTest(int kor,int eng) {
			this.kor=kor;
			this.eng=eng;
		}

	// setter getter
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	//
	public int getTot() {
		return (kor + eng);
	}

	public double getAvg() {
		return ((double) getTot() / 2);
	}
}


class AppStart {
	public static void main(String[]args) {
		A3 j=new A3();//<-
		A3 b=null;//(X)
		//System.out.println(A3.count);//<-
		//A3.count++;//<-
		//A3.count++;
	}
}
