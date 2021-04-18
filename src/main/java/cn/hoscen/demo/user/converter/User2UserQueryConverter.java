package cn.hoscen.demo.user.converter;

import cn.hoscen.demo.mapStruct.BeanConverter;
import cn.hoscen.demo.user.bean.User;
import cn.hoscen.demo.user.bean.UserQuery;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Description: User与UserQuery对象转换
 * Created by Hoscen on 2021/4/18 19:32 with IntelliJ IDEA.
 */
@Mapper
public interface User2UserQueryConverter extends BeanConverter<User, UserQuery> {

    User2UserQueryConverter INSTANCE = Mappers.getMapper(User2UserQueryConverter.class);

}
