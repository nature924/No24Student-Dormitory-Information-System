package com.entity.view;

import com.entity.TongzhuangshuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 桶装水
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
@TableName("tongzhuangshui")
public class TongzhuangshuiView  extends TongzhuangshuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongzhuangshuiView(){
	}
 
 	public TongzhuangshuiView(TongzhuangshuiEntity tongzhuangshuiEntity){
 	try {
			BeanUtils.copyProperties(this, tongzhuangshuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
