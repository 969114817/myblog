package com.myblog.myblog.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.MybatisConfiguration;
import com.baomidou.mybatisplus.MybatisXMLLanguageDriver;
import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.enums.DBType;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Configuration
@MapperScan("com.myblog.myblog.mapper*")
public class MybatisPlusConfig {

//    @Autowired
//    private DruidConfig druidConfig;
//
    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType(DBType.MYSQL.getDb());
        return paginationInterceptor;
    }

    /**
     * druid数据库连接池
     */
//    @Bean(initMethod = "init")
//    public DruidDataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        return druidConfig.druidDataSource(dataSource);
//
//    }

    /**
     * 这里全部使用myhbatis-autoconfigure 已经自动加载的资源.不手动指定
     * 配置文件和mybatis-boot的配置文件同步
     */
//    @Bean
//    public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean() {
//        MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        mybatisSqlSessionFactoryBean.setDataSource(druidConfig.get);
//        mybatisSqlSessionFactoryBean.setVfs(SpringBootVFS.class);
//        if (StringUtils.hasText(this.properties.getConfigLocation())) {
//            mybatisSqlSessionFactoryBean.setConfigLocation(this.resourceLoader.getResource(this.properties.getConfigLocation()));
//        }
//        mybatisSqlSessionFactoryBean.setConfiguration(properties.getConfiguration());
//        if (!ObjectUtils.isEmpty(this.interceptors)) {
//            mybatisSqlSessionFactoryBean.setPlugins(this.interceptors);
//        }
//
//        //使用mybatis全局配置
//        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
//        globalConfiguration.setDbType(DBType.MYSQL.name());
//        // ID 策略 AUTO->`0`("数据库ID自增") INPUT->`1`(用户输入ID") ID_WORKER->`2`("全局唯一ID") UUID->`3`("全局唯一ID")
//        globalConfiguration.setIdType(0);
//        mybatisSqlSessionFactoryBean.setGlobalConfig(globalConfiguration);
//
//        MybatisConfiguration configuration = new MybatisConfiguration();
//        configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
//        mybatisSqlSessionFactoryBean.setConfiguration(configuration);
//        if (this.databaseIdProvider != null) {
//            mybatisSqlSessionFactoryBean.setDatabaseIdProvider(this.databaseIdProvider);
//        }
//        if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
//            mybatisSqlSessionFactoryBean.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
//        }
//        if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
//            mybatisSqlSessionFactoryBean.setTypeHandlersPackage(this.properties.getTypeHandlersPackage());
//        }
//
//        if (!ObjectUtils.isEmpty(this.properties.resolveMapperLocations())) {
//            mybatisSqlSessionFactoryBean.setMapperLocations(this.properties.resolveMapperLocations());
//        }
//        return mybatisSqlSessionFactoryBean;
//    }

}
