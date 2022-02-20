//package Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   /**@Test
   public void testEncrypt() {
      cipher test_cipher = new cipher();
      String str = test_cipher.encrypt("helloWORLD", "aBcD").toString();
      assertEquals("zwddgOGJDV",str);
   }*/

   @Test
   public void testDecrypt() {
      cipher test_cipher = new cipher();
      String str = test_cipher.decrypt("zwddgOGJDV", "aBcD").toString();
      assertEquals("helloWORLD",str);
   }
}