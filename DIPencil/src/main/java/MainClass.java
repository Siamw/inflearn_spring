import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {


    public static void main(String[] args){

        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        //config파일만 수정하여 연필의 종류를 변경 할 수 있다.
        pencil.use();

        ctx.close();
    }
}
