package chapter3.FundamentalDataStructures;

public class CaesarCipher {
	
	protected char[] encoder = new char[26];
	protected char[] decoder = new char[26];
	
	/*
	 * Constructor that initializes the encryption and decryption arrays
	 */
	
	public CaesarCipher(int rotation)
	{
		for(int k =0; k<26; k++)
		{
				encoder[k] = (char) ('A' + (k+rotation) % 26);
				decoder[k] = (char) ('A' + (k-rotation+26) % 26);
		}
	}
	
	/*
	 * Returns String representing an encrypted message
	 */
	
	public String encrypt(String message)
	{
		return transform(message, encoder);
	}
	
	/*
	 * Returns String representing a decoded message
	 */
	
	public String decrpyt(String message)
	{
		return transform(message, decoder);
	}
	
	/*
	 * Returns transformation of original String using given code 
	 */
	
	private String transform(String original, char[] code)
	{
		char[] msg = original.toCharArray();
		for(int k=0;k<msg.length;k++)
		{
			if(Character.isUpperCase(msg[k]))
			{
				int j = msg[k] - 'A';
				msg[k] = code[j];
			}			
		}
		return new String(msg);
	}
	
	public static void main(String [] args)
	{
		CaesarCipher cipher = new CaesarCipher(3);
		System.out.println("Encryption code = " + new String(cipher.encoder));
		System.out.println("Decryption Code = " + new String(cipher.decoder));
		String message = "I'M NEVER FALLING IN LOVE AGAIN.EVER";
		String coded = cipher.encrypt(message);
		System.out.println("The encoded message is : " + coded);
		String decoded = cipher.decrpyt(coded);
		System.out.println("The decoded message is : " + decoded);
		
	}

}
