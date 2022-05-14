package com.dao;

import com.entity.JiaxiaogonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaxiaogonggaoVO;
import com.entity.view.JiaxiaogonggaoView;


/**
 * 驾校公告
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public interface JiaxiaogonggaoDao extends BaseMapper<JiaxiaogonggaoEntity> {
	
	List<JiaxiaogonggaoVO> selectListVO(@Param("ew") Wrapper<JiaxiaogonggaoEntity> wrapper);
	
	JiaxiaogonggaoVO selectVO(@Param("ew") Wrapper<JiaxiaogonggaoEntity> wrapper);
	
	List<JiaxiaogonggaoView> selectListView(@Param("ew") Wrapper<JiaxiaogonggaoEntity> wrapper);

	List<JiaxiaogonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiaxiaogonggaoEntity> wrapper);
	
	JiaxiaogonggaoView selectView(@Param("ew") Wrapper<JiaxiaogonggaoEntity> wrapper);
	
}
