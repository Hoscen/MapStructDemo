package cn.hoscen.demo.user.bean;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 用户对象
 * Created by Hoscen on 2021/4/18 19:28 with IntelliJ IDEA.
 */
@Data
@Builder
public class User {

    private Integer userId;

    private String userName;

    private Integer sex;

    private String phone;

}
