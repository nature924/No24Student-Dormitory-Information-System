package com.entity.view;

import com.entity.ZhaolingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招领信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
@TableName("zhaolingxinxi")
public class ZhaolingxinxiView  extends ZhaolingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaolingxinxiView(){
	}
 
 	public ZhaolingxinxiView(ZhaolingxinxiEntity zhaolingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhaolingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
