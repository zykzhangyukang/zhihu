package com.coderman.zhihu.model.user;

import com.coderman.api.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Data
@ApiModel(value="UserFollowModel", description = "")
public class UserFollowModel extends BaseModel {
    
    @ApiModelProperty(value = "主键")
    private Integer userFollowId;

    @ApiModelProperty(value = "关注状态")
    private Boolean followStatus;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "被关注人id")
    private Integer targetId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}