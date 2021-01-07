package com.itheima.domain;

import java.util.List;

/**
 * @Author : shi zhao heng
 * @Date :   2021/1/4 17:10
 * @Description :
 */
public class QueryVo {
    private User user;
    private List<Integer> ids;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
