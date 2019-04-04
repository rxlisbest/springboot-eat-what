package net.ruixinglong.eatwhat.controller;

import net.ruixinglong.eatwhat.exception.ForbiddenException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@RequestMapping(value = "users")
public class UserController {

    @RequestMapping("/index")
    public int index() throws Exception {
        if (true) {
            throw new ForbiddenException("test");
        }
        return 1;
    }
}
