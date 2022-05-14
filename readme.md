# 基于SSM的驾校预约管理系统

## 1、项目介绍

基于SSM的驾校预约管理系统1拥有三种角色，分别为管理员、教练、学员，具体功能如下：

管理员：学员管理、教练管理、驾校车辆管理、预约管理、取消预约管理、公告管理

教练：教练信息查询、预约管理、取消预约管理、注册、个人中心

学员：查看教练信息、预约教练、取消预约教练、评价教练、注册、个人中心


## 2、项目技术

后端框架：SSM（Spring、SpringMVC、Mybatis）

前端框架：Bootstrap、vue、jsp、css、JavaScript、JQuery

## 3、开发环境

- JAVA版本：JDK1.8，其它版本理论上可以
- IDE类型：IDEA、Eclipse、Myeclipse都可以。推荐IDEA与Eclipse
- tomcat版本：Tomcat 7.x、8.x、9.x、10.x版本均可
- 数据库版本：MySql 5.x
- maven版本：无限制
- 硬件环境：Windows 或者 Mac OS


## 4、功能介绍

### 4.1 登录

![前端登录](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223433.jpg)

教练和学员可以通过此界面登录至前端系统

### 4.2 学员模块

![学员个人中心](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223517.jpg)

![学员查询教练信息1](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223523.jpg)

![学员查看教练信息2](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223529.jpg)

![学员预约教练](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223536.jpg)

![学员后台-预约管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223541.jpg)

![学员后台-取消预约管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223546.jpg)

- 查看教练信息：学员可以通过教练账号和姓名多条件筛选教练、查询教练详细信息

- 预约教练：学员可以预约教练，预约界面可以填写时间和科目（详情见视频）

- 预约和取消预约：学员可以在自己后台查看预约信息和取消预约

- 注册及个人中心：学员可以进行注册和修改个人信息

- 评价教练：学员可以评价教练


### 4.3 教练模块

![教练后台-教练信息查询](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223853.jpg)

![教练后台预约管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223855.jpg)

![教练后台取消预约管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514223858.jpg)

- 教练信息查询：教练可以通过账号和姓名多条件查询其他教练信息详情

- 预约管理：教练可以通过预约编号查询学员预约信息详情

- 取消预约管理：教练可以取消学员的预约申请，以及查询取消预约记录


### 4.4 管理员模块

![管理员-驾校车辆管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514224054.jpg)

![管理员-驾校公告管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514224058.jpg)

![管理员-驾校教练管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514224100.jpg)

![管理员-学员管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514224103.jpg)

![管理员-预约管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514224108.jpg)

![管理员-取消预约管理](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514224111.jpg)

- 教练管理：管理员可以通过账号和姓名筛选教练信息，并能够增加、查看、修改、删除教练，还能查看教练评价

- 学员管理：管理员可以通过账号、姓名、性别筛选学员信息，并能够增加、查看、修改、删除学员

- 驾校车辆管理：管理员可以通过车牌号筛选车辆，并能够增加、查看、修改、删除车辆

- 预约管理：管理员可以通过预约编号筛选学员预约记录信息，并能够查看、修改、删除记录

- 取消预约管理：管理员可以通过预约编号和教练账号筛选取消预约记录信息，并能够查看、修改、删除记录

- 公告管理：管理员可以通过标题查询公告，并能够增加、查看、修改、删除公告


### 4.4 文章目录

![文章目录](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220514224647.jpg)

## 5、获取方式

关注公众号： **程序员王不二**，回复 “驾校1” ，即可获取完整版的项目代码。

![image-20220509000010316](https://gitee.com/buer_wang/project-drawing-bed/raw/master/Typora-Images/20220509000012.png)

## 6、其它项目

* [点击访问各种项目源码](https://mp.weixin.qq.com/s?__biz=MzkwMjM1MjM0Ng==&mid=2247483834&idx=1&sn=40517cecf36ce5d7663ed774a033fa2c&chksm=c0a79d0ff7d0141943c5d8da40b489e8ecdda5c345568776f475576506c76a954bd8238dc4f5#rd)
* [SSM框架项目](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzkwMjM1MjM0Ng==&action=getalbum&album_id=2387377591113859072#wechat_redirect)

* [springboot项目](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzkwMjM1MjM0Ng==&action=getalbum&album_id=2387377898791223296#wechat_redirect)

* [简单无框架项目](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzkwMjM1MjM0Ng==&action=getalbum&album_id=2387378317047218183#wechat_redirect)

  

