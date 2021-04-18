package cn.hoscen.demo.test;

import cn.hoscen.demo.user.bean.User;
import cn.hoscen.demo.user.bean.UserQuery;
import cn.hoscen.demo.user.converter.User2UserQueryConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 测试 User2UserQueryConverter 效果
 * Created by Hoscen on 2021/4/18 19:43 with IntelliJ IDEA.
 */
public class TestUser2UserQueryConverter {

    public static void main(String[] args) {
        TestUser2UserQueryConverter ins = new TestUser2UserQueryConverter();
        ins.test1();
        ins.test2();
        ins.test3();
        ins.test4();
    }

    private void test1(){
        // User 对象转 UserQuery
        User user = User.builder().userId(1).userName("张三").sex(1).phone("123456789").build();
        UserQuery userQuery1 = User2UserQueryConverter.INSTANCE.toTarget(user);
        System.out.println("userQuery1:\n" + userQuery1.toString());
        System.out.println();
    }

    private void test2(){
        // UserQuery 对象转 User
        UserQuery userQuery = UserQuery.builder().userName("李四").phone("111111111").build();
        User user1 = User2UserQueryConverter.INSTANCE.toSource(userQuery);
        System.out.println("user1:\n" + user1.toString());
        System.out.println();
    }

    private void test3(){
        // User list 转 UserQuery list
        List<User> list = new ArrayList<>();
        User user = User.builder().userId(1).userName("张三").sex(1).phone("123456789").build();
        User user2 = User.builder().userId(2).userName("张四").sex(1).phone("11111").build();
        list.add(user);
        list.add(user2);

        List<UserQuery> userQueries = User2UserQueryConverter.INSTANCE.toTargets(list);
        System.out.println("userQueries:\n" + userQueries.toString());
        System.out.println();
    }

    private void test4(){
        // UserQuery list 转 User list
        List<UserQuery> list = new ArrayList<>();
        UserQuery userQuery = UserQuery.builder().userName("李四").phone("111111111").build();
        UserQuery userQuery2 = UserQuery.builder().userName("王五").phone("22222222").build();
        list.add(userQuery);
        list.add(userQuery2);

        List<User> users = User2UserQueryConverter.INSTANCE.toSources(list);
        System.out.println("users:\n" + users.toString());
        System.out.println();
    }
}
