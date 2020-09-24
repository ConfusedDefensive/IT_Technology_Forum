/*
 Navicat Premium Data Transfer

 Source Server         : localhost3306
 Source Server Type    : MySQL
 Source Server Version : 50549
 Source Host           : localhost:3306
 Source Schema         : ittechnicalforum

 Target Server Type    : MySQL
 Target Server Version : 50549
 File Encoding         : 65001

 Date: 24/09/2020 09:18:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_blogarticleinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_blogarticleinfo`;
CREATE TABLE `tb_blogarticleinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` date NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_bloginfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_bloginfo`;
CREATE TABLE `tb_bloginfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_browseinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_browseinfo`;
CREATE TABLE `tb_browseinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` date NOT NULL,
  `objectid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `catetory` int(11) NOT NULL,
  `islike` int(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_collectioninfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_collectioninfo`;
CREATE TABLE `tb_collectioninfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `objectid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` int(1) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` date NOT NULL,
  `objectid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` int(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_doexercise
-- ----------------------------
DROP TABLE IF EXISTS `tb_doexercise`;
CREATE TABLE `tb_doexercise`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `subjectid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reply` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_downloadinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_downloadinfo`;
CREATE TABLE `tb_downloadinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rescourseid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_followinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_followinfo`;
CREATE TABLE `tb_followinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `objectid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` int(3) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_followinfo
-- ----------------------------
INSERT INTO `tb_followinfo` VALUES ('1', '1', '1', 3, '2020-09-21');
INSERT INTO `tb_followinfo` VALUES ('2', '1', '2', 3, '2020-09-21');
INSERT INTO `tb_followinfo` VALUES ('3', '1', '3', 3, '2020-09-21');

-- ----------------------------
-- Table structure for tb_postinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_postinfo`;
CREATE TABLE `tb_postinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帖子id',
  `title` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `topicid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属话题id',
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发布用户id',
  `time` date NOT NULL COMMENT '发布时间',
  `replyid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被回复帖子id',
  `pageviews` int(11) NOT NULL COMMENT '浏览数',
  `likenum` int(11) NOT NULL COMMENT '点赞数',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `userid`(`userid`) USING BTREE,
  INDEX `topicid`(`topicid`) USING BTREE,
  CONSTRAINT `topicid` FOREIGN KEY (`topicid`) REFERENCES `tb_topicinfo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `tb_userinfo` (`account`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_postinfo
-- ----------------------------
INSERT INTO `tb_postinfo` VALUES ('1', '测试帖子1', '测试内容', '1', '1', '2020-09-23', NULL, 0, 0);
INSERT INTO `tb_postinfo` VALUES ('2', '测试帖子2', '测试内容', '2', '1', '2020-09-23', NULL, 0, 0);
INSERT INTO `tb_postinfo` VALUES ('3', '测试帖子3', '测试内容', '2', '1', '2020-09-23', NULL, 0, 0);

-- ----------------------------
-- Table structure for tb_resouceinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_resouceinfo`;
CREATE TABLE `tb_resouceinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `path` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `isvip` int(1) NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_subjectinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_subjectinfo`;
CREATE TABLE `tb_subjectinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `answer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_topicinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_topicinfo`;
CREATE TABLE `tb_topicinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `category`(`category`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_topicinfo
-- ----------------------------
INSERT INTO `tb_topicinfo` VALUES ('1', 'Java');
INSERT INTO `tb_topicinfo` VALUES ('2', 'MySql');
INSERT INTO `tb_topicinfo` VALUES ('3', 'Python');

-- ----------------------------
-- Table structure for tb_userinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_userinfo`;
CREATE TABLE `tb_userinfo`  (
  `account` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nickname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `avatarurl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `power` int(1) NOT NULL,
  `activation` int(1) NOT NULL COMMENT '用户表',
  PRIMARY KEY (`account`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_userinfo
-- ----------------------------
INSERT INTO `tb_userinfo` VALUES ('1', '123456', '荧惑守心', 'saavgvvfds', '男', 1, 1);

-- ----------------------------
-- Table structure for tb_vipinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_vipinfo`;
CREATE TABLE `tb_vipinfo`  (
  `id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `starttime` date NOT NULL,
  `endtime` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
