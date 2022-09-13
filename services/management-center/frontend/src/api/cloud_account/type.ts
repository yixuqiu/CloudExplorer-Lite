interface ListOrganizationRequest {
  /**
   *每页显示多少
   */
  pageSize: number;
  /**
   *当前页
   */
  currentPage: number;
}
interface CloudAccount {
  /**
   * 主键id
   */
  id: string;
  /**
   * 云账号名称
   */
  name: string;
  /**
   * 云平台
   */
  platform: string;
  /**
   * 云账号状态 true有效 false无效
   */
  state: boolean;
  /**
   * 凭证信息
   */
  credential: string;
  /**
   * 状态(0:同步成功,1:同步失败,2:同步中)
   */
  status: number;
  /**
   *创建时间
   */
  createTime: string;
  /**
   *修改时间
   */
  updateTime: string;
}
interface Form {
  /**
   * 输入类型
   */
  inputType: string;
  /**
   * 字段名称
   */
  field: string;
  /**
   * 提示
   */
  label: string;
  /**
   * 是否必填
   */
  required: boolean;
  /**
   * 默认值
   */
  defaultValue: unknown;
  /**
   * 描述
   */
  description: string;
}
interface Platform {
  /**
   * 提示
   */
  label: string;
  /**
   * 字段
   */
  field: string;

  credentialFrom: Array<Form>;
}

interface CreateAccount {
  /**
   *名称
   */
  name: string;
  /**
   * 云平台
   */
  platform: string;
  /**
   * 认证属性
   */
  credential: { [propName: string]: string };
}

/**
 * 更新云账号所需要的参数
 */
interface UpdateAccount extends CreateAccount {
  /**
   * 云账号id
   */
  id: string;
}
interface Region {
  /**
   * 区域名称
   */
  name: string;
  /**
   * 区域id
   */
  regionId: string;
}

interface CloudAccountJobDetailsResponse {
  /**
   * 模块任务
   */
  cloudAccountSyncJobs: Array<ModuleJob>;
  /**
   *选中的区域
   */
  selectRegion: Array<Region>;
}
/**
 * 模块定时任务信息
 */
interface ModuleJob {
  /**
   * 模块名称
   */
  name: string;
  /**
   * 模块台湾
   */
  nameZhTw: string;
  /**
   * 中文
   */
  nameEn: string;
  /**
   * 基本path
   */
  basePath: string;
  /**
   * 图标
   */
  icon: string;
  /**
   * 排序
   */
  order: number;
  /**
   * 定时任务信息
   */
  jobDetailsList: Array<JobDetails>;
}
/**
 * 定时任务详情
 */
interface JobDetails {
  /**
   * 定时任务名称
   */
  jobName: string;
  /**
   * 定时任务分组
   */
  jobGroup: string;
  /**
   * 执行间隔时间
   */
  timeInterval: string;
  /**
   * 执行间隔单位
   */
  unit: string;
  /**
   * 描述
   */
  description: string;
  /**
   * 是否活跃
   */
  active: string;
}
interface UpdateJobsRequest extends CloudAccountJobDetailsResponse {
  cloudAccountId: string;
}

export type {
  ListOrganizationRequest,
  CloudAccount,
  Platform,
  Form,
  CreateAccount,
  Region,
  CloudAccountJobDetailsResponse,
  ModuleJob,
  UpdateJobsRequest,
  UpdateAccount,
};