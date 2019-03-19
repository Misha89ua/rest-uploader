package com.test.restuploader;

import com.test.restuploader.interceptor.UploadFileRequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class RestUploaderAppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    UploadFileRequestInterceptor uploadFileRequestInterceptor ;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(uploadFileRequestInterceptor);
    }
}
