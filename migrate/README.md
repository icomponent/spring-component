# MIGRATE 模块

该模块负责所有数据库迁移工作，普通`spring-boot`项目。

## 功能简介

模块包名：`club.icomponent.migrate`。

`MigrateApplication`：模块入口类。

`config`包：所有数据源配置，有新增数据源时，新建数据源配置对象，继承自`DataSource`，标记组件，配置前缀，`spring-boot`可自动注入。

`start`包：项目启动时执行的初始化逻辑，根据`SQL`文件迁移数据库。
