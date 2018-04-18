import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {


    public static void main(String[] args){

        String configLocation = "classpath:applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

        StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
        studentInfo.getStudentInfo();


        Student student2 = ctx.getBean("student2", Student.class);
        //xml에서 ref를 사용하지 않은 경우 , student2의 정보를 받아와서 studentinfo에서 처리,,
        studentInfo.setStudent(student2);
        studentInfo.getStudentInfo();


        ctx.close();

    }
    

}
