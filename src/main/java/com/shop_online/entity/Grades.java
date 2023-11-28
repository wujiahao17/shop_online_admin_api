package com.shop_online.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("grades")
@ApiModel(value = "Grades对象", description = "")
public class Grades {

    @TableField("sid")
    private String sid;

    @TableField("cid")
    private Integer cid;

    @TableField("score")
    private Integer score;
}
