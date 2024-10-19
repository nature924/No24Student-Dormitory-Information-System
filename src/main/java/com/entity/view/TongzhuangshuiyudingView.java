package com.entity.view;

import com.entity.TongzhuangshuiyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 桶装水预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
@TableName("tongzhuangshuiyuding")
public class TongzhuangshuiyudingView  extends TongzhuangshuiyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongzhuangshuiyudingView(){
	}
 
 	public TongzhuangshuiyudingView(TongzhuangshuiyudingEntity tongzhuangshuiyudingEntity){
 	try {
			BeanUtils.copyProperties(this, tongzhuangshuiyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
