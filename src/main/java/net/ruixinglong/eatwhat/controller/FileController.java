package net.ruixinglong.eatwhat.controller;

import com.qiniu.util.Auth;
import net.ruixinglong.eatwhat.bean.QiniuBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@RequestMapping(value = "files")
public class FileController {

    @Autowired
    QiniuBean qiniuBean;

    @RequestMapping("/index")
    public String index() throws Exception {
        String accessKey = qiniuBean.getAccessKey();
        String secretKey = qiniuBean.getSecretKey();
        String bucket = qiniuBean.getBucket();
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        System.out.println(upToken);
        return upToken;
    }
}
