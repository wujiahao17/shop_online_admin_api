package com.shop_online.service;

import com.shop_online.common.model.Query;
import com.shop_online.common.result.PageResult;
import com.shop_online.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop_online.vo.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wu
 * @since 2023-11-28
 */
public interface UserService extends IService<User> {
    PageResult<UserVO> getPage(Query query);
}
