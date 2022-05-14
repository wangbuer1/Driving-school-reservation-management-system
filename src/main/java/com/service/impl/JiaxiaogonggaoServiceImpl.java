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


import com.dao.JiaxiaogonggaoDao;
import com.entity.JiaxiaogonggaoEntity;
import com.service.JiaxiaogonggaoService;
import com.entity.vo.JiaxiaogonggaoVO;
import com.entity.view.JiaxiaogonggaoView;

@Service("jiaxiaogonggaoService")
public class JiaxiaogonggaoServiceImpl extends ServiceImpl<JiaxiaogonggaoDao, JiaxiaogonggaoEntity> implements JiaxiaogonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaxiaogonggaoEntity> page = this.selectPage(
                new Query<JiaxiaogonggaoEntity>(params).getPage(),
                new EntityWrapper<JiaxiaogonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaxiaogonggaoEntity> wrapper) {
		  Page<JiaxiaogonggaoView> page =new Query<JiaxiaogonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaxiaogonggaoVO> selectListVO(Wrapper<JiaxiaogonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaxiaogonggaoVO selectVO(Wrapper<JiaxiaogonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaxiaogonggaoView> selectListView(Wrapper<JiaxiaogonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaxiaogonggaoView selectView(Wrapper<JiaxiaogonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
