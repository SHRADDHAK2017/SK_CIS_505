public static int getValidInt(String question, String warning){
			Scanner sc = new Scanner(System.in);
			int number=0;
			
			while(true){
				try{
					System.out.print(question);
                    String str =sc.nextLine();
					number = Integer.parseInt(str);
					break;
				}catch(NumberFormatException e){
					System.out.println(warning);
                }
			}
		return number;
	 }