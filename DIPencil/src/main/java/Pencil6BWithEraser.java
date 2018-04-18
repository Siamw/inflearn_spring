import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Pencil6BWithEraser implements Pencil{


    public void use(){
        System.out.println("6B 굵기로 쓰이고, 지우개가 있습니다.");
    }


}
