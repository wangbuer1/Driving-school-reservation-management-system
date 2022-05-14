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


import com.dao.YuyueDao;
import com.entity.YuyueEntity;
import com.service.YuyueService;
import com.entity.vo.YuyueVO;
import com.entity.view.YuyueView;

@Service("yuyueService")
public class YuyueServiceImpl extends ServiceImpl<YuyueDao, YuyueEntity> implements YuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyueEntity> page = this.selectPage(
                new Query<YuyueEntity>(params).getPage(),
                new EntityWrapper<YuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyueEntity> wrapper) {
		  Page<YuyueView> page =new Query<YuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyueVO> selectListVO(Wrapper<YuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyueVO selectVO(Wrapper<YuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyueView> selectListView(Wrapper<YuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyueView selectView(Wrapper<YuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
