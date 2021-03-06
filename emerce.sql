/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : emerce

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-02-15 16:09:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `e_account`
-- ----------------------------
DROP TABLE IF EXISTS `e_account`;
CREATE TABLE `e_account` (
  `id` varchar(40) NOT NULL COMMENT '主键uuid',
  `login_name` varchar(20) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `account_name` varchar(30) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `account_status` tinyint(4) DEFAULT NULL,
  `login_ip` varchar(20) DEFAULT NULL,
  `login_date` bigint(20) DEFAULT NULL,
  `login_flag` tinyint(4) DEFAULT NULL,
  `create_date` bigint(20) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `update_date` bigint(20) DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `remarks` varchar(50) DEFAULT NULL,
  `del_flag` tinyint(4) DEFAULT NULL,
  `photo` varchar(60) DEFAULT NULL,
  `sign` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_account
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(64) NOT NULL COMMENT '编号',
  `company_id` varchar(64) DEFAULT NULL COMMENT '归属公司',
  `office_id` varchar(64) DEFAULT NULL COMMENT '归属部门',
  `login_name` varchar(100) DEFAULT NULL COMMENT '登录名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `no` varchar(100) DEFAULT NULL COMMENT '工号',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `email` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(200) DEFAULT NULL COMMENT '电话',
  `mobile` varchar(200) DEFAULT NULL COMMENT '手机',
  `user_type` char(1) DEFAULT NULL COMMENT '用户类型',
  `photo` varchar(1000) DEFAULT NULL COMMENT '用户头像',
  `login_ip` varchar(100) DEFAULT NULL COMMENT '最后登陆IP',
  `login_date` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `login_flag` varchar(64) DEFAULT NULL COMMENT '是否可登录',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记',
  `qrcode` varchar(1000) DEFAULT NULL COMMENT '二维码',
  `sign` varchar(450) DEFAULT NULL COMMENT '个性签名',
  PRIMARY KEY (`id`),
  KEY `sys_user_office_id` (`office_id`),
  KEY `sys_user_login_name` (`login_name`),
  KEY `sys_user_company_id` (`company_id`),
  KEY `sys_user_update_date` (`update_date`),
  KEY `sys_user_del_flag` (`del_flag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('0fb8ebbff20a46029596806aa077d3c2', '1', '5', 'fbb', 'b079bd73139e94813a98e05bf48c42b86d0dcddd20ff9f10175255e4', '003', '范冰冰', '', '', '', '1', '/jeeplus/userfiles/0fb8ebbff20a46029596806aa077d3c2/images/u=1783243281,2583995645&fm=58.jpg', '0:0:0:0:0:0:0:1', '2016-08-14 18:11:18', '1', '1', '2016-02-24 23:25:41', '1', '2016-08-07 19:34:04', '', '0', '/jeeplus/userfiles/0fb8ebbff20a46029596806aa077d3c2/qrcode/0fb8ebbff20a46029596806aa077d3c2.png', null);
INSERT INTO `sys_user` VALUES ('1', '1', '5', 'admin', 'd6a33a2456338a88acec133487d38ccf163abb4575b368b074e327ee', '13815874603', 'admin', '', '', 'rr', '', '/jeeplus/userfiles/1/images/7e3e6709c93d70cf14e01629ffdcd100baa12bff.jpg', '0:0:0:0:0:0:0:1', '2017-08-19 16:24:57', '1', '1', '2013-05-27 08:00:00', '1', '2016-08-10 21:40:18', 'test', '0', '/jeeplus/userfiles/1/qrcode/test.png', '你好啊');
INSERT INTO `sys_user` VALUES ('1e8149b33e774daa9a250f5a1a0ad23f', '1', '4', 'dzq', '8bb66a13cffc3a080c7946ef9949bfd3f6efd7729e2fb29cbcb5b877', '006', '邓紫棋', '', '', '', '', '/jeeplus/userfiles/1e8149b33e774daa9a250f5a1a0ad23f/images/xin_03305061618075782724119.jpg', '0:0:0:0:0:0:0:1', '2016-07-24 20:17:34', '1', '1', '2016-02-24 23:27:47', '1e8149b33e774daa9a250f5a1a0ad23f', '2016-07-24 20:18:10', '', '0', '/jeeplus/userfiles/1e8149b33e774daa9a250f5a1a0ad23f/qrcode/1e8149b33e774daa9a250f5a1a0ad23f.png', null);
INSERT INTO `sys_user` VALUES ('7374fe91d19a4b739ae649334c0cc273', '1', '5', 'lxr', '0ee5847623bd094a8ce84151a1b0204f28e4f0c53374604fbc723912', '004', '林心如', '', '', '', '', '/jeeplus/userfiles/7374fe91d19a4b739ae649334c0cc273/images/xin_03305061618075782724119.jpg', '0:0:0:0:0:0:0:1', '2017-08-19 16:24:45', '1', '1', '2016-02-24 23:26:20', '1', '2017-08-19 16:24:22', '', '0', '/userfiles/7374fe91d19a4b739ae649334c0cc273/qrcode/7374fe91d19a4b739ae649334c0cc273.png', null);
INSERT INTO `sys_user` VALUES ('f7cc1c7e6f494818adffe1de5f2282fb', '1', '4', 'zw', '2bc28ed674f9fd7480fcdb97337ea831b97aa2b9e134b1b4ffc2e266', '002', '赵薇', '', '', '', '', '/jeeplus/userfiles/f7cc1c7e6f494818adffe1de5f2282fb/images/7e3e6709c93d70cf14e01629ffdcd100baa12bff.jpg', '0:0:0:0:0:0:0:1', '2016-08-14 18:10:01', '1', '1', '2016-02-24 23:24:58', 'f7cc1c7e6f494818adffe1de5f2282fb', '2016-08-10 23:21:47', '', '0', '/jeeplus/userfiles/f7cc1c7e6f494818adffe1de5f2282fb/qrcode/f7cc1c7e6f494818adffe1de5f2282fb.png', '我是赵薇555');
