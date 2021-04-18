package cn.hoscen.demo.user.converter;

import cn.hoscen.demo.user.bean.User;
import cn.hoscen.demo.user.bean.User.UserBuilder;
import cn.hoscen.demo.user.bean.UserQuery;
import cn.hoscen.demo.user.bean.UserQuery.UserQueryBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-18T20:16:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_282 (AdoptOpenJDK)"
)
public class User2UserQueryConverterImpl implements User2UserQueryConverter {

    @Override
    public UserQuery toTarget(User source) {
        if ( source == null ) {
            return null;
        }

        UserQueryBuilder userQuery = UserQuery.builder();

        userQuery.userName( source.getUserName() );
        userQuery.phone( source.getPhone() );

        return userQuery.build();
    }

    @Override
    public User toSource(UserQuery target) {
        if ( target == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.userName( target.getUserName() );
        user.phone( target.getPhone() );

        return user.build();
    }

    @Override
    public List<UserQuery> toTargets(List<User> sources) {
        if ( sources == null ) {
            return null;
        }

        List<UserQuery> list = new ArrayList<UserQuery>( sources.size() );
        for ( User user : sources ) {
            list.add( toTarget( user ) );
        }

        return list;
    }

    @Override
    public List<User> toSources(List<UserQuery> targets) {
        if ( targets == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( targets.size() );
        for ( UserQuery userQuery : targets ) {
            list.add( toSource( userQuery ) );
        }

        return list;
    }
}
