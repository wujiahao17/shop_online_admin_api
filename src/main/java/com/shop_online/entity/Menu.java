package com.shop_online.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("sys_menu")
@ApiModel(value = "Menu对象", description = "")
public class Menu {

    @ApiModelProperty("自增主键")
    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer pkId;

    @ApiModelProperty("父级id")
    @TableField("parent_id")
    private Integer parentId;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("路径")
    @TableField("path")
    private String path;

    @ApiModelProperty("组件路径")
    @TableField("component")
    private String component;

    @ApiModelProperty("菜单类型 menu: 菜单 button: 按钮")
    @TableField("type")
    private String type;

    @ApiModelProperty("打开类型 tab: 选项卡 url: 外链")
    @TableField("open_type")
    private String openType;

    @ApiModelProperty("外链地址")
    @TableField("url")
    private String url;

    @ApiModelProperty("菜单图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("授权标识(多个用逗号分隔，如：sys:menu:list,sys:menu:save)")
    @TableField("auth")
    private String auth;

    @ApiModelProperty("是否缓存 0:true 1:false")
    @TableField("keepalive")
    private Byte keepalive;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("逻辑删除(0-未删除，1-删除)")
    @TableField("delete_flag")
    @TableLogic
    private Byte deleteFlag;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
