package com.sb.web.fileload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUpploade {
	//public final String uploadDir="D:\\Spring Boot sts\\006_FileUploading\\src\\main\\resources\\static\\image";
	
	//get location dynamically
	public final String uploadDir=new ClassPathResource("static/image/").getFile().getAbsolutePath();
	public FileUpploade() throws IOException{
		// TODO Auto-generated constructor stub
	}
	public boolean fileUpload(MultipartFile file){
		boolean flag=false;
		InputStream is;
		try {
			is = file.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
			FileOutputStream fos=new FileOutputStream(uploadDir+File.separator+file.getOriginalFilename());
			fos.write(data);
			fos.close();
			fos.flush();
			flag=true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
}
