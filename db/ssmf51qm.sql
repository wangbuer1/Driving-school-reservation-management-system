-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmf51qm
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmf51qm/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmf51qm/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmf51qm/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjiaxiaojiaolian`
--

DROP TABLE IF EXISTS `discussjiaxiaojiaolian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjiaxiaojiaolian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609312010887 DEFAULT CHARSET=utf8 COMMENT='驾校教练评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjiaxiaojiaolian`
--

LOCK TABLES `discussjiaxiaojiaolian` WRITE;
/*!40000 ALTER TABLE `discussjiaxiaojiaolian` DISABLE KEYS */;
INSERT INTO `discussjiaxiaojiaolian` VALUES (71,'2020-12-30 06:46:57',1,1,'评论内容1','回复内容1'),(72,'2020-12-30 06:46:57',2,2,'评论内容2','回复内容2'),(73,'2020-12-30 06:46:57',3,3,'评论内容3','回复内容3'),(74,'2020-12-30 06:46:57',4,4,'评论内容4','回复内容4'),(75,'2020-12-30 06:46:57',5,5,'评论内容5','回复内容5'),(76,'2020-12-30 06:46:57',6,6,'评论内容6','回复内容6'),(1609312010886,'2020-12-30 07:06:50',21,1609311957937,'非常不错','感谢支持');
/*!40000 ALTER TABLE `discussjiaxiaojiaolian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaxiaocheliang`
--

DROP TABLE IF EXISTS `jiaxiaocheliang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaxiaocheliang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cheliangbianhao` varchar(200) DEFAULT NULL COMMENT '车辆编号',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `chepaihao` varchar(200) DEFAULT NULL COMMENT '车牌号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `cheliangbianhao` (`cheliangbianhao`),
  UNIQUE KEY `chepaihao` (`chepaihao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609311867451 DEFAULT CHARSET=utf8 COMMENT='驾校车辆';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaxiaocheliang`
--

LOCK TABLES `jiaxiaocheliang` WRITE;
/*!40000 ALTER TABLE `jiaxiaocheliang` DISABLE KEYS */;
INSERT INTO `jiaxiaocheliang` VALUES (31,'2020-12-30 06:46:57','车辆编号1','http://localhost:8080/ssmf51qm/upload/jiaxiaocheliang_tupian1.jpg','车牌号1'),(32,'2020-12-30 06:46:57','车辆编号2','http://localhost:8080/ssmf51qm/upload/jiaxiaocheliang_tupian2.jpg','车牌号2'),(33,'2020-12-30 06:46:57','车辆编号3','http://localhost:8080/ssmf51qm/upload/jiaxiaocheliang_tupian3.jpg','车牌号3'),(34,'2020-12-30 06:46:57','车辆编号4','http://localhost:8080/ssmf51qm/upload/jiaxiaocheliang_tupian4.jpg','车牌号4'),(35,'2020-12-30 06:46:57','车辆编号5','http://localhost:8080/ssmf51qm/upload/jiaxiaocheliang_tupian5.jpg','车牌号5'),(36,'2020-12-30 06:46:57','车辆编号6','http://localhost:8080/ssmf51qm/upload/jiaxiaocheliang_tupian6.jpg','车牌号6'),(1609311867450,'2020-12-30 07:04:26','1609311839262','http://localhost:8080/ssmf51qm/upload/1609311862854.jpg','M66666');
/*!40000 ALTER TABLE `jiaxiaocheliang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaxiaogonggao`
--

DROP TABLE IF EXISTS `jiaxiaogonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaxiaogonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonggaobiaoti` varchar(200) DEFAULT NULL COMMENT '公告标题',
  `gonggaoleixing` varchar(200) DEFAULT NULL COMMENT '公告类型',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `faburen` varchar(200) DEFAULT NULL COMMENT '发布人',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='驾校公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaxiaogonggao`
--

LOCK TABLES `jiaxiaogonggao` WRITE;
/*!40000 ALTER TABLE `jiaxiaogonggao` DISABLE KEYS */;
INSERT INTO `jiaxiaogonggao` VALUES (61,'2020-12-30 06:46:57','公告信息','普通公告','<p>可以发布一些相关公告信息</p>','2020-11-29','李明','http://localhost:8080/ssmf51qm/upload/jiaxiaogonggao_fengmian1.jpg'),(62,'2020-12-30 06:46:57','公告标题2','公告类型2','公告内容2','2020-12-30','发布人2','http://localhost:8080/ssmf51qm/upload/jiaxiaogonggao_fengmian2.jpg'),(63,'2020-12-30 06:46:57','公告标题3','公告类型3','公告内容3','2020-12-30','发布人3','http://localhost:8080/ssmf51qm/upload/jiaxiaogonggao_fengmian3.jpg'),(64,'2020-12-30 06:46:57','公告标题4','公告类型4','公告内容4','2020-12-30','发布人4','http://localhost:8080/ssmf51qm/upload/jiaxiaogonggao_fengmian4.jpg'),(65,'2020-12-30 06:46:57','公告标题5','公告类型5','公告内容5','2020-12-30','发布人5','http://localhost:8080/ssmf51qm/upload/jiaxiaogonggao_fengmian5.jpg'),(66,'2020-12-30 06:46:57','公告标题6','公告类型6','公告内容6','2020-12-30','发布人6','http://localhost:8080/ssmf51qm/upload/jiaxiaogonggao_fengmian6.jpg');
/*!40000 ALTER TABLE `jiaxiaogonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaxiaojiaolian`
--

DROP TABLE IF EXISTS `jiaxiaojiaolian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaxiaojiaolian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaolianzhanghao` varchar(200) NOT NULL COMMENT '教练账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jiaolianxingming` varchar(200) DEFAULT NULL COMMENT '教练姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `gerenjieshao` longtext COMMENT '个人介绍',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jiaolianzhanghao` (`jiaolianzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='驾校教练';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaxiaojiaolian`
--

LOCK TABLES `jiaxiaojiaolian` WRITE;
/*!40000 ALTER TABLE `jiaxiaojiaolian` DISABLE KEYS */;
INSERT INTO `jiaxiaojiaolian` VALUES (21,'2020-12-30 06:46:57','001','001','王教练',35,'男','http://localhost:8080/ssmf51qm/upload/jiaxiaojiaolian_touxiang1.jpg','13823888881','<p>这里可以写一些教练的信息，内容是用于测试的可以自行添加修改删除</p>'),(22,'2020-12-30 06:46:57','驾校教练2','123456','教练姓名2',2,'男','http://localhost:8080/ssmf51qm/upload/jiaxiaojiaolian_touxiang2.jpg','13823888882','个人介绍2'),(23,'2020-12-30 06:46:57','驾校教练3','123456','教练姓名3',3,'男','http://localhost:8080/ssmf51qm/upload/jiaxiaojiaolian_touxiang3.jpg','13823888883','个人介绍3'),(24,'2020-12-30 06:46:57','驾校教练4','123456','教练姓名4',4,'男','http://localhost:8080/ssmf51qm/upload/jiaxiaojiaolian_touxiang4.jpg','13823888884','个人介绍4'),(25,'2020-12-30 06:46:57','驾校教练5','123456','教练姓名5',5,'男','http://localhost:8080/ssmf51qm/upload/jiaxiaojiaolian_touxiang5.jpg','13823888885','个人介绍5'),(26,'2020-12-30 06:46:57','驾校教练6','123456','教练姓名6',6,'男','http://localhost:8080/ssmf51qm/upload/jiaxiaojiaolian_touxiang6.jpg','13823888886','个人介绍6');
/*!40000 ALTER TABLE `jiaxiaojiaolian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quxiaoyuyue`
--

DROP TABLE IF EXISTS `quxiaoyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quxiaoyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `jiaolianzhanghao` varchar(200) DEFAULT NULL COMMENT '教练账号',
  `jiaolianxingming` varchar(200) DEFAULT NULL COMMENT '教练姓名',
  `xueyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '学员账号',
  `yuyuekemu` varchar(200) DEFAULT NULL COMMENT '预约科目',
  `yuyueshijian` varchar(200) DEFAULT NULL COMMENT '预约时间',
  `quxiaoliyou` longtext NOT NULL COMMENT '取消理由',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609312158857 DEFAULT CHARSET=utf8 COMMENT='取消预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quxiaoyuyue`
--

LOCK TABLES `quxiaoyuyue` WRITE;
/*!40000 ALTER TABLE `quxiaoyuyue` DISABLE KEYS */;
INSERT INTO `quxiaoyuyue` VALUES (51,'2020-12-30 06:46:57','预约编号1','教练账号1','教练姓名1','学员账号1','预约科目1','预约时间1','取消理由1'),(52,'2020-12-30 06:46:57','预约编号2','教练账号2','教练姓名2','学员账号2','预约科目2','预约时间2','取消理由2'),(53,'2020-12-30 06:46:57','预约编号3','教练账号3','教练姓名3','学员账号3','预约科目3','预约时间3','取消理由3'),(54,'2020-12-30 06:46:57','预约编号4','教练账号4','教练姓名4','学员账号4','预约科目4','预约时间4','取消理由4'),(55,'2020-12-30 06:46:57','预约编号5','教练账号5','教练姓名5','学员账号5','预约科目5','预约时间5','取消理由5'),(56,'2020-12-30 06:46:57','预约编号6','教练账号6','教练姓名6','学员账号6','预约科目6','预约时间6','取消理由6'),(1609312158856,'2020-12-30 07:09:18','202012301564635802747','001','王教练','1','科目二','2020-11-29 00:00:00','天气原因');
/*!40000 ALTER TABLE `quxiaoyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','k5slfh3czytfio42kv3brepcvhirn1pn','2020-12-30 06:50:41','2020-12-30 08:09:47'),(2,11,'001','xueyuan','学员','pr2tnnr3zlos5ecbp9gc5orl7kb1o3tv','2020-12-30 06:59:53','2020-12-30 08:09:29'),(3,21,'001','jiaxiaojiaolian','驾校教练','ir2g2l0cv28flymb1isusfjy3kp6eakd','2020-12-30 07:00:01','2020-12-30 08:08:41'),(4,1609311957937,'1','xueyuan','学员','9gduuvygnmfvz1lfcfta45kvrs5c7ja5','2020-12-30 07:06:03','2020-12-30 08:09:36');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2020-12-30 06:46:57');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueyuan`
--

DROP TABLE IF EXISTS `xueyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueyuanzhanghao` varchar(200) NOT NULL COMMENT '学员账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xueyuanxingming` varchar(200) DEFAULT NULL COMMENT '学员姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xueyuanzhanghao` (`xueyuanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609311957938 DEFAULT CHARSET=utf8 COMMENT='学员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueyuan`
--

LOCK TABLES `xueyuan` WRITE;
/*!40000 ALTER TABLE `xueyuan` DISABLE KEYS */;
INSERT INTO `xueyuan` VALUES (11,'2020-12-30 06:46:57','001','001','学员姓名1','男','13823888881','440300199101010001','http://localhost:8080/ssmf51qm/upload/xueyuan_touxiang1.jpg'),(12,'2020-12-30 06:46:57','学员2','123456','学员姓名2','男','13823888882','440300199202020002','http://localhost:8080/ssmf51qm/upload/xueyuan_touxiang2.jpg'),(13,'2020-12-30 06:46:57','学员3','123456','学员姓名3','男','13823888883','440300199303030003','http://localhost:8080/ssmf51qm/upload/xueyuan_touxiang3.jpg'),(14,'2020-12-30 06:46:57','学员4','123456','学员姓名4','男','13823888884','440300199404040004','http://localhost:8080/ssmf51qm/upload/xueyuan_touxiang4.jpg'),(15,'2020-12-30 06:46:57','学员5','123456','学员姓名5','男','13823888885','440300199505050005','http://localhost:8080/ssmf51qm/upload/xueyuan_touxiang5.jpg'),(16,'2020-12-30 06:46:57','学员6','123456','学员姓名6','男','13823888886','440300199606060006','http://localhost:8080/ssmf51qm/upload/xueyuan_touxiang6.jpg'),(1609311957937,'2020-12-30 07:05:57','1','1','刘倩','女','15214121412','441214121412141241','http://localhost:8080/ssmf51qm/upload/1609311989490.png');
/*!40000 ALTER TABLE `xueyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuyue`
--

DROP TABLE IF EXISTS `yuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `jiaolianzhanghao` varchar(200) DEFAULT NULL COMMENT '教练账号',
  `jiaolianxingming` varchar(200) DEFAULT NULL COMMENT '教练姓名',
  `xueyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '学员账号',
  `xueyuanxingming` varchar(200) DEFAULT NULL COMMENT '学员姓名',
  `yuyuekemu` varchar(200) DEFAULT NULL COMMENT '预约科目',
  `yuyuechepai` varchar(200) DEFAULT NULL COMMENT '预约车牌',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609312040704 DEFAULT CHARSET=utf8 COMMENT='预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuyue`
--

LOCK TABLES `yuyue` WRITE;
/*!40000 ALTER TABLE `yuyue` DISABLE KEYS */;
INSERT INTO `yuyue` VALUES (41,'2020-12-30 06:46:57','预约编号1','教练账号1','教练姓名1','学员账号1','学员姓名1','科目一','预约车牌1','2020-12-30 14:46:57','备注1'),(42,'2020-12-30 06:46:57','预约编号2','教练账号2','教练姓名2','学员账号2','学员姓名2','科目一','预约车牌2','2020-12-30 14:46:57','备注2'),(43,'2020-12-30 06:46:57','预约编号3','教练账号3','教练姓名3','学员账号3','学员姓名3','科目一','预约车牌3','2020-12-30 14:46:57','备注3'),(44,'2020-12-30 06:46:57','预约编号4','教练账号4','教练姓名4','学员账号4','学员姓名4','科目一','预约车牌4','2020-12-30 14:46:57','备注4'),(45,'2020-12-30 06:46:57','预约编号5','教练账号5','教练姓名5','学员账号5','学员姓名5','科目一','预约车牌5','2020-12-30 14:46:57','备注5'),(46,'2020-12-30 06:46:57','预约编号6','教练账号6','教练姓名6','学员账号6','学员姓名6','科目一','预约车牌6','2020-12-30 14:46:57','备注6'),(1609312040703,'2020-12-30 07:07:20','202012301564635802747','001','王教练','1','刘倩','科目二','M66666','2020-11-29 00:00:00','教练 我要练科二');
/*!40000 ALTER TABLE `yuyue` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-30 18:09:10
