package com.dao;

import com.entity.XueyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuanVO;
import com.entity.view.XueyuanView;


/**
 * 学员
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:46:23
 */
public interface XueyuanDao extends BaseMapper<XueyuanEntity> {
	
	List<XueyuanVO> selectListVO(@Param("ew") Wrapper<XueyuanEntity> wrapper);
	
	XueyuanVO selectVO(@Param("ew") Wrapper<XueyuanEntity> wrapper);
	
	List<XueyuanView> selectListView(@Param("ew") Wrapper<XueyuanEntity> wrapper);

	List<XueyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuanEntity> wrapper);
	
	XueyuanView selectView(@Param("ew") Wrapper<XueyuanEntity> wrapper);
	
}
