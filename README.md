# springboot_inf
스프링부트 개념과 활용_인프런 백기선님



* 스프링 부트 원리
  * 의존성 관리
  * 자동 설정
  * 내장 웹 서버
  *  독립적으로 실행 가능한 JAR
* 스프링 부트 활용
  * 스프링 부트 핵심 기능
    * SpringApplication
    * 외부 설정
    * 로깅
    * 테스트
    * Spring-Boot-Devtools
  * 각종 기술 연동
    * 스프링 웹 MVC
    * 스프링 데이터
    * 스프링 시큐리티
    * REST 클라이언트
* 스프링 부트 운영
  * 엔드포인트
  * 메트릭스
  * 모니터링



섹션 2. 3부 스프링 부트 원리

* 의존성 관리 이해
* 의존성 관리 응용

* 자동 설정 이해

* 자동 설정 만들기 1부: Starter와 AutoConfigure

* 자동 설정 만들기 2부: @ConfigurationProperties

* 내장 웹 서버 이해

* 내장 웹 서버 응용 1부 : 컨테이너와 포트

* 내장 웹 서버 응용 2부 : HTTPS와 HTTP2

* 톰캣 HTTP2

* 독립적으로 실행 가능한 JAR

* 스프링 부트 원리 정리

* 섹션 3. 4부 스프링 부트 활용

* 스프링 부트 활용 소개

* SpringApplication 1부

* SpringApplication 2부

* 외부 설정 1부

* 외부 설정 2부 (1)

* 외부 설정 2부 (2)

* 프로파일

* 로깅 1부: 스프링 부트 기본 로거 설정

* 로깅 2부: 커스터마이징

* 테스트

* 테스트 유틸

* Spring-Boot-Devtools

* 스프링 웹 MVC 1부: 소개

* 스프링 웹 MVC 2부: HttpMessageConverters

* 스프링 웹 MVC 3부: ViewResolve

* 스프링 웹 MVC 4부: 정적 리소스 지원

* 스프링 웹 MVC 5부: 웹JAR

* 스프링 웹 MVC 6부: index 페이지와 파비콘

* 스프링 웹 MVC 7부: Thymeleaf

* 스프링 웹 MVC 8부: HtmlUnit

* 스프링 웹 MVC 9부: ExceptionHandler

* 스프링 웹 MVC 10부: Spring HATEOAS

* 스프링 웹 MVC 11부: CORS

* 스프링 데이터 1부: 소개

* 스프링 데이터 2부: 인메모리 데이터베이스

* 스프링 데이터 3부: MySQL

* 스프링 데이터 4부: PostgreSQL

* 스프링 데이터 5부: 스프링 데이터 JPA 소개

* 스프링 데이터 6부: 스프링 데이터 JPA 연동

* 스프링 데이터 7부: 데이터베이스 초기화

* 스프링 데이터 8부: 데이터베이스 마이그레이션

* 스프링 데이터 9부: Redis

* 스프링 데이터 10부: MongoDB

* 스프링 데이터 11부: Neo4j

* 스프링 데이터 12부: 정리

* 스프링 시큐리티 1부: Starter-Security

* 스프링 시큐리티 2부: 시큐리티 설정 커스터마이징

* 스프링 REST 클라이언트 1부: RestTemplate과 WebClient

* 스프링 REST 클라이언트 2부: 커스터마이징

* 그밖에 다양한 기술 연동

* 섹션 4. 5부 스프링 부트 운영

* 스프링 부트 Actuator 1부: 소개

* 스프링 부트 Actuator 2부: JMX와 HTTP

* 스프링 부트 Actuator 3부: 스프링 부트 어드민

* 섹션 5. 6부 마무리

* 강의 마무리

# 스프링 부트 소개 

* https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started-introduci
ng-spring-boot

* 제품 수준의 스프링 기반 애플리케이션을 만들 때 빠르고 쉽게 만들 수 있다.

* 근본적으로 빠르고 광범위하게 액세스할 수 있는 시작 환경을 제공합니다.

* 일일히 설정을 하지 않아도 이미 컨벤션으로 정해져 있는 설정을 제공, 그러나 원하는데로 요구 사항에 따라 기본 설정들을 쉽고 빠르게 바꿀 수 있다. 

* 대규모 클래스에 공통적인 다양한 기능 외 기능 제공프로젝트 수(예: 임베디드 서버, 보안, 메트릭, 상태 확인 및 외부화 구성).

* 코드 생성이 전혀 없고 XML 구성이 필요하지 않습니다.

# 자동 설정 이해
* @EnableAutoConfiguration (@SpringBootApplication 안에 숨어 있음)
* 빈은 사실 두 단계로 나눠서 읽힘
  *  1단계: @ComponentScan
  *  2단계: @EnableAutoConfiguration
    1. 컴포넌트 스캔으로 빈을 등록하고, 
    2. EnableAutoConfiguration으로 읽어온 빈을 다시 등록한다. 
    * 즉 2번 빈을 등록하는것.  

