package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //上传路径保存位置
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);

        if (!realPath.exists()) {
            realPath.mkdir();
        }

        //上传文件地址
        System.out.println(realPath);

        //通过 CommonsMultipartFile 的方法直接写文件（注意这个时候）
        file.transferTo(new File(realPath+"/"+file.getOriginalFilename()));

        return "redirect:/index.jsp";
    }
}
