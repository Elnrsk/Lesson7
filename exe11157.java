class exe11157{
	public static void main(String[] args) {
    int a[]=new int [10];

        for (int i =0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        for (int i = 0; i<a.length;i++){
          if(a[i]%2==0 && i%2!=0){
            a[i]=0;
            System.out.println(i+"  "+a[i]);
          }
        }
        System.out.println();
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
  }
}

//Бүтін сандар массиві берілген. Одан алып тастаңыз:
//а) тақ орындардағы барлық жұп элементтер;
//б) 3 немесе 5-ке еселік болатын барлық элементтер. 