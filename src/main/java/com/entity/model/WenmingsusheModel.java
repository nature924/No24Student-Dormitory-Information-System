package com.entity.model;

import com.entity.WenmingsusheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 文明宿舍
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public class WenmingsusheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 卫生评分
	 */
	
	private String weishengpingfen;
		
	/**
	 * 评比日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingbiriqi;
				
	
	/**
	 * 设置：卫生评分
	 */
	 
	public void setWeishengpingfen(String weishengpingfen) {
		this.weishengpingfen = weishengpingfen;
	}
	
	/**
	 * 获取：卫生评分
	 */
	public String getWeishengpingfen() {
		return weishengpingfen;
	}
				
	
	/**
	 * 设置：评比日期
	 */
	 
	public void setPingbiriqi(Date pingbiriqi) {
		this.pingbiriqi = pingbiriqi;
	}
	
	/**
	 * 获取：评比日期
	 */
	public Date getPingbiriqi() {
		return pingbiriqi;
	}
			
}
