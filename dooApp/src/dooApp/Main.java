package dooApp;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//System.out.println("Non trouv� ");
  	DoApp a = new DoApp();
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Saisissez la taille du tableau");
  	int N = sc.nextInt();
	long ints[] = new long[N];
  
  for(int i=0; i<N; i++){
  	ints[i]=i;
  }
  System.out.println("Saisissez le nombre � recherche ?");
  int get = sc.nextInt();
	boolean find = a.exists(ints, get);
  	if(find) {
		System.out.println("Trouv�");
	}else {
		System.out.println("Non trouv� ");
	}
        

	}

}