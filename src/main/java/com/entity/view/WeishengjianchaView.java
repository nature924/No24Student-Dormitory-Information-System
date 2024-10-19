package com.entity.view;

import com.entity.WeishengjianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 卫生检查
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
@TableName("weishengjiancha")
public class WeishengjianchaView  extends WeishengjianchaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeishengjianchaView(){
	}
 
 	public WeishengjianchaView(WeishengjianchaEntity weishengjianchaEntity){
 	try {
			BeanUtils.copyProperties(this, weishengjianchaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
