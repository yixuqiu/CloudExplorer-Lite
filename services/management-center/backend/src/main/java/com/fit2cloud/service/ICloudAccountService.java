package com.fit2cloud.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fit2cloud.common.platform.credential.Credential;
import com.fit2cloud.controller.request.cloud_account.AddCloudAccountRequest;
import com.fit2cloud.controller.request.cloud_account.CloudAccountRequest;
import com.fit2cloud.controller.request.cloud_account.UpdateCloudAccountRequest;
import com.fit2cloud.controller.request.cloud_account.UpdateJobsRequest;
import com.fit2cloud.controller.response.cloud_account.CloudAccountJobDetailsResponse;
import com.fit2cloud.controller.response.cloud_account.PlatformResponse;
import com.fit2cloud.dao.entity.CloudAccount;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author fit2cloud
 */
public interface ICloudAccountService extends IService<CloudAccount> {

    /**
     * 分特查询云账号
     *
     * @param cloudAccountRequest 云账号请求对象
     * @return 分页对象
     */
    IPage<CloudAccount> page(CloudAccountRequest cloudAccountRequest);

    /**
     * 获取云账号供应商数据
     * @return 所有的云账号供应商数据
     */
    List<PlatformResponse> getPlatforms();

    /**
     * 插入一条数据
     *
     * @param addCloudAccountRequest 保存云账号参数
     * @return 插入对象
     */
    CloudAccount save(AddCloudAccountRequest addCloudAccountRequest);

    /**
     * 根据云账号获取区域信息
     *
     * @param accountId 根据云账号获取区域信息
     * @return 区域信息
     */
    List<Credential.Region> listRegions(String accountId);


    /**
     * 查询到当前云账号任务信息
     * @param accountId 云账号id
     * @return 云账号任务信息
     */
    CloudAccountJobDetailsResponse jobs(String accountId);

    /**
     * 更新云账号
     * @param updateJobsRequest 云账号任务参数
     * @return 更新后云账号定时任务数据
     */
    CloudAccountJobDetailsResponse updateJob(UpdateJobsRequest updateJobsRequest);


    /**
     * 更新云账号信息
     * @param updateCloudAccountRequest 云账号信息相关参数
     * @return    更新后的云账号信息
     */
    CloudAccount update(UpdateCloudAccountRequest updateCloudAccountRequest);

    /**
     * 删除云账号
     * @param accountId 删除云账号
     * @return 删除
     */
    boolean delete(String accountId);

    boolean delete(ArrayList<String> cloudAccountIds);
}