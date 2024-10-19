package com.entity.view;

import com.entity.TongzhuangshuipinpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 桶装水品牌
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
@TableName("tongzhuangshuipinpai")
public class TongzhuangshuipinpaiView  extends TongzhuangshuipinpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongzhuangshuipinpaiView(){
	}
 
 	public TongzhuangshuipinpaiView(TongzhuangshuipinpaiEntity tongzhuangshuipinpaiEntity){
 	try {
			BeanUtils.copyProperties(this, tongzhuangshuipinpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
