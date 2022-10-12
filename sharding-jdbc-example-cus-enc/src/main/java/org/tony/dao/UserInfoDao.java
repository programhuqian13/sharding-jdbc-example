package org.tony.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.tony.domain.UserInfo;

/**
 * @author Tony
 */
@Repository
public interface UserInfoDao extends BaseMapper<UserInfo> {
}
