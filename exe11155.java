import java.util.Scanner;
class exe11155{
	public static void main(String[] args) {
		int a[]=new int[25];
    Scanner sc = new Scanner(System.in);
    int index = 0;
    int oki = sc.nextInt();

    for (int i =0;i<a.length;i++){
      a[i]=(int)(Math.random()*1000);
    }                                                                            
    a[5]=0;
    a[20]=0;
    a[17]=579;

    for (int i =0;i<a.length;i++){
     System.out.println(a[i]); 
    }

    for (int i =0;i<a.length;i++){
     if(oki==a[i]){
        a[i]=0;
         index+=i;
        System.out.println(a[i]+" v etom "+index+" raspalozheno");
     }
    }
  }
}



//Жиым сыныптағы 25 оқушының әрқайсысының бойы туралы ақпаратты қамтиды
//(өсу реті бойынша). Екі оқушы сабақтан шығып кетті. Қалған студенттердің биіктігі деректері бірдей ретпен сұрыпталған жаңа массив алыңыз. Екі ықтимал жағдайды қарастырыңыз:
//1) оқудан шығарылған студенттердің реттік нөмірлері белгілі;
//2) оқуды тастап кеткен оқушылардың бойының мәндері белгілі.