# 简介
欢迎使用今日投资云开发者工具套件（SDK）1.0，SDK1.0是云 API1.0 平台的配套工具。目前已经支持sdp、blten等产品，后续所有的云服务产品都会接入进来。新版SDK实现了统一化，具有各个语言版本的SDK使用方法相同，接口调用方式相同，统一的错误码和返回包格式这些优点。
为方便 JAVA 开发者调试和接入今日投资云产品 API，这里向您介绍适用于 Java 的今日投资云开发工具包，并提供首次使用开发工具包的简单示例。让您快速获取今日投资云 Java SDK 并开始调用。
# 依赖环境
1.依赖环境：JDK 7 版本及以上。
2.从 今日投资云控制台 开通相应产品。
3.获取 SecretID、SecretKey 以及调用地址（endpoint），endpoint 一般形式为\*.investoday.net，如CVM 的调用地址为 blten.investoday.net，具体参考各产品说明。

# 获取安装
安装 Java SDK 前，先获取安全凭证。在第一次使用云API之前，用户首先需要在今日投资云控制台上申请安全凭证，安全凭证包括 SecretID 和 SecretKey， SecretID 是用于标识 API 调用者的身份，SecretKey是用于加密签名字符串和服务器端验证签名字符串的密钥。SecretKey 必须严格保管，避免泄露。
## 通过 Maven 安装(推荐)
通过 Maven 获取安装是使用 JAVA SDK 的推荐方法，Maven 是 JAVA 的依赖管理工具，支持您项目所需的依赖项，并将其安装到项目中。关于 Maven 详细可参考 Maven 官网 。
1. 请访问[Maven官网](https://maven.apache.org/)下载对应系统Maven安装包进行安装。
2. 为您的项目添加 Maven 依赖项，只需在 Maven pom.xml 添加以下依赖项即可。注意这里的版本号只是举例,您可以在[Maven仓库](https://search.maven.org/search?q=jrtzcloud-sdk-java)上找到最新的版本，当前最新版本为![](https://img.shields.io/maven-central/v/com.jrtzcloudapi/jrtzcloud-sdk-java?label=maven)：
```xml
<dependency>
    <groupId>com.jrtzcloudapi</groupId>
    <artifactId>jrtzcloud-sdk-java</artifactId>
    <!-- go to https://search.maven.org/search?q=jrtzcloud-sdk-java and get the latest version. -->
    <!-- 请到https://search.maven.org/search?q=jrtzcloud-sdk-java查询最新版本 -->
    <version>1.0.0</version>
</dependency>
```
3. 引用方法可参考示例。

## 通过源码包安装
1. 前往 [Github 代码托管地址](https://github.com/jrtzcloud/jrtzcloud-sdk-java) 下载源码压缩包。
2. 解压源码包到您项目合适的位置。
3. 需要将vendor目录下的jar包放在java的可找到的路径中。
4. 引用方法可参考示例。

## 更多示例

您可以在[github](https://github.com/jrtzcloud/jrtzcloud-sdk-java)中examples目录下找到更详细的示例。

# 相关配置

## 代理

指定代理访问(版本>=1.0.96)，目前仅支持 HTTP 代理：

```
HttpProfile httpProfile = new HttpProfile();
httpProfile.setProxyHost("真实代理ip");
httpProfile.setProxyPort(真实代理端口);
```

或者设置系统代理，您可以在代码中请求发起前设置：

```
System.setProperty("https.proxyHost", "真实代理ip");
System.setProperty("https.proxyPort", "真实代理端口");
```

或者运行程序时在启动参数中设置。
