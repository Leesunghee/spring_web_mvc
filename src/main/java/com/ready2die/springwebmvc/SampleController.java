package com.ready2die.springwebmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // preHandle1
    // preHandle2
    // 요청 처리
    // postHandle2
    // postHandle1
    // 뷰 렌더링
    // afterCompletion2
    // afterCompletion1

    @GetMapping("/hello")
//    public String hello(@PathVariable("name") Person person) {
    public String hello(@RequestParam("id") Person person) {

        return "hello "  + person.getName();
    }


}
