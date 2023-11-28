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
@TableName("details")
@ApiModel(value = "Details对象", description = "")
public class Details {

    @TableId(value = "detail_id", type = IdType.AUTO)
    private Integer detailId;

    @TableField("user_addr")
    private String userAddr;

    @TableField("user_tel")
    private String userTel;

    @TableField("user_desc")
    private String userDesc;

    @TableField("uid")
    private Integer uid;
}
