# Web后台开发common项目

## 项目内容

- 该项目是其他项目的公共部分，主要包括：

 - 基本工具类（common包），包括json、cache缓存、时间、加解密等
 - 异常分类（exception）
 - Web响应结果 ApiResponse封装类
 - 后续添加功能……

## 项目开发

## Maven设置

在Maven的配置文件settings.xml中添加仓库镜像

```
	<mirror>
		<id></id>
		<name></name>
		<url></url>
		<mirrorOf>central</mirrorOf>
	</mirror>
```

在Maven的配置文件settings.xml中添加私服（nexus）的认证信息
该配置用于 mvn deploy 时使用

```
  <servers>
    <server>
      <id>releases</id>
      <username></username>
      <password></password>
    </server>
    <server>
      <id>snapshots</id>
      <username></username>
      <password></password>
    </server>
  </servers>
```

### eclipse 开发环境配置

- 文件SVN提交配置
本地项目环境相关的文件不允许导入svn中。例如使用eclipse开发，并使用内嵌的SVN插件进行代码提交
为了避免本地环境导入SVN,必须在eclipse 中配置如下忽略规则(选择菜单window/Preferences/Team/Ignore Resources)：

 - .project
 - .classpath
 - .settings
 - .settings/*
 - .svn
 - */test-output/*
 - */target/*
 
- 测试用例
使用Spring-Test结合Junit方式

## 项目jar包发布

该项目为非部署项目，是一个工具类项目，修改后需要提交到Maven私服（nexus），便于其他项目使用

### 快照版本发布

- 在该项目下运行 mvn deploy，将项目发布到Maven私有库中
- 切记，不要频繁运行该命令（一定要在完成一个功能之后，运行）

### 正式版本发布

- 在该项目下运行 mvn release:prepare，进行发布前的准备，通过后进行下一步
- 否则需要运行mvn release:rollback进行回滚
- 在该项目下运行 mvn release:perform，执行版本发布
- 发布完成后，可以看到pom文件的version已经提升下一个
- 切记，不要频繁运行该命令（一定要在完成一个功能之后，运行）

