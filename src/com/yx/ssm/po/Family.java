package com.yx.ssm.po;

/**
 * 
 * 
 * @author licheng
 * 
 * @date 2017-10-16
 */
public class Family {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 人员编号
     */
    private Integer infoId;

    /**
     * 家属编号
     */
    private Integer code;

    /**
     * 家属名称
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}