* @ComponentScan 에서 읽는 빈들 아래 어노테이션이 달린 애들을 가져와 빈으로 등록
  *  @Component
  * @Configuration @Repository @Service @Controller @RestController
    * ComponentScan가 달려있는 클래스의 패키지부터 하위패키지 모두로 쭉 위 어노테이션들이 달린 클래스들을 빈으로 등록. 

* @EnableAutoConfiguration 에서 읽는 빈들 아래 어노테이션이 달린 애들을 가져와 빈으로 등록  
  * spring.factories
    *  org.springframework.boot.autoconfigure.EnableAutoConfiguration

  *  @Configuration
  * @ConditionalOnXxxYyyZzz


> External Libraries -> org.springframework.boot:spring-boot-autoconfigure -> spring.factories 파일에 적힌 애들이 기본설정된 애들이다. 


# 자동 설정 만들기 1부: Starter와 Autoconfigure
* https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-developing-auto-configuration

* Xxx-Spring-Boot-Autoconfigure 모듈: 자동 설정
* Xxx-Spring-Boot-Starter 모듈: 필요한 의존성 정의
* 그냥 하나로 만들고 싶을 때는?
  * Xxx-Spring-Boot-Starter
* 구현 방법
1. 의존성 추가
```xml
dependencies>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-autoconfigure</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-autoconfigure-processor</artifactId>
<optional>true</optional>
</dependency>
        </dependencies>
<dependencyManagement>
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.0.3.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
  </dependency>
</dependencies>
</dependencyManagement>
```

2. @Configuration 파일 작성
```java
@Configuration
public class HoloManConfiguration {

    @Bean
    public HoloMan holoMan() {
        HoloMan holoMan = new HoloMan();
        holoMan.setHowLong(5);
        holoMan.setName("youngsoo");

        return holoMan;
    }
}
```

3. src/main/resource/META-INF에 spring.factories 파일 만들기

4. spring.factories 안에 자동 설정 파일 추가
  * org.springframework.boot.autoconfigure.EnableAutoConfiguration=\ 패키지명.Configuration파일
    * org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
  com.ys.springboot.HoloManConfiguration



5. maven install
  * 다른 프로젝트에서 사용할 수 있게 빌드를 하고 install 해야한다 (다운로드 말고 )
  * 인텔리제이 오른쪽 상단 Maven -> Lifecycle -> install 
  * 또는 콘솔에서 mvn install 

> 이러면 이 프로젝트를 빌드를 해서 jar 파일 생성된걸 다른 메이븐 프로젝트에서도 사용할 수 있도록 로컬 메이븐 저장소에 설치를 한다  

6. 그러면 다른 프로젝트에서 pom.xml에 이 프로젝트를 불러와 쓸 수 있다.
  * ```xml
    <dependencies>
      <groupId>com.ys</groupId>
	    <artifactId>springboot</artifactId>
    </dependencies>
    ```
  
  * 이러면 다른 프로젝트에서 만든 빈을 가져와 쓸 수 있다
    * 그러나 현재 프로젝트에서 같은 빈을 만들어도 다른 프로젝트의 빈이 먼저가 된다. 
    * `덮어쓰기 라고 한다`
 
# 자동 설정 만들기 2부: @ConfigurationProperties
*  덮어쓰기 방지하기
  * @ConditionalOnMissingBean
  * > 위에서 만든 프로젝트인 com.ys.springboot 프로젝트 (빈을 사용하는 프로젝트 말고 빈을 만든 프로젝트)
      의 @Bean을 등록하는 곳에서 @ConditionalOnMissingBean 어노테이션을 붙인다.  
    * 그러면 불러오는 프로젝트에서 같은 타입의 빈이없으면 그럴때만 이 bean을 등록하라는 의미가 된다.  
    * ```java      
      @Configuration
      public class HoloManConfiguration {

          @Bean
          @ConditionalOnMissingBean // << 불러오는 프로젝트에서 HoloMan타입의 빈이 없을땐 이 빈이 된다. 
          public HoloMan holoMan() {
              HoloMan holoMan = new HoloMan();
              holoMan.setHowLong(5);
              holoMan.setName("youngsoo");

              return holoMan;
          }
      }
      ```
* 빈 재정의 수고 덜기
  * @ConfigurationProperties(“holoman”)
  * @EnableConfigurationProperties(HolomanProperties)
  * 프로퍼티 키값 자동 완성  


* ## 프로퍼티 파일에서 프로퍼티 값을 불러와서 사용하는 방법. 
  * 키 값 자동 완성! 


* 의존성 꼭 추가 
```xml
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-configuration-processor</artifactId>
<optional>true</optional>
</dependency>
```

1. properties 클래스 생성
```java
@Getter @Setter
@ConfigurationProperties("holoman")
public class HolomanProperties {

    private String name;

    private int howLong;
}

```
2. appcation.properties 파일에 프로퍼티 작성
```xml
holoman.name = 졸려요.
holoman.how-long = 100
```
3. 빈에 적용
```java

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HoloManConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public HoloMan holoMan(HolomanProperties properties) {
        HoloMan holoMan = new HoloMan();
        holoMan.setHowLong(properties.getHowLong());
        holoMan.setName(properties.getName());

        return holoMan;
    }
}

```

