package com.entity.view;

import com.entity.DiscussshiwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失物信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
@TableName("discussshiwuxinxi")
public class DiscussshiwuxinxiView  extends DiscussshiwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshiwuxinxiView(){
	}
 
 	public DiscussshiwuxinxiView(DiscussshiwuxinxiEntity discussshiwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshiwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
