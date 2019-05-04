package net.ruixinglong.eatwhat.controller;

import com.qiniu.util.Auth;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@RequestMapping(value = "files")
public class FileController {

    @RequestMapping("/index")
    public String index() throws Exception {
        String accessKey = "access key";
        String secretKey = "secret key";
        String bucket = "bucket name";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        System.out.println(upToken);
        return upToken;
    }
}
