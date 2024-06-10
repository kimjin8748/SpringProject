package inhatc.cse.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class Appconfig {

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        // 최대 업로드 가능한 바이트 크기 (예: 5MB)
        multipartResolver.setMaxUploadSize(5242880);
        return multipartResolver;
    }
}
