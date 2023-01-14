class exe11156{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();        //5
    int n2 = sc.nextInt();        //20
    System.out.println();

    int a[]=new int [n2+1];//0-21
        
       
       
    for (int i = 0;i<a.length;i++){
       a[i]=(int)(Math.random()*100);
       System.out.println(a[i]);
    }
    System.out.println();

     for (int i = n1;i<=n2;i++){
      a[i]=0;
    } 

    System.out.println();

    for (int i = 0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}

//Жиымнан жою:
//а) барлық жағымсыз элементтер;
//б) берілген n санынан үлкен барлық элементтер;
//в) n1-ден n2-ге дейінгі барлық элементтер (n1 n2)