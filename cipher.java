class cipher
{
	public static StringBuffer encrypt(String text, String cipher)
	{
		StringBuffer result= new StringBuffer();
		int s = calculateShift(cipher);
		System.out.println("Encrypt Shift : " + s);

		for (int i=0; i<text.length(); i++)
		{
			if (Character.isUpperCase(text.charAt(i)))
			{
				char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);
			}
			else
			{
				char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}

	public static StringBuffer decrypt(String text, String cipher)
	{
		StringBuffer result= new StringBuffer();
		int s = calculateShift(cipher);
		System.out.println("Decrypt Shift: " + s);

		for (int i=0; i<text.length(); i++)
		{
			char ch = text.charAt(i);
			result.append(ch);
		}
		return result;
	}

    static int calculateShift(String str)
    {
        int l = str.length();
        int sum = 0;
        for (int i = 0; i < l; i++) {
                sum += str.charAt(i);           
        }
        return sum;
    }

	/**public static void main(String[] args)
	{   
		String cipher_options = args[0];
        String input_text = args[1];
        String input_cipher = args[2];
        System.out.println("Text  : " + input_text);
		if(cipher_options.equals("encrypt")){
			System.out.println("Encrypt: " + encrypt(input_text, input_cipher));
		}
		else if(cipher_options.equals("decrypt")){
        	System.out.println("Decrypt: " + decrypt(input_text, input_cipher));
		}
		else 
			System.out.println("Invalid option");
	}
	 */
}