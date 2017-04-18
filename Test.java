import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

//add the provider package
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.AES;
 
public class Test {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
       //test the API by creating an AES cipher
    	//	in CBC mode with padding
        BlockCipher engine = new AESEngine();
        PaddedBufferedBlockCipher encryptCipher;
        encryptCipher = new PaddedBufferedBlockCipher(
		new CBCBlockCipher(engine));
        
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding", new BouncyCastleProvider());
        
    	
    }
}
