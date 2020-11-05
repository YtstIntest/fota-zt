package com.intest.code;

public class CarCode {
    /**
     * 升级中
     */
    public static final String CODE_0000 = "0000";//等待任务开始
    public static final String CODE_0007 = "0007";//触发查询是否有任务的，查询成功
    public static final String CODE_1000 = "1000";//车辆请求F0接口，车辆已满足升级条件
    public static final String CODE_1002 = "1002";//车辆软件版本已匹配升级任务
    public static final String CODE_1004 = "1004";//终端上报零部件信息
    public static final String CODE_1012 = "1012";//检查零部件升级包存在
    public static final String CODE_1017 = "1017";//车机确认下载升级包
    public static final String CODE_1020 = "1020";//正在下载升级文件
    public static final String CODE_1021 = "1021";//升级文件下载完成
    public static final String CODE_1023 = "1023";//升级文件校验通过
    public static final String CODE_1030 = "1030";//TBox请求车主升级确认
    public static final String CODE_1032 = "1032";//TBox选择车机配置，确认升级
    public static final String CODE_1033 = "1033";//TBox选择车机配置，稍后提醒
    public static final String CODE_1034 = "1034";//TBox选择车机配置，延迟升级
    public static final String CODE_1036 = "1036";//平台设置的时间到达，开始升级
    public static final String CODE_1037 = "1037";//静默流程无需授权，开始升级
    public static final String CODE_1041 = "1041";//整车正在升级
    public static final String CODE_1042 = "1042";//整车正在回滚
    public static final String CODE_1064 = "1064";//暂停下载
    public static final String CODE_1071 = "1071";//平台管理员打开该车辆任务

    /**
     * 取消升级
     */
    public static final String CODE_1018 = "1018";//车机取消下载升级包
    public static final String CODE_1063 = "1063";//用户取消下载
    public static final String CODE_1070 = "1070";//升级结束，平台管理员关闭该车辆任务

    /**
     * 已完成
     */
    public static final String CODE_1053 = "1053";//升级结束，整车升级成功


    /**
     * 升级失败
     */
    public static final String CODE_0008 = "0008";//触发查询是否有任务的，查询失败
    public static final String CODE_1001 = "1001";//车辆请求F0接口，车辆不满足升级条件
    public static final String CODE_1003 = "1003";//车辆软件版本不匹配升级任务
    public static final String CODE_1013 = "1013";//检查零部件升级包不存在
    public static final String CODE_1022 = "1022";//升级文件下载失败
    public static final String CODE_1024 = "1024";//升级文件校验不通过
    public static final String CODE_1025 = "1025";//备份包下载失败
    public static final String CODE_1027 = "1027";//升级包校验失败
    public static final String CODE_1028 = "1028";//备份包校验失败
    public static final String CODE_1040 = "1040";//车辆不满足升级条件
    public static final String CODE_1047 = "1047";//空间不足，停止下载
    public static final String CODE_1048 = "1048";//SD卡加载失败
    public static final String CODE_1049 = "1049";//请求资源不存在，找不到升级包
    public static final String CODE_1050 = "1050";//升级结束，整车升级失败
    public static final String CODE_1051 = "1051";//升级结束，整车升级失败，回滚失败，网关认证成功
    public static final String CODE_1052 = "1052";//升级结束，整车升级失败，回滚成功
    public static final String CODE_1054 = "1054";//空间不足，停止下载，升级结束
    public static final String CODE_1060 = "1060";//升级结束，TBox上报日志中
    public static final String CODE_1061 = "1061";//升级结束，TBox上报日志失败
    public static final String CODE_1062 = "1062";//升级结束，TBox上报日志成功
    public static final String CODE_1065 = "1065";//终端休眠，停止下载
    public static final String CODE_1072 = "1072";//升级结束，平台结束任务，Tbox结束升级，上报升级失败
    public static final String CODE_1073 = "1073";//升级结束，回滚成功，版本号不匹配
    public static final String CODE_1074 = "1074";//升级结束，任务升级时间已结束，升级任务结束
    public static final String CODE_1075 = "1075";//升级结束，车机 HMI 断连
    public static final String CODE_1076 = "1076";//升级结束，车机 ICC断连
    public static final String CODE_1077 = "1077";//升级结束，设置ECU升级模式失败
    public static final String CODE_1078 = "1078";//升级结束，查不到升级任务
    public static final String CODE_1080 = "1080";//升级结束，发送车机下载确认消息失败
    public static final String CODE_1081 = "1081";//升级结束，发送车机有升级任务消息失败
    public static final String CODE_1082 = "1082";//升级结束，发送车机升级确认消息失败
    public static final String CODE_1083 = "1083";//升级结束，不上传日志文件
    public static final String CODE_1084 = "1084";//升级结束，上传日志文件失败
    public static final String CODE_1085 = "1085";//升级结束，查询版本失败且没有备份包
    public static final String CODE_1086 = "1086";//升级结束，预查询升级状态错误
    public static final String CODE_1087 = "1087";//升级结束，查询升级状态错误
    public static final String CODE_1088 = "1088";//升级结束，车机确认升级状态错误
    public static final String CODE_1089 = "1089";//升级结束，查询升级文件状态错误
    public static final String CODE_1090 = "1090";//升级结束，下载状态错误
    public static final String CODE_1091 = "1091";//升级结束，日志文件上传状态错误
    public static final String CODE_1092 = "1092";//升级结束，升级前 目标版本与备份版本不匹配
    public static final String CODE_1093 = "1093";//升级结束，回滚引导高低压失败
    public static final String CODE_1094 = "1094";//升级结束，加载刷写信息失败
    public static final String CODE_1095 = "1095";//升级结束，刷写条件配置未知错误
    public static final String CODE_1096 = "1096";//升级结束，引导上高压失败
    public static final String CODE_1097 = "1097";//升级结束，引导下高压失败
    public static final String CODE_1098 = "1098";//升级结束，引导上低压失败
    public static final String CODE_1099 = "1099";//升级结束，引导下低压失败
    public static final String CODE_1100 = "1100";//升级结束，引导KL15电上电失败
    public static final String CODE_1101 = "1101";//升级结束，引导KL15电下电失败
    public static final String CODE_1102 = "1102";//升级结束，引导禁止部分网段UDS报文传输失败
    public static final String CODE_1103 = "1103";//升级结束，引导恢复部分网段UDS报文传输失败
    public static final String CODE_1104 = "1104";//升级结束，升级成功，引导恢复条件失败
    public static final String CODE_1105 = "1105";//升级结束，回滚成功，引导恢复条件失败
    public static final String CODE_1106 = "1106";//升级结束，回滚失败 引导恢复条件失败
    public static final String CODE_1107 = "1107";//升级结束，下载时出现网络错误
    public static final String CODE_1108 = "1108";//升级失败，回滚失败，网关认证失败
    public static final String CODE_1109 = "1109";//回滚失败，引导恢复条件失败，网关认证失败
    public static final String CODE_1110 = "1110";//升级失败，回滚失败，网关认证失败
    public static final String CODE_1111 = "1111";//升级失败，回滚失败
    public static final String CODE_1112 = "1112";//回滚失败，引导恢复条件失败
    public static final String CODE_1113 = "1113";//升级失败，升级包校验失败

}
