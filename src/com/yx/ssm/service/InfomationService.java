package com.yx.ssm.service;

import java.util.List;

import com.yx.ssm.po.Infomation;
import com.yx.ssm.po.InfomationCustom;
import com.yx.ssm.vo.InfomationVo;

public interface InfomationService {

	public List<InfomationCustom> selectByBean(InfomationVo infomationVo) throws Exception;
	
	public Infomation selectByPrimaryKey(Integer id) throws Exception;
	
	public int updateByPrimaryKeySelective(Infomation record) throws Exception;
}