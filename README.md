# SpringBootExample

##项目简介
	基于SpringBoot开发本实例Demo， SpringBoot version is 1.4.0.
	项目基于Maven构建，后续计划加入一些小例子来丰富Demo.

##功能列表
	+基本的Restful请求访问方式
	+基于请求的TestCase (Ctrl层包含使用MockMvc + restTemplate两种方式)
	+在application.properties文件中可以自定义程序启动时的端口，加入server.port=8080，
	      也可以在程序启动时使用JVM参数  -Dserver.port=8080
	+加入日志功能，使用SpringBoot默认的logback
	
##启动方式
	+直接运行Bootup类的Main方法。
	+也可使用命令行的方式，eg: $ mvn package && java -jar target/SpringBootExample.jar