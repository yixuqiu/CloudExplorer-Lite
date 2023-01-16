package com.fit2cloud.provider.impl.huawei.entity.request;

import com.fit2cloud.provider.impl.huawei.entity.credential.HuaweiSecurityComplianceCredential;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupsRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * {@code @Author:张少虎}
 * {@code @Date: 2023/1/10  10:58}
 * {@code @Version 1.0}
 * {@code @注释: }
 */
@Getter
@Setter
public class ListSecurityGroupInstanceRequest extends ListSecurityGroupsRequest {
    /**
     * 认证对象
     */
    private HuaweiSecurityComplianceCredential credential;

    /**
     * 区域id
     */
    private String regionId;
}
