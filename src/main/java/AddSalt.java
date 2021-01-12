import net.gf.security.MD5SaltUtil;

public class AddSalt {

	public static void main(String args[]) {
		String plaintext = "abcafdafeSDF3afdasre";

		System.out.println("Original： " + plaintext);
		System.out.println("MD5： " + MD5SaltUtil.md5Sum(plaintext));

		// MD5 after added salt
		String ciphertext = MD5SaltUtil.createMD5WithSalt(plaintext);
		System.out.println("Added SaltMD5： " + ciphertext);
		System.out.println("Veerify: " + MD5SaltUtil.verify(plaintext, ciphertext));

		/**
		 * Some added salt strings
		 */
//		String[] tempSalt = { "264b3137c634a0e018288b5909022cc64f6b14303685e60a",
//				"86f48fe82609a02b0006420c08550cd0902c59aa64d92626",
//				"85a048619f63891f91511b6fd7072f54a09fe5df3c85d527" };
//
//		for (String temp : tempSalt) {
//			System.out.println("Verify: " + MD5Util.verify(plaintext, temp));
//		}
	}
}