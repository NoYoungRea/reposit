

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
		System.out.println("secondFilter destroy()호출");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("second 에서 다음 필터 호출 전");
		chain.doFilter(request, response);
		System.out.println("second 에서 다음 필터 호출 후");

	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("secondFilter init()호출");

	}

}
