package com.example.duck;

import com.example.duck.fly.FlyRocketPowered;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;

@SpringBootApplication
public class DuckApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DuckApplication.class, args);
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		mallard.swim();

		Duck model = new ModelDuck();
//		model.performFly();
		// 여기서 동적으로 변경한다
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
