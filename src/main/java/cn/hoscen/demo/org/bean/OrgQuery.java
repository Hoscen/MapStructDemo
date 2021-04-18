package cn.hoscen.demo.org.bean;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 组织查询对象
 * Created by Hoscen on 2021/4/18 20:01 with IntelliJ IDEA.
 */
@Data
@Builder
public class OrgQuery {
    
    private String code;
    
    private String orgName;
    
    private String type;
    
}
