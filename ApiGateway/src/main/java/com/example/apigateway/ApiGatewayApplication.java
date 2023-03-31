package com.example.apigateway;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import com.fasterxml.classmate.Filter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

@SpringBootApplication
@EnableEurekaServer
//@Configuration
public class ApiGatewayApplication 
{

	@CrossOrigin(origins="http://localhost:4200")
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
			}
			
			
		};
	
	}
}

//		public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
//				throws IOException, ServletException {
//
//			HttpServletRequest request = (HttpServletRequest) servletRequest;
//			System.out.println("CORSFilter HTTP Request: " + request.getMethod());
//
//			// Authorize (allow) all domains to consume the content
//			((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Origin", "*");
//			((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
//
//			HttpServletResponse resp = (HttpServletResponse) servletResponse;
//
//			// For HTTP OPTIONS verb/method reply with ACCEPTED status code -- per CORS handshake
//			if (request.getMethod().equals("OPTIONS")) {
//				resp.setStatus(HttpServletResponse.SC_ACCEPTED);
//				return;
//			}
//
//			// pass the request along the filter chain
//			chain.doFilter(request, servletResponse);
//		}
//
//		/**
//		 * @see Filter#init(FilterConfig)
//		 */
//		public void init(FilterConfig fConfig) throws ServletException {
//			// TODO Auto-generated method stub
//		}
//


	

/**
 * Servlet Filter implementation class CORSFilter
 */
// Enable it for Servlet 3.x implementations
/* @ WebFilter(asyncSupported = true, urlPatterns = { "/*" }) */
// class CORSFilter implements Filter {
//
//	/**
//	 * Default constructor.
//	 */
//	public CORSFilter() {
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @see Filter#destroy()
//	 */
//	public void destroy() {
//		// TODO Auto-generated method stub
//	}
//
//	/**
//	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
//	 */
//	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
//			throws IOException, ServletException {
//
//		HttpServletRequest request = (HttpServletRequest) servletRequest;
//		System.out.println("CORSFilter HTTP Request: " + request.getMethod());
//
//		// Authorize (allow) all domains to consume the content
//		((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Origin", "*");
//		((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
//
//		HttpServletResponse resp = (HttpServletResponse) servletResponse;
//
//		// For HTTP OPTIONS verb/method reply with ACCEPTED status code -- per CORS handshake
//		if (request.getMethod().equals("OPTIONS")) {
//			resp.setStatus(HttpServletResponse.SC_ACCEPTED);
//			return;
//		}
//
//		// pass the request along the filter chain
//		chain.doFilter(request, servletResponse);
//	}
//
//	/**
//	 * @see Filter#init(FilterConfig)
//	 */
//	public void init(FilterConfig fConfig) throws ServletException {
//		// TODO Auto-generated method stub
//	}
//
//}

//	@Configurable
//	@CrossOrigin(origins = "*")
//	public class SpringCloudConfig {
//	    @Bean
//	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
//	        return builder.routes()
//	                .route(r -> r.path("/airline/**")
//	                .uri("http://localhost:8081/")
//	                .id("AIRLINE-SERVICE"))
//
//	                .route(r -> r.path("/posts/**")
//	                        .uri("http://localhost:8082/")
//	                        .id("postService"))
//
//	                .route(r -> r.path("/auth/**")
//	                        .uri("http://localhost:8083/")
//	                        .id("securityService"))
//	                .build();
//	    }
//
//	}
//

	
