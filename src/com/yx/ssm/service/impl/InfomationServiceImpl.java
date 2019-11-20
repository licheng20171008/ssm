package com.yx.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yx.ssm.mapper.InfomationCustomMapper;
import com.yx.ssm.mapper.InfomationMapper;
import com.yx.ssm.po.Infomation;
import com.yx.ssm.po.InfomationCustom;
import com.yx.ssm.service.InfomationService;
import com.yx.ssm.vo.InfomationVo;

public class InfomationServiceImpl implements InfomationService {

	@Autowired
	private InfomationCustomMapper infomationCustomMapper;
	
	@Autowired
	private InfomationMapper infomationMapper;
	
	@Override
	public List<InfomationCustom> selectByBean(InfomationVo infomationVo) throws Exception {
		return infomationCustomMapper.selectByBean(infomationVo);
	}

	@Override
	public Infomation selectByPrimaryKey(Integer id) throws Exception {
		return infomationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Infomation record) throws Exception {
		return infomationMapper.updateByPrimaryKeySelective(record);
	}
}