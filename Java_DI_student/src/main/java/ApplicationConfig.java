import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;

@Configuration
@ImportResource("classpath:spring-config.xml")//java내에서 xml사용
public class ApplicationConfig {

    @Bean
    public Student student1(){

        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("피아노");
        hobbys.add("음악듣기");

        Student student = new Student("황지원",23,hobbys);
        student.setHeight(168);
        student.setWeight(100);

        return student;
    }


    @Bean
    public Student student2(){
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("독서");
        hobbys.add("게임");

        Student student = new Student("황지웅",18,hobbys);
        student.setHeight(175);
        student.setWeight(100);

        return student;
    }

}
