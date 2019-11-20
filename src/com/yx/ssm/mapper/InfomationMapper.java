package com.yx.ssm.mapper;

import com.yx.ssm.po.Infomation;
import com.yx.ssm.po.InfomationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfomationMapper {
    int countByExample(InfomationExample example);

    int deleteByExample(InfomationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Infomation record);

    int insertSelective(Infomation record);

    List<Infomation> selectByExample(InfomationExample example);

    Infomation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Infomation record, @Param("example") InfomationExample example);

    int updateByExample(@Param("record") Infomation record, @Param("example") InfomationExample example);

    int updateByPrimaryKeySelective(Infomation record);

    int updateByPrimaryKey(Infomation record);
}