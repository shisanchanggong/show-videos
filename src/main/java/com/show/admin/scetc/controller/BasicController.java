package com.show.admin.scetc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author 2016wlw2 徐塬峰
 */
@RestController
public class BasicController {
	
	 @Value("${web.upload.path}")
     public  String filePath;
     
	 public final String DELETE="2";//根据前端的status来判定执行什么操作
	 public final String UPDATE="1";

	
	
	
	
}