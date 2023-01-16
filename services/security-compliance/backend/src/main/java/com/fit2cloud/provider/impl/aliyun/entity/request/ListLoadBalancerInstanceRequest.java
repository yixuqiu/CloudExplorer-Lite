package com.fit2cloud.provider.impl.aliyun.entity.request;

import com.aliyun.slb20140515.models.DescribeLoadBalancersRequest;
import com.fit2cloud.provider.impl.aliyun.entity.credential.AliSecurityComplianceCredential;
import lombok.Getter;
import lombok.Setter;

/**
 * {@code @Author:张少虎}
 * {@code @Date: 2023/1/6  10:46}
 * {@code @Version 1.0}
 * {@code @注释: }
 */
@Getter
@Setter
public class ListLoadBalancerInstanceRequest extends DescribeLoadBalancersRequest {
    /**
     * 认证信息
     */
    private AliSecurityComplianceCredential credential;


}
