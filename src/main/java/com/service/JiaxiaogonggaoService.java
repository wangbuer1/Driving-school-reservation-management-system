package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaxiaogonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaxiaogonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaxiaogonggaoView;


/**
 * 驾校公告
 *
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public interface JiaxiaogonggaoService extends IService<JiaxiaogonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaxiaogonggaoVO> selectListVO(Wrapper<JiaxiaogonggaoEntity> wrapper);
   	
   	JiaxiaogonggaoVO selectVO(@Param("ew") Wrapper<JiaxiaogonggaoEntity> wrapper);
   	
   	List<JiaxiaogonggaoView> selectListView(Wrapper<JiaxiaogonggaoEntity> wrapper);
   	
   	JiaxiaogonggaoView selectView(@Param("ew") Wrapper<JiaxiaogonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaxiaogonggaoEntity> wrapper);
   	
}

