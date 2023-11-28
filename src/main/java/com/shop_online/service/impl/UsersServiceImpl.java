package com.shop_online.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop_online.common.model.Query;
import com.shop_online.common.result.PageResult;
import com.shop_online.convert.UserConvert;
import com.shop_online.entity.User;
import com.shop_online.entity.Users;
import com.shop_online.mapper.UsersMapper;
import com.shop_online.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop_online.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wu
 * @since 2023-11-28
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
}
