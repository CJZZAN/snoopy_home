package com.sjh.snoopy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sjh.snoopy.interceptor.LoginInterceptor;
import com.sjh.snoopy.interceptor.OtherInterceptor;

@Configuration
class WebMvcConfigurer extends WebMvcConfigurerAdapter{

	@Bean
	public OtherInterceptor getOtherIntercepter() {
		return new OtherInterceptor();
	}
	@Bean
	public LoginInterceptor getLoginIntercepter() {
		return new LoginInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//排除对静态资源的拦截
		String[] exclude = new String[] {"/js/**","/img/**","/css/**","/webapp/**"};
		registry.addInterceptor(getLoginIntercepter()).addPathPatterns("/**").excludePathPatterns(exclude);
		registry.addInterceptor(getOtherIntercepter()).addPathPatterns("/**").excludePathPatterns(exclude);
	}
}



