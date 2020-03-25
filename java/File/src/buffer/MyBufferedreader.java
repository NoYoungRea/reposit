package buffer;

public class MyBufferedreader extends java.io.BufferedInputStream{
	public MyBufferedreader(java.io.InputStream stream) {
		super(stream);
		
	}
	public MyBufferedreader(java.io.InputStream stream,int size) {
		super(stream,size);
	}
	public byte[] getBuffer() {
		return super.buf;
	}
}
