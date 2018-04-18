import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

public static void main(String[] args){
    String configLocation = "classpath:applicationCTX.xml";
    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
    //abstract application 아래에 genericxmlapplication이 있땅 IOC컨테이너가 생성됨
    MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);

    myInfo.getInfo();

    ctx.close();//data close 하는 습관,
}

}
