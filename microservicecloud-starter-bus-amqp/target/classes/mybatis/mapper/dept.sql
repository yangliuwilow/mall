/*
Navicat MySQL Data Transfer

Source Server         : 192.168.0.38
Source Server Version : 50550
Source Host           : 192.168.0.38:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2018-05-23 17:44:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `db_source` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dept
-- ----------------------------
