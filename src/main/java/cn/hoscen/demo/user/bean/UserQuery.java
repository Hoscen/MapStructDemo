package cn.hoscen.demo.user.bean;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 用户查询对象
 * Created by Hoscen on 2021/4/18 19:28 with IntelliJ IDEA.
 */
@Data
@Builder
public class UserQuery {

    private String userName;

    private String phone;

}
