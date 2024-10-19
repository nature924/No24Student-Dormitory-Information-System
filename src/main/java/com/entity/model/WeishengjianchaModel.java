package com.entity.model;

import com.entity.WeishengjianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 卫生检查
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public class WeishengjianchaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 检查内容
	 */
	
	private String jianchaneirong;
		
	/**
	 * 是否整洁
	 */
	
	private String shifouzhengjie;
		
	/**
	 * 是否违规
	 */
	
	private String shifouweigui;
		
	/**
	 * 卫生评分
	 */
	
	private Integer weishengpingfen;
		
	/**
	 * 检查结果
	 */
	
	private String jianchajieguo;
		
	/**
	 * 检查日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchariqi;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：宿舍号
	 */
	 
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
				
	
	/**
	 * 设置：检查内容
	 */
	 
	public void setJianchaneirong(String jianchaneirong) {
		this.jianchaneirong = jianchaneirong;
	}
	
	/**
	 * 获取：检查内容
	 */
	public String getJianchaneirong() {
		return jianchaneirong;
	}
				
	
	/**
	 * 设置：是否整洁
	 */
	 
	public void setShifouzhengjie(String shifouzhengjie) {
		this.shifouzhengjie = shifouzhengjie;
	}
	
	/**
	 * 获取：是否整洁
	 */
	public String getShifouzhengjie() {
		return shifouzhengjie;
	}
				
	
	/**
	 * 设置：是否违规
	 */
	 
	public void setShifouweigui(String shifouweigui) {
		this.shifouweigui = shifouweigui;
	}
	
	/**
	 * 获取：是否违规
	 */
	public String getShifouweigui() {
		return shifouweigui;
	}
				
	
	/**
	 * 设置：卫生评分
	 */
	 
	public void setWeishengpingfen(Integer weishengpingfen) {
		this.weishengpingfen = weishengpingfen;
	}
	
	/**
	 * 获取：卫生评分
	 */
	public Integer getWeishengpingfen() {
		return weishengpingfen;
	}
				
	
	/**
	 * 设置：检查结果
	 */
	 
	public void setJianchajieguo(String jianchajieguo) {
		this.jianchajieguo = jianchajieguo;
	}
	
	/**
	 * 获取：检查结果
	 */
	public String getJianchajieguo() {
		return jianchajieguo;
	}
				
	
	/**
	 * 设置：检查日期
	 */
	 
	public void setJianchariqi(Date jianchariqi) {
		this.jianchariqi = jianchariqi;
	}
	
	/**
	 * 获取：检查日期
	 */
	public Date getJianchariqi() {
		return jianchariqi;
	}
			
}
