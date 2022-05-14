package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueView;


/**
 * 预约
 *
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public interface YuyueService extends IService<YuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueVO> selectListVO(Wrapper<YuyueEntity> wrapper);
   	
   	YuyueVO selectVO(@Param("ew") Wrapper<YuyueEntity> wrapper);
   	
   	List<YuyueView> selectListView(Wrapper<YuyueEntity> wrapper);
   	
   	YuyueView selectView(@Param("ew") Wrapper<YuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueEntity> wrapper);
   	
}

