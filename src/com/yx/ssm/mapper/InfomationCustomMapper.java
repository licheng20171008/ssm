package com.yx.ssm.mapper;

import java.util.List;

import com.yx.ssm.po.InfomationCustom;
import com.yx.ssm.vo.InfomationVo;

public interface InfomationCustomMapper {
	
	public List<InfomationCustom> selectByBean(InfomationVo infomationVo) throws Exception;
}