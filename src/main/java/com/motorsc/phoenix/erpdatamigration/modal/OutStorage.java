package com.motorsc.phoenix.erpdatamigration.modal;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author likaiqiang
 * @version V1.0
 * @Title OutStorage
 * @date 2018/9/19
 */
@Data
public class OutStorage implements Serializable {

    /**
     * 主键
     */
    private String id;

    /**
     * 出库单号
     */
    private String outId;
    /**
     * 出库时间
     */
    private Date outTime;
    /**
     * 0 预出库 3待出库 4已出库 5已配送 9已取消
     */
    private Integer status;
    /**
     * 是否已确认供应商接收数量：0未确认、1已确认
     */
    private Integer returnConfirm;
    /**
     * 主单号
     */
    private String mainBillId;
    /**
     * 待出库数
     */
    private Integer pendingOutNum;
    /**
     * 商城订单号
     */
    private String orderId;
    /**
     * 商城退单号
     */
    private String returnId;
    /**
     * 车型信息
     */
    private String carModel;
    /**
     * 1销售、2售后退货、3售前退货、5供应商退回商品出口、6转库存商品出库
     */
    private Integer outType;
    /**
     * 分拣中心id
     */
    private String sortCenterId;
    /**
     * 分拣中心name
     */
    private String sortCenterName;
    /**
     * 修理厂id
     */
    private String repairdepotId;
    /**
     * 修理厂名称
     */
    private String repairdepotName;
    /**
     * 修理厂地址
     */
    private String repairdepotAddr;
    /**
     * 修理厂电话
     */
    private String repairdepotPhone;
    /**
     * 修理厂联系人
     */
    private String repairdepotContacts;
    /**
     * 是否二次打包：0否 1是
     */
    private Integer SecondaryPackaging;
    /**
     * 出库图片url
     */
    private String outImgUrl;
    /**
     * 出库操作人id
     */
    private String outOperatorId;
    /**
     * 出库操作人姓名
     */
    private String outOperatorName;
    /**
     * 部分出库申请人id
     */
    private String applicantId;
    /**
     * 部分出库申请人name
     */
    private String applicantName;
    /**
     * 部分出库申请时间
     */
    private Date applicationTime;
    /**
     * 部分申请审批状态：0 未申请 1已申请 2审批同意 3审批不同意
     */
    private Integer applicationStatus;
    /**
     * 部分出库申请审批结果原因
     */
    private String approveReason;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新人
     */
    private String updator;
    /**
     * 0不删除 1删除
     */
    private Integer yn;
}
