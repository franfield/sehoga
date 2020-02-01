package com.yoga.classservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class ClassDetailsController {

//    @RequestMapping("/{classId}")
//    public ClassDetail getClassDetail(@PathVariable("classId") int classId) {
//        return new ClassDetail(1,"This class fucks!!!");
//    }
}
