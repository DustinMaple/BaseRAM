package com.maple.persistence.example.entity;


import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "account")
@Table(appliesTo = "account")
public class AccountEntity {
    @Id
    @Column(columnDefinition = "varchar(255) character set utf8 collate utf8_bin comment '账号id'")
    private String accountId;

    @Column(columnDefinition = "varchar(255) character set utf8 collate utf8_bin comment '昵称'")
    private String nickName;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
