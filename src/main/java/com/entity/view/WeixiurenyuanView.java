package com.entity.view;

import com.entity.WeixiurenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
@TableName("weixiurenyuan")
public class WeixiurenyuanView  extends WeixiurenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiurenyuanView(){
	}
 
 	public WeixiurenyuanView(WeixiurenyuanEntity weixiurenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, weixiurenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
