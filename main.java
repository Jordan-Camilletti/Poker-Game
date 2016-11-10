package main;

import java.util.Scanner;

public class Main {
	public static String checkCard2(Card card1,Card card2){//This checks two cards
		/*1 pair*/if(card1.numArr[0]==card2.numArr[0]){
			return "One Pair";
		}
		return "High Card";
	}
	
	public static String checkCard3(Card card1,Card card2,Card card3){
		/*3 of a kind*/if(card1.number2==card2.number2&&card2.number2==card3.number2){
			return "3 of a Kind";
		/*1 pair*/}else if(card1.number2==card2.number2||card1.number2==card3.number2||card2.number2==card3.number2){
			return "One Pair";
		}
		return "High Card";
	}
	
	public static String checkCard4(Card card1,Card card2,Card card3,Card card4){
		/*4 of a kind*/if(card1.number2==card2.number2&&card2.number2==card3.number2&&card3.number2==card4.number2){
			return "4 of a Kind";
		/*3 of a kind*/}else if((card1.number2==card2.number2&&card2.number2==card3.number2)||(card1.number2==card2.number2&&card2.number2==card4.number2)||(card1.number2==card3.number2&&card3.number2==card4.number2)||(card2.number2==card3.number2&&card3.number2==card4.number2)){
			return "3 of a Kind";
		/*2 pair*/}else if((card1.number2==card2.number2&&card3.number2==card4.number2)||(card2.number2==card3.number2&&card1.number2==card4.number2)||(card3.number2==card4.number2&&card1.number2==card2.number2)||(card1.number2==card3.number2&&card2.number2==card4.number2)||(card1.number2==card4.number2&&card2.number2==card3.number2)||(card2.number2==card4.number2&&card1.number2==card3.number2)){
			return "2 Pair";
		}else if(card1.number2==card2.number2||card1.number2==card3.number2||card1.number2==card4.number2||card2.number2==card3.number2||card2.number2==card4.number2||card3.number2==card4.number2){
			return "One Pair";
		}
		return "High Card";
	}	
	
