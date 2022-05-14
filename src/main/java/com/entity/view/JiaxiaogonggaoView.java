package com.entity.view;

import com.entity.JiaxiaogonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾校公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
@TableName("jiaxiaogonggao")
public class JiaxiaogonggaoView  extends JiaxiaogonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaxiaogonggaoView(){
	}
 
 	public JiaxiaogonggaoView(JiaxiaogonggaoEntity jiaxiaogonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiaxiaogonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
