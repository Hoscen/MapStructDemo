package cn.hoscen.demo.mapStruct;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

/**
 * 定义通用BeanConverter，支持对象转换以及对象集合转换
 * Created by Hoscen on 2021/4/18 19:24 with IntelliJ IDEA.
 */
public interface BeanConverter<SOURCE, TARGET> {

    TARGET toTarget(SOURCE source);

    @InheritInverseConfiguration(name = "toTarget")
    SOURCE toSource(TARGET target);

    @InheritConfiguration(name = "toTarget")
    List<TARGET> toTargets(List<SOURCE> sources);

    @InheritConfiguration(name = "toSource")
    List<SOURCE> toSources(List<TARGET> targets);

}
