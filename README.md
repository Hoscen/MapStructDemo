# MapStructDemo

优雅的Java对象转换解决方案 - MapStruct 实战

需要引入依赖，本文以maven为例：
<properties>
    <org.mapstruct.version>1.3.0.Final</org.mapstruct.version>
</properties>

<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct-jdk8</artifactId>
    <version>${org.mapstruct.version}</version>
</dependency>
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct-processor</artifactId>
    <version>${org.mapstruct.version}</version>
</dependency>

注意：
lombok依赖不是必须的，只是为了简化java bean代码。