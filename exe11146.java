class exe11146{
	public static void main(String[] args) {
    int sandar[]=new int[21];

    for (int i=1;i<=20;i++){
      
      sandar[i]=i;
    }
       
         
    
    int a1 = sandar[1];
    int b1 = sandar[20];
    int a2 = sandar[2];
    int b2 = sandar[19];
    int a3 = sandar[3];
    int b3 = sandar[18];

    sandar[20]=a1;
    sandar[1]=b1;
    sandar[19]=a2;
    sandar[2]=b2;
    sandar[18]=a3;
    sandar[3]=b3;

    for (int i=1;i<=20;i++){
      System.out.println(sandar[i]);
      
    }
        
  }
}

//20 элементтен тұратын бір өлшемді массив берілген. Алғашқы үш және соңғы үш элементті олардың ретін сақтай отырып қайта реттеңіз	1