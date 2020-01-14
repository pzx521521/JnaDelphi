import com.sun.jna.Platform;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String arch = System.getProperty("sun.arch.data.model");
        System.out.println("arch:"+arch);
    }
}
