

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class SecondFilter implements Filter {
	public void destroy() {
		System.out.println("secondFilter destroy()ȣ��");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("second ���� ���� ���� ȣ�� ��");
		chain.doFilter(request, response);
		System.out.println("second ���� ���� ���� ȣ�� ��");

	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("secondFilter init()ȣ��");

	}

}
