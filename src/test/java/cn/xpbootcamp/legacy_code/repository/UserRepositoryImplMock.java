package cn.xpbootcamp.legacy_code.repository;

import cn.xpbootcamp.legacy_code.entity.User;

public class UserRepositoryImplMock implements UserRepository {
    @Override
    public User find(long id) {
        User user = new User();
        user.setBalance(100L);
        return user;
    }
}
