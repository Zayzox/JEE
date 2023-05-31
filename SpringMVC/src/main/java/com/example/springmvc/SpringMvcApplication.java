package com.example.springmvc;

import com.example.springmvc.entities.Patient;
import com.example.springmvc.repositories.PatientRepositorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PatientRepositorie  patientRepositorie){
		return args ->{
			patientRepositorie.save(new Patient(null,"Hassan",new Date(),false,12));
			patientRepositorie.save(new Patient(null,"Zineb",new Date(),false,13));
			patientRepositorie.save(new Patient(null,"Hind",new Date(),false,14));
			patientRepositorie.save(new Patient(null,"Mehdi",new Date(),true,10));
			patientRepositorie.findAll().forEach(p->{
				System.out.println(p.getNom());
			});
		};
	}

}