	public static String checkCard5(Card card1,Card card2,Card card3,Card card4,Card card5){
		/*flush*/if(card1.suit2==card2.suit2&&card2.suit2==card3.suit2&&card3.suit2==card4.suit2&&card4.suit2==card5.suit2){
			/*royal flushif(royal flush){
				return 10;
	WORKING ON		straight flush}else if(straight flush){
				return 9;
			}*/
			return "Flush6";
		/*4 of a kind*/}else if((/*1*/card2.number2==card3.number2&&card3.number2==card4.number2&&card4.number2==card5.number2)||(/*2*/card1.number2==card3.number2&&card3.number2==card4.number2&&card4.number2==card5.number2)||(/*3*/card1.number2==card2.number2&&card2.number2==card4.number2&&card4.number2==card5.number2)||(/*4*/card1.number2==card2.number2&&card2.number2==card3.number2&&card3.number2==card5.number2)||(/*5*/card1.number2==card2.number2&&card2.number2==card3.number2&&card3.number2==card4.number2)){
			return "4 of a Kind8";
		/*full house*/}else if(card1.number2==card2.number2&&card3.number2==card4.number2&&card4.number2==card5.number2){
			return "Full House7";
		}else if(card1.number2==card3.number2&&card2.number2==card4.number2&&card4.number2==card5.number2){
			return "Full House7";
		}else if(card1.number2==card4.number2&&card2.number2==card3.number2&&card2.number2==card5.number2){
			return "Full House7";
		}else if(card1.number2==card5.number2&&card2.number2==card3.number2&&card3.number2==card4.number2){
			return "Full House7";
		}else if(card2.number2==card3.number2&&card1.number2==card4.number2&&card4.number2==card5.number2){
			return "Full House7";
		}else if(card2.number2==card4.number2&&card1.number2==card3.number2&&card3.number2==card5.number2){
			return "Full House7";
		}else if(card2.number2==card5.number2&&card1.number2==card3.number2&&card3.number2==card4.number2){
			return "Full House7";
		}else if(card3.number2==card4.number2&&card1.number2==card2.number2&&card2.number2==card5.number2){
			return "Full House7";
		}else if(card4.number2==card5.number2&&card1.number2==card2.number2&&card2.number2==card3.number2){
			return "Full House7";
		/*straight}else if(straight){
	WORKING ON		return 5;*/
		/*3 of a kind*/}else if((card1.number2==card2.number2&&card2.number2==card3.number2)||(card1.number2==card2.number2&&card1.number2==card4.number2)||(card1.number2==card2.number2&&card2.number2==card5.number2)||(card1.number2==card3.number2&&card3.number2==card4.number2)||(card1.number2==card3.number2&&card3.number2==card5.number2)||(card1.number2==card4.number2&&card1.number2==card5.number2)||(card2.number2==card3.number2&&card3.number2==card4.number2)||(card2.number2==card3.number2&&card3.number2==card5.number2)||(card2.number2==card4.number2&&card4.number2==card5.number2)||(card3.number2==card4.number2&&card4.number2==card5.number2)){
			return "3 of a Kind4";
		/*2 pair*/}else if(card1.number2==card2.number2){
			if(card3.number2==card4.number2||card3.number2==card5.number2||card4.number2==card5.number2){
				return "2 Pair3";
			}
		}else if(card1.number2==card3.number2){
			if(card2.number2==card4.number2||card2.number2==card5.number2||card4.number2==card5.number2){
				return "2 Pair3";
			}
		}else if(card1.number2==card4.number2){
			if(card2.number2==card3.number2||card2.number2==card5.number2||card3.number2==card5.number2){
				return "2 Pair3";
			}
		}else if(card1.number2==card5.number2){
			if(card2.number2==card3.number2||card2.number2==card4.number2||card3.number2==card4.number2){
				return "2 Pair3";
			}
		}else if(card2.number2==card3.number2){
			if(card4.number2==card5.number2){
				return "2 Pair3";
			}
		}else if(card2.number2==card4.number2){
			if(card3.number2==card5.number2){
				return "2 Pair3";
			}
		/*2 pairs*/}else if(card2.number2==card5.number2){
			if(card3.number2==card4.number2){
				return "2 Pair3";
			}
		/*one pair*/}
		if(card1.number2==card2.number2||card1.number2==card3.number2||card1.number2==card4.number2||card1.number2==card5.number2||card2.number2==card3.number2||card2.number2==card4.number2||card2.number2==card5.number2||card3.number2==card4.number2||card3.number2==card5.number2||card4.number2==card5.number2){
			return "One Pair2";
		}
		return "High Card1";
	}
		
