# easy-code
springboot整合基础组件demo
---
### Druid
* 集成 Druid  2020/8/6
    1. 引入druid-spring-boot-starter
    2. 配置DruidConfig
    3. 访问http://{ip}:{端口}/druid/index.html
---
### docker
* 集成docker 实现容器化部署 2020/8/22
    1.引入插件docker-maven-plugin,并配置dockerDirectory、dockerHost
    2.编写Dockerfile
    3.打包 mvn package
    4.构建 docker build
    5.查看镜像 docker images
    6.启动镜像 docker run -d -p 8001:8001 easy-code