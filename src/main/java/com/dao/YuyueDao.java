package com.dao;

import com.entity.YuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyueVO;
import com.entity.view.YuyueView;


/**
 * 预约
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public interface YuyueDao extends BaseMapper<YuyueEntity> {
	
	List<YuyueVO> selectListVO(@Param("ew") Wrapper<YuyueEntity> wrapper);
	
	YuyueVO selectVO(@Param("ew") Wrapper<YuyueEntity> wrapper);
	
	List<YuyueView> selectListView(@Param("ew") Wrapper<YuyueEntity> wrapper);

	List<YuyueView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueEntity> wrapper);
	
	YuyueView selectView(@Param("ew") Wrapper<YuyueEntity> wrapper);
	
}
