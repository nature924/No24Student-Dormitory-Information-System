package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshiwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshiwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshiwuxinxiView;


/**
 * 失物信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface DiscussshiwuxinxiService extends IService<DiscussshiwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiwuxinxiVO> selectListVO(Wrapper<DiscussshiwuxinxiEntity> wrapper);
   	
   	DiscussshiwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussshiwuxinxiEntity> wrapper);
   	
   	List<DiscussshiwuxinxiView> selectListView(Wrapper<DiscussshiwuxinxiEntity> wrapper);
   	
   	DiscussshiwuxinxiView selectView(@Param("ew") Wrapper<DiscussshiwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshiwuxinxiEntity> wrapper);
   	
}

