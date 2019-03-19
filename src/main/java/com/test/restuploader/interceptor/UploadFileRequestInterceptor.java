package com.test.restuploader.interceptor;

import com.test.restuploader.controller.MainController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@Component
public class UploadFileRequestInterceptor implements HandlerInterceptor {

    // logger initialization
    private static final Logger log = Logger.getLogger(MainController.class);

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Part file = request.getPart("file");

        String authorName = request.getParameter("author");
        String description = request.getParameter("description");
        if (authorName == null){ authorName = "no author"; }
        if (description == null){ description = "no description"; }

        log.info("\nFile received:" +
                "\nfile name - " + file.getSubmittedFileName() +
                "\nfile type - " + file.getContentType() +
                "\nfile size - " + file.getSize() +
                "\nauthor - " + authorName +
                "\ndesription - " + description + "\n\n");

    }

}