# 내장 웹 서버 이해
*  스프링 부트는 서버가 아니다.
  * 톰캣 객체 생성
  * 포트 설정
  * 톰캣에 컨텍스트 추가
  * 서블릿 만들기
  * ○ 톰캣에 서블릿 추가
  * ○ 컨텍스트에 서블릿 맵핑
  * ○ 톰캣 실행 및 대기
* 이 모든 과정을 보다 상세히 또 유연하고 설정하고 실행해주는게 바로 스프링부트의 자동 설정.
  *  ServletWebServerFactoryAutoConfiguration (서블릿 웹 서버 생성)
    * TomcatServletWebServerFactoryCustomizer (서버 커스터마이징)
  * DispatcherServletAutoConfiguration
    * 서블릿 만들고 등록

## 스프링부트가 내장 웹서버 실행시키는 코드

* 이런 방식으로 스프링부트 내에서 돌아간다 .

```java
public static void main(String[] args) throws LifecycleException {
//		SpringApplication.run(SpringbootApplication.class, args);

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		Context context = tomcat.addContext("/", "/");


		HttpServlet httpServlet = new HttpServlet() {
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

				PrintWriter writer = resp.getWriter();

				writer.println("<html><head><title>");
				writer.println("Hey, Tomcat");
				writer.println("</title></head>");
				writer.println("<body><h1>Hello Tomcat</h1></body>");
				writer.println("</html>");
			}
		};

		String servletName = "helloServlet";
		tomcat.addServlet("/", servletName, httpServlet);
		context.addServletMappingDecoded("/hello", servletName);


		tomcat.start();

		tomcat.getServer().await();

	}
```

# 내장 웹 서버 응용 1부: 컨테이너와 서버 포트
* https://docs.spring.io/spring-boot/docs/current/reference/html/howto-embedded-web-servers.html

* 다른 서블릿 컨테이너로 변경
* 웹 서버 사용 하지 않기
* 포트
  * server.port
  * 랜덤 포트
  * ApplicationListener<ServletWebServerInitializedEvent>

```java

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {
    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
        ServletWebServerApplicationContext applicationContext = servletWebServerInitializedEvent.getApplicationContext();
        System.out.println(applicationContext.getWebServer().getPort());
    }
}
```

# 내장 웹 서버 응용 2부: HTTPS와 HTTP2, SSL 세팅 

* https://opentutorials.org/course/228/4894
* https://gist.github.com/keesun/f93f0b83d7232137283450e08a53c4fd

* HTTPS 설정하기
  * 키스토어 만들기
  * HTTP는 못쓰네?
* HTTP 커넥터는 코딩으로 설정하기
  * https://github.com/spring-projects/spring-boot/tree/v2.0.3.RELEASE/spring-boot-samples/spring-boot-sample-tomcat-multi-connectors
* HTTP2 설정
  * server.http2.enable
  * 사용하는 서블릿 컨테이너 마다 다름


## HTTPS
* HTTPS를 만들라면 키스토어가 필요하다 
* 쉘 로 키스토어를 받고, properties 설정을 해줘야 한다. 
* 
* 쉘 명령어
  * ```shell
    keytool -genkey 
    -alias tomcat 
    -storetype PKCS12 
    -keyalg RSA 
    -keysize 2048 
    -keystore keystore.p12 
    -validity 4000    
    ```
    * ![](img/a9abe809.png)

* properties 설정 
```properties
server.ssl.key-store: keystore.p12
server.ssl.key-store-password: 123456
server.ssl.keyStoreType: PKCS12
server.ssl.keyAlias: spring // -alias 옵션에 넣은것 
```

* 이러면 모든 요청은 https으로 요청해야한다. 
  * 이러면 http는 못쓴다. 

* https, http 둘다 쓰려면 ???

> HTTP 커넥터(연결해주는)는 하나인데,HTTPS 설정을 해버리면 HTTP 요청을 받을 수 없다.  
새로운 커넥터를 코딩으로 설정해서 HTTP 요청을 총 2개의 커넥터로 HTTP 요청도 받을 수 있다.

* `커넥터를 만들어 주면 된다`
  * 이러면 포트번호는 다르지만, http, https 둘 다 받을 수 있다. 

```java
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) throws LifecycleException {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Bean
	public ServletWebServerFactory serverFactory() {
		TomcatServletWebServerFactory tomcatFactory = new TomcatServletWebServerFactory();
		tomcatFactory.addAdditionalTomcatConnectors(createStandardConnect());
		return tomcatFactory;
	}

	private Connector createStandardConnect() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(8090); // properties에서 설정한 원래 포트번호와 다르게 설정
		
		return connector;
	}
}
```

## https 설정
* properties 파일에서 설정
```properties
server.http2.enabled=true 
```

* 또는 spring-boot-starter-undertow 추가

