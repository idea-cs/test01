package cn.comet.utils;

import java.util.Random;
import java.util.UUID;

public class UploadUtils {
	
	/**
	 * 获取随机名称
	 * @param
	 * @return uuid 随机名称
	 */
	public static String getUUIDName(String fileName){
		//realname  eg: 1.jpg  
		//获取后缀名
		int index = fileName.lastIndexOf(".");
		String s = UUID.randomUUID().toString().replace("-", "").toUpperCase();
		if(index==-1){
			//如果改文件的名字没有后缀
			return s;
		}else{
			return s +fileName.substring(index);
		}
	}
	/**
	 * 获取文件目录,可以获取256个随机目录
	 * @return 随机目录
	 */
	public static String getDir(){
		String s="0123456789ABCDEF";
		Random r = new Random();
		return "/"+s.charAt(r.nextInt(16))+"/"+s.charAt(r.nextInt(16));
	}

}
