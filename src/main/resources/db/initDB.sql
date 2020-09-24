/*
Navicat MySQL Data Transfer

Source Server         : localhost3306
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : ittechnicalforum

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2020-09-13 22:11:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_blogarticleinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_blogarticleinfo`;
CREATE TABLE `tb_blogarticleinfo` (
  `id` varchar(12) NOT NULL,
  `title` varchar(80) NOT NULL,
  `content` text NOT NULL,
  `category` varchar(20) NOT NULL,
  `time` date NOT NULL,
  `userid` varchar(12) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_blogarticleinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_bloginfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_bloginfo`;
CREATE TABLE `tb_bloginfo` (
  `id` varchar(12) NOT NULL,
  `category` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_bloginfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_browseinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_browseinfo`;
CREATE TABLE `tb_browseinfo` (
  `id` varchar(12) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `time` date NOT NULL,
  `objectid` varchar(12) NOT NULL,
  `catetory` int(11) NOT NULL,
  `islike` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_browseinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_collectioninfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_collectioninfo`;
CREATE TABLE `tb_collectioninfo` (
  `id` varchar(12) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `objectid` varchar(12) NOT NULL,
  `category` int(1) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_collectioninfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_comment`
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment` (
  `id` varchar(12) NOT NULL,
  `content` varchar(300) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `time` date NOT NULL,
  `objectid` varchar(12) NOT NULL,
  `category` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_doexercise`
-- ----------------------------
DROP TABLE IF EXISTS `tb_doexercise`;
CREATE TABLE `tb_doexercise` (
  `id` varchar(12) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `subjectid` varchar(12) NOT NULL,
  `reply` varchar(50) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_doexercise
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_downloadinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_downloadinfo`;
CREATE TABLE `tb_downloadinfo` (
  `id` varchar(12) NOT NULL,
  `rescourseid` varchar(12) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_downloadinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_followinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_followinfo`;
CREATE TABLE `tb_followinfo` (
  `id` varchar(12) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `objectid` varchar(12) NOT NULL,
  `category` int(1) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_followinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_postinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_postinfo`;
CREATE TABLE `tb_postinfo` (
  `id` varchar(12) NOT NULL,
  `title` varchar(80) NOT NULL,
  `content` text NOT NULL,
  `category` varchar(20) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `time` date NOT NULL,
  `replyid` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_postinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_resouceinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_resouceinfo`;
CREATE TABLE `tb_resouceinfo` (
  `id` varchar(12) NOT NULL,
  `title` varchar(80) NOT NULL,
  `path` varchar(50) NOT NULL,
  `isvip` int(1) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_resouceinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_subjectinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_subjectinfo`;
CREATE TABLE `tb_subjectinfo` (
  `id` varchar(12) NOT NULL,
  `content` varchar(100) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `category` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_subjectinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_topicinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_topicinfo`;
CREATE TABLE `tb_topicinfo` (
  `id` varchar(12) NOT NULL,
  `category` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_topicinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_userinfo`;
CREATE TABLE `tb_userinfo` (
  `account` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `nickname` varchar(20) NOT NULL,
  `avatarurl` varchar(50) NOT NULL,
  `gender` int(1) NOT NULL,
  `power` int(1) NOT NULL,
  `activation` int(1) NOT NULL COMMENT '用户表',
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_userinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_vipinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_vipinfo`;
CREATE TABLE `tb_vipinfo` (
  `id` varchar(12) NOT NULL,
  `userid` varchar(12) NOT NULL,
  `starttime` date NOT NULL,
  `endtime` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_vipinfo
-- ----------------------------
