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
@TableName("members")
@ApiModel(value = "Members对象", description = "")
public class Members {

    @TableId(value = "member_id", type = IdType.AUTO)
    private Integer memberId;

    @TableField("member_nick")
    private String memberNick;

    @TableField("member_gender")
    private String memberGender;

    @TableField("member_age")
    private Integer memberAge;

    @TableField("member_city")
    private String memberCity;
}
