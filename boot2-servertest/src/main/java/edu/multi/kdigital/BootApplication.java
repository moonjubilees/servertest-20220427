package edu.multi.kdigital;
//해당 패키지에 있는것만 조회한다는 의미이므로 패키지가 새로 생성될 때마다 componentScan 추가해야함

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import product.ProductController;
import product.ProductDAO;
import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadController;

@SpringBootApplication
//부트프로젝트를 시작하는 파일을 나타내는 annotation
//1. 자동으로 tomcat서버 내장 시작
//2. annotation들을 인식, 스캔
@ComponentScan //같은 패키지내의 다른 클래스들도 인식할게
//@ComponentScan(basePackageClasses = StartController.class)
@ComponentScan(basePackageClasses = UploadController.class)
//@ComponentScan(basePackages = {"upload"})
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@MapperScan(basePackageClasses = MemberDAO.class) //사용방법은 COMPONENTSCAN과 동일하되, 매퍼를 읽어옴
@MapperScan(basePackageClasses = ProductDAO.class)
@ComponentScan(basePackageClasses = ProductDAO.class)
@ComponentScan(basePackageClasses = ProductController.class)
public class BootApplication {

	public static void main(String[] args) {
		System.out.println("=====스프링부트실행시작=====");
		SpringApplication.run(BootApplication.class, args);
		System.out.println("=====스프링부트실행중=====");
	}

}
