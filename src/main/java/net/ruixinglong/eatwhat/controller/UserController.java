package net.ruixinglong.eatwhat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@RequestMapping(value = "users")
public class UserController {

    @RequestMapping("/index")
    public int index() {
        return 1;
    }
}
