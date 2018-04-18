import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.mail.javamail.ConfigurableMimeFileTypeMap;

public class MainClass {
    public static void main(String[] args){

    String ConfigLocation1 = "classpath:applicationCTX.xml";
    String ConfigLocation2= "classpath:applicationCTX1.xml";

    AbstractApplicationContext ctx = new GenericXmlApplicationContext(ConfigLocation1, ConfigLocation2);




    Student student1 = ctx.getBean("student1", Student.class);

        System.out.println(student1.getName());
        System.out.println(student1.getHobby());



    StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);//student info에 student info를 받아와서
    Student student2=studentInfo.getStudent();//student에 넣어주어야 한다

        System.out.println(student2.getName());
        System.out.println(student2.getHobby());



    Student student3 = ctx.getBean("student3", Student.class);

    System.out.println(student3.getName());
    System.out.println(student3.getHobby());

    Family family = ctx.getBean("family", Family.class);

        System.out.println(family.getPapaName());
        System.out.println(family.getMamaName());
        System.out.println(family.getSisName());
        System.out.println(family.getBroName());

    }
}
