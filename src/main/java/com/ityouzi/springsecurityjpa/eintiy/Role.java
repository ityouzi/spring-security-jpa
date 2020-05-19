package com.ityouzi.springsecurityjpa.eintiy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Auther: Liberal-World
 * @Date: 2020-05-19 14:52
 * @Description: 用户角色
 * @Version 1.0
 */
@Entity(name = "t_role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nameZh;

}
