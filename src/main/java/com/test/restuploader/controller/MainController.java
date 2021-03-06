package com.test.restuploader.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MainController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadFile(@RequestParam (name = "file") MultipartFile file,
                                             @RequestParam(name = "author", required = false, defaultValue = "no author") String authorName,
                                             @RequestParam(name = "description", required = false, defaultValue = "no desription") String description){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}