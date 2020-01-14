import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.WString;
/**
 *
 */
public class JNATest1 {
  //继承Library，用于加载库文件
  public interface Clibrary extends Library {
    //加载libhello.so链接库
    JNATest1.Clibrary INSTANTCE = (JNATest1.Clibrary) Native.loadLibrary((Platform.isWindows() ? "testx64" : "test1"), JNATest1.Clibrary.class);

    //此方法为链接库中的方法
    public int add(int a,int b);
    public int substract(int a,int b);
    public void printHello();
    public WString TestString(WString s);
  }

  public static void main(String[] args) {
    int sum = JNATest1.Clibrary.INSTANTCE.add(5,3);
    int sub = JNATest1.Clibrary.INSTANTCE.substract(5,3);
    System.out.println("add(5,3) = "+sum);
    System.out.println("substract(5,3) = "+sub);
    JNATest1.Clibrary.INSTANTCE.printHello();

    WString pvData = new WString("测试123测试");
    System.out.println(JNATest1.Clibrary.INSTANTCE.TestString(pvData));

  }
}
