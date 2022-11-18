import aliyun from "@commons/assets/img/cloud-vendor-icon/aliyun.ico";
import huawei from "@commons/assets/img/cloud-vendor-icon/fusion.ico";
import aws from "@commons/assets/img/cloud-vendor-icon/aws.ico";
import vmware from "@commons/assets/img/cloud-vendor-icon/vmware.ico";
import qcloud from "@commons/assets/img/cloud-vendor-icon/qcloud.ico";
import openstack from "@commons/assets/img/cloud-vendor-icon/openstack.ico";
import type { SimpleMap } from "@commons/api/base/type";

interface PlatFormIcon {
  icon: any;
  name: string;
}

export const platformIcon: SimpleMap<PlatFormIcon> = {
  fit2cloud_ali_platform: { icon: aliyun, name: "阿里云" },
  fit2cloud_huawei_platform: { icon: huawei, name: "华为云" },
  fit2cloud_aws_platform: { icon: aws, name: "AWS" },
  fit2cloud_vsphere_platform: { icon: vmware, name: "vmware" },
  fit2cloud_tencent_platform: { icon: qcloud, name: "腾讯云" },
  fit2cloud_openstack_platform: { icon: openstack, name: "OpenStack" },
};
