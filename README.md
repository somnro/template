# springboot 模板项目

## github建立空项目，本地代码文件夹推送
	1.git init
	
	2.git remote add origin https://github.com/somnro/template.git
	
	3.使用小乌龟或者idea建立忽略文件，然后提交

## 下载模板项目
    1.idea：VCS---Checkout from Version Control---Git 填写URl、目录 clone
        或命令下载 git clone https://github.com/somnro/template.git（指定目录 git clone https://github.com/somnro/template.git ./test1 ）,然后用idea打开
        或小乌龟界面下载，并
    （修改目录名称！修改目录名称！）
    2.删除.git目录，重新建立.git目录（重复这个步骤：github建立空项目，本地代码文件夹推送）
    3.pom.xml 文件下列地方修改自己的名称
        <artifactId>template</artifactId>
        <name>template</name>
	application.properties 的 spring.application.name
	
    
## 测试地址
	http://localhost:20005/test/1 
