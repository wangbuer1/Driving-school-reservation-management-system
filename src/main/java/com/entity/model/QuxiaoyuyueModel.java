package com.entity.model;

import com.entity.QuxiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 取消预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
public class QuxiaoyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教练账号
	 */
	
	private String jiaolianzhanghao;
		
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
		
	/**
	 * 学员账号
	 */
	
	private String xueyuanzhanghao;
		
	/**
	 * 预约科目
	 */
	
	private String yuyuekemu;
		
	/**
	 * 预约时间
	 */
	
	private String yuyueshijian;
		
	/**
	 * 取消理由
	 */
	
	private String quxiaoliyou;
				
	
	/**
	 * 设置：教练账号
	 */
	 
	public void setJiaolianzhanghao(String jiaolianzhanghao) {
		this.jiaolianzhanghao = jiaolianzhanghao;
	}
	
	/**
	 * 获取：教练账号
	 */
	public String getJiaolianzhanghao() {
		return jiaolianzhanghao;
	}
				
	
	/**
	 * 设置：教练姓名
	 */
	 
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
				
	
	/**
	 * 设置：学员账号
	 */
	 
	public void setXueyuanzhanghao(String xueyuanzhanghao) {
		this.xueyuanzhanghao = xueyuanzhanghao;
	}
	
	/**
	 * 获取：学员账号
	 */
	public String getXueyuanzhanghao() {
		return xueyuanzhanghao;
	}
				
	
	/**
	 * 设置：预约科目
	 */
	 
	public void setYuyuekemu(String yuyuekemu) {
		this.yuyuekemu = yuyuekemu;
	}
	
	/**
	 * 获取：预约科目
	 */
	public String getYuyuekemu() {
		return yuyuekemu;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(String yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public String getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：取消理由
	 */
	 
	public void setQuxiaoliyou(String quxiaoliyou) {
		this.quxiaoliyou = quxiaoliyou;
	}
	
	/**
	 * 获取：取消理由
	 */
	public String getQuxiaoliyou() {
		return quxiaoliyou;
	}
			
}
