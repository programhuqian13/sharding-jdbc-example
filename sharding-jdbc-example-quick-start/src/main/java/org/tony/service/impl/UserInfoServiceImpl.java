package org.tony.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.tony.dao.UserInfoDao;
import org.tony.domain.UserInfo;
import org.tony.service.UserInfoService;

/**
 * @author Tony
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo>
    implements UserInfoService {

}
