package com.dao;

import com.entity.JiaxiaojiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaxiaojiaolianVO;
import com.entity.view.JiaxiaojiaolianView;


/**
 * 驾校教练
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:46:23
 */
public interface JiaxiaojiaolianDao extends BaseMapper<JiaxiaojiaolianEntity> {
	
	List<JiaxiaojiaolianVO> selectListVO(@Param("ew") Wrapper<JiaxiaojiaolianEntity> wrapper);
	
	JiaxiaojiaolianVO selectVO(@Param("ew") Wrapper<JiaxiaojiaolianEntity> wrapper);
	
	List<JiaxiaojiaolianView> selectListView(@Param("ew") Wrapper<JiaxiaojiaolianEntity> wrapper);

	List<JiaxiaojiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<JiaxiaojiaolianEntity> wrapper);
	
	JiaxiaojiaolianView selectView(@Param("ew") Wrapper<JiaxiaojiaolianEntity> wrapper);
	
}
