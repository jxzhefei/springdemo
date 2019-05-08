package com.instamina.study.springdemo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan
@PropertySource(value = {"classpath:jdbc.properties"})
@MapperScan(basePackages = "com.instamina.study.springdemo.dao")
public class ApplicationContextConfig {
    @Bean
    public DataSource getDataSource(){
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setJdbcUrl("${jdbc.url}");
        ds.setUser("${jdbc.user}");
        ds.setPassword("${jdbc.password}");
        try {
            ds.setDriverClass("${jdbc.driver}");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return ds;
    }
    @Bean
    public SqlSessionFactory getSqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(new Resource[]{new ClassPathResource("com/instamina/study/springdemo/entity/UserMapper.xml")});
        SqlSessionFactory factory = null;
        try {
            factory = factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dstm = new DataSourceTransactionManager();
        dstm.setDataSource(dataSource);
        return dstm;
    }

}
