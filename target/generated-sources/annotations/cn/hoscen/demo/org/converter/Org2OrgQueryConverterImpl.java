package cn.hoscen.demo.org.converter;

import cn.hoscen.demo.org.bean.Org;
import cn.hoscen.demo.org.bean.Org.OrgBuilder;
import cn.hoscen.demo.org.bean.OrgQuery;
import cn.hoscen.demo.org.bean.OrgQuery.OrgQueryBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-18T20:16:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_282 (AdoptOpenJDK)"
)
public class Org2OrgQueryConverterImpl implements Org2OrgQueryConverter {

    @Override
    public Org toSource(OrgQuery target) {
        if ( target == null ) {
            return null;
        }

        OrgBuilder org = Org.builder();

        org.orgType( target.getType() );
        org.orgNo( target.getCode() );
        org.orgName( target.getOrgName() );

        return org.build();
    }

    @Override
    public List<OrgQuery> toTargets(List<Org> sources) {
        if ( sources == null ) {
            return null;
        }

        List<OrgQuery> list = new ArrayList<OrgQuery>( sources.size() );
        for ( Org org : sources ) {
            list.add( toTarget( org ) );
        }

        return list;
    }

    @Override
    public List<Org> toSources(List<OrgQuery> targets) {
        if ( targets == null ) {
            return null;
        }

        List<Org> list = new ArrayList<Org>( targets.size() );
        for ( OrgQuery orgQuery : targets ) {
            list.add( toSource( orgQuery ) );
        }

        return list;
    }

    @Override
    public OrgQuery toTarget(Org org) {
        if ( org == null ) {
            return null;
        }

        OrgQueryBuilder orgQuery = OrgQuery.builder();

        orgQuery.type( org.getOrgType() );
        orgQuery.code( org.getOrgNo() );
        orgQuery.orgName( org.getOrgName() );

        return orgQuery.build();
    }
}