	public static boolean oppFold(int bet){//This returns true if opponent folds
		double rnd=Math.random();
		if(bet>1001){//8/10
			if(rnd<=0.8){
				return true;
			}return false;
		}else if(bet>501&&bet<=1001){//7/10
			if(rnd<=0.7){
				return true;
			}return false;
		}else if(bet>251&&bet<=501){//6/10
			if(rnd<=0.6){
				return true;
			}return false;
		}else if(bet>101&&bet<=251){//5/10
			if(rnd<=0.5){
				return true;
			}return false;
		}else if(bet>51&&bet<=101){//4/10
			if(rnd<=0.4){
				return true;
			}return false;
		}else if(bet>26&&bet<=51){//3/10
			if(rnd<=0.3){
				return true;
			}return false;
		}else if(bet>=11&&bet<=26){//2/10
			if(rnd<=0.2){
				return true;
			}return false;
		}else if(bet>6&&bet<=11){//1/10
			if(rnd<=0.1){
				return true;
			}return false;
		}
		return false;
	}
	public static void main (String[] args){
		int n=0;
		int myScore=250;//These are yours and your opponents starting score
		int oppScore=250;
		while(n==0){//I used 'n' for the while loop due to the fact that I have to break 2 while loops at once
			Card dealCard1=new Card();//Getting your cards
			Card dealCard2=new Card();
			Card dealCard3=new Card();//Getting opponent's cards
			Card myCard1=new Card();
			Card myCard2=new Card();//Getting dealer's cards
			Card oppCard1=new Card();
			Card oppCard2=new Card();
			/*Getting your final card name and score*/String str[]=checkCard5(myCard1,myCard2,dealCard1,dealCard2,dealCard3).split("");
			String myCardName="";
			for(int x=0;x<str.length-1;x++){
				myCardName=myCardName+str[x];
			}
			/*Getting your opponen't final card name and score*/int myCardScore=Integer.parseInt(str[str.length-1]);
			String str1[]=checkCard5(oppCard1,oppCard2,dealCard1,dealCard2,dealCard3).split("");
			String oppCardName="";
			for(int x1=0;x1<str1.length-1;x1++){
				oppCardName=oppCardName+str1[x1];
			}
			int oppCardScore=Integer.parseInt(str1[str1.length-1]);
			int x=0;
			int bet=0;//These 2 vars are for the betting stuff
			int amount=0;
			if(x==0){
				System.out.print("You have a "+myCard1.cardName()+" and a "+myCard2.cardName()+"\n");
				x++;
			}
			while(x==1){//Playing with both your cards
				System.out.print("Do you want to bet, hold, view, or fold?\n");
				Scanner scr=new Scanner(System.in);
				String choice=(scr.nextLine()).toUpperCase();
				if(choice.equals("BET")){//If the player want to raise the bet
					System.out.print("Enter amount\n");
					amount=scr.nextInt();
					bet=bet+amount;
					if(bet>myScore){
						System.out.print("You don't have that much money.\n");
					}else{
						if(oppFold(amount)){
							System.out.print("Your opponent folds, you win the pot of "+((bet*2)-amount));
							break;
						}else{
							System.out.print("You raised the pot to "+(bet*2)+"\n");
							x++;
						}
					}
				}else if(choice.equals("HOLD")){//If the player wants to hold current pot
					x++;
				}else if(choice.equals("VIEW")){//If the player wants to view what they have
					System.out.print("You have a "+checkCard2(myCard1,myCard2)+"\n");
					System.out.print("Pot is "+(bet*2)+"\n");
					System.out.print("You have "+(myScore-bet)+"\n");
				}else if(choice.equals("FOLD")){//If the player wants to fold
					System.out.print("You fold, your opponent wins the pot of "+(bet*2));
					myScore=myScore-bet;
					oppScore=oppScore+bet;
					break;
				}
			}
			if(x==2){
				System.out.print("You have a "+myCard1.cardName()+" and a "+myCard2.cardName());
				System.out.print("\nDealer has a "+dealCard1.cardName()+"\n");
				x++;
			}
			while(x==3){//Playing with your cards and 1 dealer card
				System.out.print("Do you want to bet, hold, view, or fold?\n");
				Scanner scr=new Scanner(System.in);
				String choice=(scr.nextLine()).toUpperCase();
				if(choice.equals("BET")){
					if(bet>myScore){
						System.out.print("You don't have that much money.\n");
					}else{
						System.out.print("Enter amount\n");
						amount=scr.nextInt();
						bet=bet+amount;
						if(oppFold(amount)){
							System.out.print("Your opponent folds, you win the pot of "+((bet*2)-amount));
							break;
						}else{
							System.out.print("You raised the pot to "+(bet*2)+"\n");
							x++;
						}
					}
				}else if(choice.equals("HOLD")){
					x++;
				}else if(choice.equals("VIEW")){
					System.out.print("You have a "+checkCard3(myCard1,myCard2,dealCard1)+"\n");
					System.out.print("Pot is "+(bet*2)+"\n");
					System.out.print("You have "+(myScore-bet)+"\n");
				}else if(choice.equals("FOLD")){
					System.out.print("You fold, your opponent wins the pot of "+(bet*2));
					myScore=myScore-bet;
					oppScore=oppScore+bet;
					break;
				}
			}
			if(x==4){
				System.out.print("You have a "+myCard1.cardName()+" and a "+myCard2.cardName());
				System.out.print("\nDealer has a "+dealCard1.cardName()+" and a "+dealCard2.cardName()+"\n");
				x++;
			}
			while(x==5){//Playing with your cards and 2 dealer cards
				System.out.print("Do you want to bet, hold, view, or fold?\n");
				Scanner scr=new Scanner(System.in);
				String choice=(scr.nextLine()).toUpperCase();
				if(choice.equals("BET")){
					if(bet>myScore){
						System.out.print("You don't have that much money.\n");
					}else{
						System.out.print("Enter amount\n");
						amount=scr.nextInt();
						bet=bet+amount;
						if(oppFold(amount)){
							System.out.print("Your opponent folds, you win the pot of "+((bet*2)-amount));
							break;
						}else{
							System.out.print("You raised the pot to "+(bet*2)+"\n");
							x++;
						}
					}
				}else if(choice.equals("HOLD")){
					x++;
				}else if(choice.equals("VIEW")){
					System.out.print("You have a "+checkCard4(myCard1,myCard2,dealCard1,dealCard2)+"\n");
					System.out.print("Pot is "+(bet*2)+"\n");
					System.out.print("You have "+(myScore-bet)+"\n");
				}else if(choice.equals("FOLD")){
					System.out.print("You fold, your opponent wins the pot of "+(bet*2));
					myScore=myScore-bet;
					oppScore=oppScore+bet;
					break;
				}
			}
			if(x==6){
				System.out.print("You have a "+myCard1.cardName()+" and a "+myCard2.cardName());
				System.out.print("\nDealer has a "+dealCard1.cardName()+", a "+dealCard2.cardName()+" and a "+dealCard3.cardName()+"\n");
				x++;
			}
			while(x==7){//Playing with your cards and 3 dealer cards
				System.out.print("Do you want to bet, hold, view, or fold?\n");
				Scanner scr=new Scanner(System.in);
				String choice=(scr.nextLine()).toUpperCase();
				if(choice.equals("BET")){
					if(bet>myScore){
						System.out.print("You don't have that much money.\n");
					}else{
						System.out.print("Enter amount\n");
						amount=scr.nextInt();
						bet=bet+amount;
						if(oppFold(amount)){
							System.out.print("Your opponent folds, you win the pot of "+((bet*2)-amount));
							break;
						}else{
							System.out.print("You raised the pot to "+(bet*2)+"\n");
							x++;
						}
					}
				}else if(choice.equals("HOLD")){
					x++;
				}else if(choice.equals("VIEW")){
					System.out.print("You have a "+myCardName+"\n");
					System.out.print("Pot is "+(bet*2)+"\n");
					System.out.print("You have "+(myScore-bet)+"\n");
				}else if(choice.equals("FOLD")){
					System.out.print("You fold, your opponent wins the pot of "+(bet*2));
					myScore=myScore-bet;
					oppScore=oppScore+bet;
					break;
				}
			}
			if(x==8){
				System.out.print("You had a "+myCardName);//Judging who won and how much
				System.out.print("\nYour opponent had a "+oppCardName);
				if(myCardScore>oppCardScore){
					System.out.print("\nYou win!");
					myScore=myScore+(bet*2);
					oppScore=oppScore-(bet*2);
				}else if(oppCardScore>myCardScore){
					System.out.print("\nOpponent wins!");
					oppScore=oppScore+(bet*2);
					myScore=myScore-(bet*2);
				}else{
					System.out.print("\nDraw!");
				}
				System.out.print("\nTotal pot was "+(bet*2));//Final results of the match
				System.out.print("\nThe score is "+myScore+"(You) and "+oppScore+"(opponent)");
				System.out.print("\nKeep going?\n");
				Scanner scr=new Scanner(System.in);
				String cont=(scr.nextLine()).toUpperCase();
				if(cont.equals("NO")||myScore<=0||oppScore<=0){//The game stops if told so or if you/opponent run out of $$$ 
					n=1;
					break;
				}
			}
		}
		if(myScore<=0){//The ending stuff
			System.out.print("You lost, ya filth.");
		}else if(oppScore<=0){
			System.out.print("You won, ya meme.");
		}else{
			if(oppScore>myScore){
				System.out.print("You quit like the wimp you are, also you lost "+(oppScore-myScore)+" so good job idiot.");
			}else if(myScore>oppScore){
				System.out.print("You quit like the winp you are, but you did make "+(myScore-oppScore)+" so ya got that going for ya.");
			}else{
				System.out.print("Okay so you either decided to quit after the first round(loser for doing that) or you have extreme luck(loser for playing this game instead of buying a lottery ticket) so congratz.");
			}
		}
	}
}
