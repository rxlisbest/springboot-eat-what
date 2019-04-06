package net.ruixinglong.eatwhat.controller;

import net.ruixinglong.eatwhat.exception.ForbiddenException;
import net.ruixinglong.eatwhat.utils.LocaleMessageUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@RequestMapping(value = "users")
public class UserController {

    @RequestMapping("/index")
    public String index() throws Exception {
        if (false) {
            throw new ForbiddenException("test");
        }
        return LocaleMessageUtils.getMsg("test");
    }
}
