package com.dao;

import com.entity.QuxiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaoyuyueVO;
import com.entity.view.QuxiaoyuyueView;


/**
 * 取消预约
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public interface QuxiaoyuyueDao extends BaseMapper<QuxiaoyuyueEntity> {
	
	List<QuxiaoyuyueVO> selectListVO(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
	
	QuxiaoyuyueVO selectVO(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
	
	List<QuxiaoyuyueView> selectListView(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);

	List<QuxiaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
	
	QuxiaoyuyueView selectView(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
	
}
