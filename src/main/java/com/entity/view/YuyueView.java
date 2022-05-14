package com.entity.view;

import com.entity.YuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
@TableName("yuyue")
public class YuyueView  extends YuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyueView(){
	}
 
 	public YuyueView(YuyueEntity yuyueEntity){
 	try {
			BeanUtils.copyProperties(this, yuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
