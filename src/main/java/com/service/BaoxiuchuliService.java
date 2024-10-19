package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiuchuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiuchuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiuchuliView;


/**
 * 报修处理
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface BaoxiuchuliService extends IService<BaoxiuchuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiuchuliVO> selectListVO(Wrapper<BaoxiuchuliEntity> wrapper);
   	
   	BaoxiuchuliVO selectVO(@Param("ew") Wrapper<BaoxiuchuliEntity> wrapper);
   	
   	List<BaoxiuchuliView> selectListView(Wrapper<BaoxiuchuliEntity> wrapper);
   	
   	BaoxiuchuliView selectView(@Param("ew") Wrapper<BaoxiuchuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiuchuliEntity> wrapper);
   	
}

