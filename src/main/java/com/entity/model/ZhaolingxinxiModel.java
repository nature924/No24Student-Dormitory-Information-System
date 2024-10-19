package com.entity.model;

import com.entity.ZhaolingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 招领信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public class ZhaolingxinxiModel  implements Serializable {
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
	 * 捡拾地点
	 */
	
	private String jianshididian;
		
	/**
	 * 捡拾时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianshishijian;
		
	/**
	 * 认领状态
	 */
	
	private String renlingzhuangtai;
		
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
	 * 设置：捡拾地点
	 */
	 
	public void setJianshididian(String jianshididian) {
		this.jianshididian = jianshididian;
	}
	
	/**
	 * 获取：捡拾地点
	 */
	public String getJianshididian() {
		return jianshididian;
	}
				
	
	/**
	 * 设置：捡拾时间
	 */
	 
	public void setJianshishijian(Date jianshishijian) {
		this.jianshishijian = jianshishijian;
	}
	
	/**
	 * 获取：捡拾时间
	 */
	public Date getJianshishijian() {
		return jianshishijian;
	}
				
	
	/**
	 * 设置：认领状态
	 */
	 
	public void setRenlingzhuangtai(String renlingzhuangtai) {
		this.renlingzhuangtai = renlingzhuangtai;
	}
	
	/**
	 * 获取：认领状态
	 */
	public String getRenlingzhuangtai() {
		return renlingzhuangtai;
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
