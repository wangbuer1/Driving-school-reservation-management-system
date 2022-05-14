package com.dao;

import com.entity.JiaxiaocheliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaxiaocheliangVO;
import com.entity.view.JiaxiaocheliangView;


/**
 * 驾校车辆
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public interface JiaxiaocheliangDao extends BaseMapper<JiaxiaocheliangEntity> {
	
	List<JiaxiaocheliangVO> selectListVO(@Param("ew") Wrapper<JiaxiaocheliangEntity> wrapper);
	
	JiaxiaocheliangVO selectVO(@Param("ew") Wrapper<JiaxiaocheliangEntity> wrapper);
	
	List<JiaxiaocheliangView> selectListView(@Param("ew") Wrapper<JiaxiaocheliangEntity> wrapper);

	List<JiaxiaocheliangView> selectListView(Pagination page,@Param("ew") Wrapper<JiaxiaocheliangEntity> wrapper);
	
	JiaxiaocheliangView selectView(@Param("ew") Wrapper<JiaxiaocheliangEntity> wrapper);
	
}
