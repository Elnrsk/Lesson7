class exe11145{
	public static void main(String[] args) {
		 int arry[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
   int s =arry.length-1;
   System.out.println(s);
   System.out.println();
    //{8,7,3,4,5,6,2,1}

   // arry[0]=arry[7];
   // arry[1]=arry[6];
   // arry[2]=arry[5];
   // arry[3]=arry[4];
                
    for (int i = 0;i<arry.length/2;i++){    
     int j = s;
     int n = arry[i];
     int m = arry[j];
     arry[j]=n;
     arry[i]=m;
     s--;
     System.out.println(arry[i]+" ");
     System.out.println(arry[j]+" ");
    }

    for (int i =0;i<arry.length;i++){     //улкен сандар устыне кышкентайлар астына
       System.out.print(arry[i]+" ");
     }
  }
}

//Элементтердің жұп санынан тұратын массив берілген. Орнын ауыстыру:
//а) жартысы
//б) бірінші элемент екіншісімен, үшінші - төртіншімен және т.б.;
//в) оның жартысы келесі түрде: бірінші элементті өзгерту
//соңғысымен, екіншісімен - соңғымен және т.б..
//benim adim elnur men itshnikpin