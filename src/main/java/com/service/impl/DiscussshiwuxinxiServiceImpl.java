package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshiwuxinxiDao;
import com.entity.DiscussshiwuxinxiEntity;
import com.service.DiscussshiwuxinxiService;
import com.entity.vo.DiscussshiwuxinxiVO;
import com.entity.view.DiscussshiwuxinxiView;

@Service("discussshiwuxinxiService")
public class DiscussshiwuxinxiServiceImpl extends ServiceImpl<DiscussshiwuxinxiDao, DiscussshiwuxinxiEntity> implements DiscussshiwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiwuxinxiEntity> page = this.selectPage(
                new Query<DiscussshiwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshiwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshiwuxinxiEntity> wrapper) {
		  Page<DiscussshiwuxinxiView> page =new Query<DiscussshiwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshiwuxinxiVO> selectListVO(Wrapper<DiscussshiwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshiwuxinxiVO selectVO(Wrapper<DiscussshiwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshiwuxinxiView> selectListView(Wrapper<DiscussshiwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiwuxinxiView selectView(Wrapper<DiscussshiwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
