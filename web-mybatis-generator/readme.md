# Mybatis代码自动生成项目

## 项目内容

- 该项目是基于Mapper插件的代码生成器，主要生成的代码包括：

 - Model类
 - Mapper接口类
 - Mapper映射文件

## 代码生成

### 代码生成路径修改

代码生成路径修改在 pom.xml文件的properties下面进行修改
各个属性说明如下：

- bussName，业务名称，比如用户中心（usercenter）
- bussPackage，业务分包的基本路径，这里固定为com.web.backend
- javaProject，Maven的java代码路径，固定为/src/main/java
- resourceProject，Maven的配置文件代码路径，固定为/src/main/resources
- targetBasePackage，生成的代码的最终路径，由bussPackage.bussName构成

实际代码生成时，只需要修改 bussName 属性为自己的业务名称（分模块/分包名称）既可。
如果用于其他项目，需要修改 bussPackage属性为自己代码组织的基础路径（比如com.yourcompany.xxx）

### 配置文件修改

- 数据库配置文件（config/database.properties）修改

 - db.driver，数据库驱动，比如：oracle.jdbc.driver.OracleDriver
 - db.url，数据库链接地址，比如：jdbc:oracle:thin:@127.0.0.1:1521:lcb
 - db.username，数据库用户名
 - db.password，数据库密码

- 代码生成策略文件（mybatis/generatorConfig.xml）修改

 - 该部分主要修改 table节点，按照提供的示例修改即可
 - 修改要生成代码的数据库表
 - 修改生成代码的策略

### 执行命令生成代码

上面配置修改完成后，通过以下步骤运行，生成代码：

- 右键该项目，选择 run as-> maven build...
- 配置 goals为mvn mybatis-generator:generate
- 选中 skip tests选项卡
- 点击run，生成代码
