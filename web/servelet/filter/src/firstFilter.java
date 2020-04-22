

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
@WebFilter(filterName="firstFilter",
		urlPatterns= {"/test","/second"},
		initParams= {
				@WebInitParam(name="encoding",value="utf-8"),
				@WebInitParam(name="contentType",value="text/html; charset=utf-8")
				
		})
public class firstFilter implements Filter{

	public void init(FilterConfig config) throws ServletException{
		System.out.println("init ȣ��");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy ȣ��");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("firstfilter ���� ���� ���� ȣ�� ��");
		chain.doFilter(request, response);
		System.out.println("firstfilter ���� ���� ���� ȣ�� ��");

	}
}
	
