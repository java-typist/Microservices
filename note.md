# This is my note in the process of the project development
## 8月22日
- eureka的高可用：eureka会将相关节点的注册信息复制到eureka集群中的其他节点(包括注册的服务),
若集群中的某个server节点宕机，且此server下的服务仅注册到此server上。因为在各节点处均有集群的注册表信息
所以服务依然能够与集群连接(但此项也导致了eureka的一致性上存在一定问题),若此时该server节点重新恢复，eureka
则将其重新纳入注册中心集群，不会发生类似"脑裂"的异常。
## 8月23日
- maven的镜像还是用repo1.maven.org/maven2吧
- spring boot 2.0以上使用dashboard需手动配置ServletRegistrationBean
```java
   @Bean
   public ServletRegistrationBean getServlet(){
       HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
       ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
       registrationBean.setLoadOnStartup(1);
       registrationBean.addUrlMappings("/hystrix.stream");      //服务监听端点
       registrationBean.setName("HystrixMetricsStreamServlet");
       return registrationBean;
   } 
```
- 断路器仪表盘无需整合至微服务体系内，仅提供实际可到达地址即可。
- It`s too tired to read Spring official documents, perhaps I get many.
