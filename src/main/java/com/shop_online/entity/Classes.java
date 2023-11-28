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
@TableName("classes")
@ApiModel(value = "Classes对象", description = "")
public class Classes {

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    @TableField("cname")
    private String cname;

    @TableField("cdesc")
    private String cdesc;
}
