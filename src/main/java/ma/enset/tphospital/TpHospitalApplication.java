package ma.enset.tphospital;

import ma.enset.tphospital.entities.Patient;
import ma.enset.tphospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TpHospitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(TpHospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        patientRepository.save(new Patient(null,"ilham",new Date(),true,3));
        patientRepository.save(new Patient(null, "ali",new Date(),false,11));
        patientRepository.save(new Patient(null, "amine",new Date(),false,5));
        patientRepository.save(new Patient(null, "imane",new Date(),true,2));
        patientRepository.save(new Patient(null, "sara",new Date(),false,19));
        */
    }
}
