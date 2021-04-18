package cn.hoscen.demo.org.converter;

import cn.hoscen.demo.mapStruct.BeanConverter;
import cn.hoscen.demo.org.bean.Org;
import cn.hoscen.demo.org.bean.OrgQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Description: Org与OrgQuery对象转换
 * Created by Hoscen on 2021/4/18 19:32 with IntelliJ IDEA.
 */
@Mapper
public interface Org2OrgQueryConverter extends BeanConverter<Org, OrgQuery> {

    Org2OrgQueryConverter INSTANCE = Mappers.getMapper(Org2OrgQueryConverter.class);

    @Override
    @Mapping(source = "orgNo", target = "code")
    @Mapping(source = "orgType", target = "type")
    OrgQuery toTarget(Org org);
}
