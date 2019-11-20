package com.yx.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yx.ssm.po.Infomation;
import com.yx.ssm.po.InfomationCustom;
import com.yx.ssm.service.InfomationService;

@Controller
@RequestMapping("/infomation")
public class InfomationController {

	@Autowired
	private InfomationService infomationService;

	@RequestMapping("/queryInfomation")
	public ModelAndView execute() throws Exception {

		// 调用service查询数据
		List<InfomationCustom> infomationCustoms = infomationService.selectByBean(null);

		// 返回MODELVIEW
		ModelAndView modelAndView = new ModelAndView();

		// 相当于setAttribute
		modelAndView.addObject("infomations", infomationCustoms);

		// 设置视图
		modelAndView.setViewName("/infomation");

		return modelAndView;
	}

	@RequestMapping("/selectByPrimaryKey")
	public ModelAndView selectByPrimaryKey() throws Exception {

		List<InfomationCustom> infomationCustoms = new ArrayList<InfomationCustom>();
		InfomationCustom infomationCustom = new InfomationCustom();
		
		// 根据ID查询商品信息
		Infomation infomation = infomationService.selectByPrimaryKey(1);
		BeanUtils.copyProperties(infomation, infomationCustom);
		infomationCustoms.add(infomationCustom);

		// 返回MODELVIEW
		ModelAndView modelAndView = new ModelAndView();

		// 查询结果放入modle
		modelAndView.addObject("infomations", infomationCustoms);

		// 设置视图
		modelAndView.setViewName("/infomation");

		return modelAndView;
	}

	@RequestMapping("/updateByPrimaryKey")
	public String updateByPrimaryKey() throws Exception {

		Infomation infomation = new Infomation();
		infomation.setId(1);
		infomation.setPassword("000001");
		
		// 调用service更新商品信息
		infomationService.updateByPrimaryKeySelective(infomation);

//		return "redirect:queryInfomation.action";
		return "forward:queryInfomation.action";
	}
}
