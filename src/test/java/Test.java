import service.MavenService;
import service.impl.MavenServiceImpl;
public class Test {
    @org.junit.Test
    public void show() {
        MavenService ms=new MavenServiceImpl();
        int count=ms.select("ggg",123456);
        if (count>0){
            System.out.println("登入成功！！！");
        }else {
            System.out.println("登入失败！！！");
        }

    }
}
