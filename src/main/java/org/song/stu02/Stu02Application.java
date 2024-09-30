package org.song.stu02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.song.stu02.mapper")
public class Stu02Application {

	public static void main(String[] args) {
		SpringApplication.run(Stu02Application.class, args);
	}

}
