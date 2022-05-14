package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaxiaogonggaoEntity;
import com.entity.view.JiaxiaogonggaoView;

import com.service.JiaxiaogonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 驾校公告
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-30 14:46:24
 */
@RestController
@RequestMapping("/jiaxiaogonggao")
public class JiaxiaogonggaoController {
    @Autowired
    private JiaxiaogonggaoService jiaxiaogonggaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaxiaogonggaoEntity jiaxiaogonggao, HttpServletRequest request){

        EntityWrapper<JiaxiaogonggaoEntity> ew = new EntityWrapper<JiaxiaogonggaoEntity>();
		PageUtils page = jiaxiaogonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaxiaogonggao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaxiaogonggaoEntity jiaxiaogonggao, HttpServletRequest request){
        EntityWrapper<JiaxiaogonggaoEntity> ew = new EntityWrapper<JiaxiaogonggaoEntity>();
		PageUtils page = jiaxiaogonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaxiaogonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaxiaogonggaoEntity jiaxiaogonggao){
       	EntityWrapper<JiaxiaogonggaoEntity> ew = new EntityWrapper<JiaxiaogonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaxiaogonggao, "jiaxiaogonggao")); 
        return R.ok().put("data", jiaxiaogonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaxiaogonggaoEntity jiaxiaogonggao){
        EntityWrapper< JiaxiaogonggaoEntity> ew = new EntityWrapper< JiaxiaogonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaxiaogonggao, "jiaxiaogonggao")); 
		JiaxiaogonggaoView jiaxiaogonggaoView =  jiaxiaogonggaoService.selectView(ew);
		return R.ok("查询驾校公告成功").put("data", jiaxiaogonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        JiaxiaogonggaoEntity jiaxiaogonggao = jiaxiaogonggaoService.selectById(id);
        return R.ok().put("data", jiaxiaogonggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        JiaxiaogonggaoEntity jiaxiaogonggao = jiaxiaogonggaoService.selectById(id);
        return R.ok().put("data", jiaxiaogonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaxiaogonggaoEntity jiaxiaogonggao, HttpServletRequest request){
    	jiaxiaogonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaxiaogonggao);

        jiaxiaogonggaoService.insert(jiaxiaogonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaxiaogonggaoEntity jiaxiaogonggao, HttpServletRequest request){
    	jiaxiaogonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaxiaogonggao);

        jiaxiaogonggaoService.insert(jiaxiaogonggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaxiaogonggaoEntity jiaxiaogonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaxiaogonggao);
        jiaxiaogonggaoService.updateById(jiaxiaogonggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaxiaogonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaxiaogonggaoEntity> wrapper = new EntityWrapper<JiaxiaogonggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiaxiaogonggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
