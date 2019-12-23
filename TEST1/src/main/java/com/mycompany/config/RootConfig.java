package com.mycompany.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = { "com.mycompany.sample" })
//@MapperScan(basePackages = { "com.mycompany.mapper" })
public class RootConfig {

//	@Bean
//	public DataSource dataSource() {
//		HikariConfig hikariConfig = new HikariConfig();
//		hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
////		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
////		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");		
//		hikariConfig.setUsername("book_ex");
//		hikariConfig.setPassword("book_ex");
//
//		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
//
//		return dataSource;
//
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//		sqlSessionFactory.setDataSource(dataSource());
//		return (SqlSessionFactory) sqlSessionFactory.getObject();
//	}

}
