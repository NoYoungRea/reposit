package genericHospital;

public interface Curable<T> {
	public abstract T cure(T obj);
}
