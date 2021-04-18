package cn.hoscen.demo.test;


import cn.hoscen.demo.org.bean.Org;
import cn.hoscen.demo.org.bean.OrgQuery;
import cn.hoscen.demo.org.converter.Org2OrgQueryConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 测试 Org2OrgQueryConverter 效果
 * Created by Hoscen on 2021/4/18 19:43 with IntelliJ IDEA.
 */
public class TestOrg2OrgQueryConverter {

    public static void main(String[] args) {
        TestOrg2OrgQueryConverter ins = new TestOrg2OrgQueryConverter();
        ins.test1();
        ins.test2();
        ins.test3();
        ins.test4();
    }

    private void test1(){
        // Org 对象转 OrgQuery
        Org Org = cn.hoscen.demo.org.bean.Org.builder().orgId(1).orgName("部门1").orgNo("a1").orgType("1").build();
        OrgQuery OrgQuery1 = Org2OrgQueryConverter.INSTANCE.toTarget(Org);
        System.out.println("OrgQuery1:\n" + OrgQuery1.toString());
        System.out.println();
    }

    private void test2(){
        // OrgQuery 对象转 Org
        OrgQuery OrgQuery = cn.hoscen.demo.org.bean.OrgQuery.builder().code("a1").orgName("部门1").type("1").build();
        Org Org1 = Org2OrgQueryConverter.INSTANCE.toSource(OrgQuery);
        System.out.println("Org1:\n" + Org1.toString());
        System.out.println();
    }

    private void test3(){
        // Org list 转 OrgQuery list
        List<Org> list = new ArrayList<>();
        Org Org = cn.hoscen.demo.org.bean.Org.builder().orgId(1).orgName("部门1").orgNo("a1").orgType("1").build();
        Org Org2 = cn.hoscen.demo.org.bean.Org.builder().orgId(1).orgName("部门2").orgNo("a2").orgType("2").build();
        list.add(Org);
        list.add(Org2);

        List<OrgQuery> OrgQueries = Org2OrgQueryConverter.INSTANCE.toTargets(list);
        System.out.println("OrgQueries:\n" + OrgQueries.toString());
        System.out.println();
    }

    private void test4(){
        // OrgQuery list 转 Org list
        List<OrgQuery> list = new ArrayList<>();

        OrgQuery OrgQuery = cn.hoscen.demo.org.bean.OrgQuery.builder().code("a1").orgName("部门1").type("1").build();
        OrgQuery OrgQuery2 = cn.hoscen.demo.org.bean.OrgQuery.builder().code("a2").orgName("部门2").type("2").build();
        list.add(OrgQuery);
        list.add(OrgQuery2);

        List<Org> Orgs = Org2OrgQueryConverter.INSTANCE.toSources(list);
        System.out.println("Orgs:\n" + Orgs.toString());
        System.out.println();
    }
}
