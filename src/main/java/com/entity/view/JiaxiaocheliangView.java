package com.entity.view;

import com.entity.JiaxiaocheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾校车辆
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
@TableName("jiaxiaocheliang")
public class JiaxiaocheliangView  extends JiaxiaocheliangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaxiaocheliangView(){
	}
 
 	public JiaxiaocheliangView(JiaxiaocheliangEntity jiaxiaocheliangEntity){
 	try {
			BeanUtils.copyProperties(this, jiaxiaocheliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
