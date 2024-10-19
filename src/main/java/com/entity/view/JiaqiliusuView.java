package com.entity.view;

import com.entity.JiaqiliusuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 假期留宿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
@TableName("jiaqiliusu")
public class JiaqiliusuView  extends JiaqiliusuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaqiliusuView(){
	}
 
 	public JiaqiliusuView(JiaqiliusuEntity jiaqiliusuEntity){
 	try {
			BeanUtils.copyProperties(this, jiaqiliusuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
