package com.test.restuploader.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MainController {
    

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadFile(@RequestParam ("file") MultipartFile file, @RequestParam("author") String authorName,
                                             @RequestParam("description") String description){
        return new ResponseEntity<>("OK!", HttpStatus.OK);
    }

}