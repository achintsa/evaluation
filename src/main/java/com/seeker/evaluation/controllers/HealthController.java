package com.seeker.evaluation.controllers;

import com.seeker.evaluation.vo.TestVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HealthController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String testHealth() {
        return "OK";
    }


    @RequestMapping(value = "/postTest", method = RequestMethod.POST)
    public TestVO postTest(@RequestBody @Valid TestVO testVO) {
         if(testVO == null) {
             return null;
         } else {
             testVO.setKeyOne(testVO.getKeyOne() + testVO.getKeyTwo());
             return testVO;
         }
    }


}
