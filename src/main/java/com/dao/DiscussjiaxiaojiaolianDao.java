package com.dao;

import com.entity.DiscussjiaxiaojiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaxiaojiaolianVO;
import com.entity.view.DiscussjiaxiaojiaolianView;


/**
 * 驾校教练评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public interface DiscussjiaxiaojiaolianDao extends BaseMapper<DiscussjiaxiaojiaolianEntity> {
	
	List<DiscussjiaxiaojiaolianVO> selectListVO(@Param("ew") Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
	
	DiscussjiaxiaojiaolianVO selectVO(@Param("ew") Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
	
	List<DiscussjiaxiaojiaolianView> selectListView(@Param("ew") Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);

	List<DiscussjiaxiaojiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
	
	DiscussjiaxiaojiaolianView selectView(@Param("ew") Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
	
}
