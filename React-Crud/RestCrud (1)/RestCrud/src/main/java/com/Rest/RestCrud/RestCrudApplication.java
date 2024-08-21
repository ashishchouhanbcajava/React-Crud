package com.Rest.RestCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCrudApplication.class, args);
//		loop loop = new loop();
		loop.loop1();
	}

}

class loop

{
	public static void loop1() {
		{
			OuterLoop: for (int i = 0; i <= 10; i++) {
				System.out.println("in i "+i);
				for (int j = 0; j <= i; j++) {
					System.out.println("in j "+j);
					if (i == 6) {
						break OuterLoop;
					}
				}
			}
		}
	}

}
