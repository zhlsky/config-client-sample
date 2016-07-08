# config-client-sample

###普通のapplication.ymlとbootstrap.yml
bootstrap.ymlのロード　→　Applicationの初期化 →　application.ymlのロード

###bootstrap.yml
```
spring:
  cloud:
    config:
      uri: http://localhost:9006 →　Config Server指定
  application:
    name: demo　→　アプリ名
  profiles:
    active: dev1　→　環境名
```


###Config Serverには該当するconfigがあったら、最優先。
