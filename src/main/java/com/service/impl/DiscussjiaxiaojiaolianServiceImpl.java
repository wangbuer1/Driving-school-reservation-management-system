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


import com.dao.DiscussjiaxiaojiaolianDao;
import com.entity.DiscussjiaxiaojiaolianEntity;
import com.service.DiscussjiaxiaojiaolianService;
import com.entity.vo.DiscussjiaxiaojiaolianVO;
import com.entity.view.DiscussjiaxiaojiaolianView;

@Service("discussjiaxiaojiaolianService")
public class DiscussjiaxiaojiaolianServiceImpl extends ServiceImpl<DiscussjiaxiaojiaolianDao, DiscussjiaxiaojiaolianEntity> implements DiscussjiaxiaojiaolianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaxiaojiaolianEntity> page = this.selectPage(
                new Query<DiscussjiaxiaojiaolianEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaxiaojiaolianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaxiaojiaolianEntity> wrapper) {
		  Page<DiscussjiaxiaojiaolianView> page =new Query<DiscussjiaxiaojiaolianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaxiaojiaolianVO> selectListVO(Wrapper<DiscussjiaxiaojiaolianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaxiaojiaolianVO selectVO(Wrapper<DiscussjiaxiaojiaolianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaxiaojiaolianView> selectListView(Wrapper<DiscussjiaxiaojiaolianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaxiaojiaolianView selectView(Wrapper<DiscussjiaxiaojiaolianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
