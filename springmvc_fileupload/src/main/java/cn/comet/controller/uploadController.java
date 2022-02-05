package cn.comet.controller;

import cn.comet.utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author :QuPeng
 * @description :
 * @create :2022-02-02 19:59:00
 */
@Controller
@RequestMapping("upload")
public class uploadController {
    @RequestMapping("uploadFile")
    public String uploadFile(String description, MultipartFile upload, HttpServletRequest request){
		System.out.println("文件描述信息："+description);
		System.out.println("文件描述信息555："+description);
        System.out.println("文件描述信息："+description);
        String realPath = request.getSession().getServletContext().getRealPath("file" + UploadUtils.getDir());
        File file=new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }
        String filename = upload.getOriginalFilename();
        String uuidName = UploadUtils.getUUIDName(filename);
        try {
            upload.transferTo(new File(file,uuidName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
