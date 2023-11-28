package com.shop_online.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author wu
 * @since 2023-11-28
 */
@Getter
@Setter
@TableName("student")
@ApiModel(value = "Student对象", description = "")
public class Student {

    @TableId(value = "sid", type = IdType.AUTO)
    private String sid;

    @TableField("sname")
    private String sname;

    @TableField("sage")
    private Integer sage;

    @TableField("scid")
    private Integer scid;
}
