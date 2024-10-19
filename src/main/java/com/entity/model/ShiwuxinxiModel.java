package com.entity.model;

import com.entity.ShiwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 失物信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public class ShiwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 物品类别
	 */
	
	private String wupinleibie;
		
	/**
	 * 丢失地点
	 */
	
	private String diushididian;
		
	/**
	 * 丢失时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date diushishijian;
		
	/**
	 * 寻物状态
	 */
	
	private String xunwuzhuangtai;
		
	/**
	 * 详细描述
	 */
	
	private String xiangximiaoshu;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：物品类别
	 */
	 
	public void setWupinleibie(String wupinleibie) {
		this.wupinleibie = wupinleibie;
	}
	
	/**
	 * 获取：物品类别
	 */
	public String getWupinleibie() {
		return wupinleibie;
	}
				
	
	/**
	 * 设置：丢失地点
	 */
	 
	public void setDiushididian(String diushididian) {
		this.diushididian = diushididian;
	}
	
	/**
	 * 获取：丢失地点
	 */
	public String getDiushididian() {
		return diushididian;
	}
				
	
	/**
	 * 设置：丢失时间
	 */
	 
	public void setDiushishijian(Date diushishijian) {
		this.diushishijian = diushishijian;
	}
	
	/**
	 * 获取：丢失时间
	 */
	public Date getDiushishijian() {
		return diushishijian;
	}
				
	
	/**
	 * 设置：寻物状态
	 */
	 
	public void setXunwuzhuangtai(String xunwuzhuangtai) {
		this.xunwuzhuangtai = xunwuzhuangtai;
	}
	
	/**
	 * 获取：寻物状态
	 */
	public String getXunwuzhuangtai() {
		return xunwuzhuangtai;
	}
				
	
	/**
	 * 设置：详细描述
	 */
	 
	public void setXiangximiaoshu(String xiangximiaoshu) {
		this.xiangximiaoshu = xiangximiaoshu;
	}
	
	/**
	 * 获取：详细描述
	 */
	public String getXiangximiaoshu() {
		return xiangximiaoshu;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
			
}
