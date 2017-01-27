package main;

import java.util.Scanner;

public class main{//card.numArr[0]==ace,2,3,4  card.numArr[1]=spades,hearts,clubs,dimond(in that order)
	public static String checkCard2(card card1,card card2){//This checks two cards
		/*1 pair*/if(card1.numArr[0]==card2.numArr[0]){
			return "One Pair";
		}
		return "High Card";
	}
	
	public static String checkCard3(card card1,card card2,card card3){
		/*3 of a kind*/if(card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card3.numArr[0]){
			return "3 of a Kind";
		/*1 pair*/}else if(card1.numArr[0]==card2.numArr[0]||card1.numArr[0]==card3.numArr[0]||card2.numArr[0]==card3.numArr[0]){
			return "One Pair";
		}
		return "High Card";
	}
	
	public static String checkCard4(card card1,card card2,card card3,card card4){
		/*4 of a kind*/if(card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0]){
			return "4 of a Kind";
		/*3 of a kind*/}else if((card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card3.numArr[0])||(card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card4.numArr[0])||(card1.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0])||(card2.numArr[0]==card3.numArr[0]&card3.numArr[0]==card4.numArr[0])){
			return "3 of a Kind";
		/*2 pair*/}else if((card1.numArr[0]==card2.numArr[0]&&card3.numArr[0]==card4.numArr[0])||(card2.numArr[0]==card3.numArr[0]&&card1.numArr[0]==card4.numArr[0])||(card3.numArr[0]==card4.numArr[0]&&card1.numArr[0]==card2.numArr[0])||(card1.numArr[0]==card3.numArr[0]&&card2.numArr[0]==card4.numArr[0])||(card1.numArr[0]==card4.numArr[0]&&card2.numArr[0]==card3.numArr[0])||(card2.numArr[0]==card4.numArr[0]&&card1.numArr[0]==card3.numArr[0])){
			return "2 Pair";
		/*One pair*/}else if(card1.numArr[0]==card2.numArr[0]||card1.numArr[0]==card3.numArr[0]||card1.numArr[0]==card4.numArr[0]||card2.numArr[0]==card3.numArr[0]|card2.numArr[0]==card4.numArr[0]||card3.numArr[0]==card4.numArr[0]){
			return "One Pair";
		}
		return "High Card";
	}	
	
	public static String checkCard5(card card1,card card2,card card3,card card4,card card5){
		/*flush*/if(card1.numArr[1]==card2.numArr[1]&&card2.numArr[1]==card3.numArr[1]&&card3.numArr[1]==card4.numArr[1]&&card4.numArr[1]==card5.numArr[1]){
			/*royal flushif(royal flush){
				return 10;
	WORKING ON		straight flush}else if(straight flush){
				return 9;
			}*/
			return "Flush6";
		/*4 of a kind*/}else if((/*1*/card2.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0])||(/*2*/card1.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0])||(/*3*/card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0])||(/*4*/card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card5.numArr[0])||(/*5*/card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0])){
			return "4 of a Kind8";
		/*full house*/}else if(card1.numArr[0]==card2.numArr[0]&&card3.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0]){
			return "Full House7";
		}else if(card1.numArr[0]==card3.numArr[0]&&card2.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0]){
			return "Full House7";
		}else if(card1.numArr[0]==card4.numArr[0]&&card2.numArr[0]==card3.numArr[0]&&card2.numArr[0]==card5.numArr[0]){
			return "Full House7";
		}else if(card1.numArr[0]==card5.numArr[0]&&card2.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0]){
			return "Full House7";
		}else if(card2.numArr[0]==card3.numArr[0]&&card1.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0]){
			return "Full House7";
		}else if(card2.numArr[0]==card4.numArr[0]&&card1.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card5.numArr[0]){
			return "Full House7";
		}else if(card2.numArr[0]==card5.numArr[0]&&card1.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0]){
			return "Full House7";
		}else if(card3.numArr[0]==card4.numArr[0]&&card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card5.numArr[0]){
			return "Full House7";
		}else if(card4.numArr[0]==card5.numArr[0]&&card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card3.numArr[0]){
			return "Full House7";
		/*straight}else if(straight){
	WORKING ON		return 5;*/
		/*3 of a kind*/}else if((card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card3.numArr[0])||(card1.numArr[0]==card2.numArr[0]&&card1.numArr[0]==card4.numArr[0])||(card1.numArr[0]==card2.numArr[0]&&card2.numArr[0]==card5.numArr[0])||(card1.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0])||(card1.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card5.numArr[0])||(card1.numArr[0]==card4.numArr[0]&&card1.numArr[0]==card5.numArr[0])||(card2.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card4.numArr[0])||(card2.numArr[0]==card3.numArr[0]&&card3.numArr[0]==card5.numArr[0])||(card2.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0])||(card3.numArr[0]==card4.numArr[0]&&card4.numArr[0]==card5.numArr[0])){
			return "3 of a Kind4";
		/*2 pair*/}else if(card1.numArr[0]==card2.numArr[0]){
			if(card3.numArr[0]==card4.numArr[0]||card3.numArr[0]==card5.numArr[0]||card4.numArr[0]==card5.numArr[0]){
				return "2 Pair3";
			}
		}else if(card1.numArr[0]==card3.numArr[0]){
			if(card2.numArr[0]==card4.numArr[0]||card2.numArr[0]==card5.numArr[0]||card4.numArr[0]==card5.numArr[0]){
				return "2 Pair3";
			}
		}else if(card1.numArr[0]==card4.numArr[0]){
			if(card2.numArr[0]==card3.numArr[0]||card2.numArr[0]==card5.numArr[0]||card3.numArr[0]==card5.numArr[0]){
				return "2 Pair3";
			}
		}else if(card1.numArr[0]==card5.numArr[0]){
			if(card2.numArr[0]==card3.numArr[0]||card2.numArr[0]==card4.numArr[0]||card3.numArr[0]==card4.numArr[0]){
				return "2 Pair3";
			}
		}else if(card2.numArr[0]==card3.numArr[0]){
			if(card4.numArr[0]==card5.numArr[0]){
				return "2 Pair3";
			}
		}else if(card2.numArr[0]==card4.numArr[0]){
			if(card3.numArr[0]==card5.numArr[0]){
				return "2 Pair3";
			}
		/*2 pairs*/}else if(card2.numArr[0]==card5.numArr[0]){
			if(card3.numArr[0]==card4.numArr[0]){
				return "2 Pair3";
			}
		/*one pair*/}
		if(card1.numArr[0]==card2.numArr[0]||card1.numArr[0]==card3.numArr[0]||card1.numArr[0]==card4.numArr[0]||card1.numArr[0]==card5.numArr[0]||card2.numArr[0]==card3.numArr[0]||card2.numArr[0]==card4.numArr[0]||card2.numArr[0]==card5.numArr[0]||card3.numArr[0]==card4.numArr[0]||card3.numArr[0]==card5.numArr[0]||card4.numArr[0]==card5.numArr[0]){
			return "One Pair2";
		}
		return "High Card1";
	}
		
        public static int oppBet(int oppScore){//This function was added after origional creation
            double rnd=Math.random();
            if(rnd>=0.5 && oppScore>=0){
                return 0;
            }else if(rnd>=0.4 && oppScore>=5){
                return 5;
            }else if(rnd>=0.3 && oppScore>=10){
                return 10;
            }else if(rnd>=0.2 && oppScore>=20){
                return 20;
            }else if(rnd>=0.1 && oppScore>=50){
                return 50;
            }else{
                return 0;
            }
        }
        
	public static boolean oppFold(int bet){//This returns true if opponent folds
		double rnd=Math.random();
		if(bet>1001){//8/10
			return(rnd<=0.8);
                        /*This use to be:
                        if(rnd<=#){
                            return true;
                        }return false;
                        */
		}else if(bet>501&&bet<=1001){//7/10
			return(rnd<=0.7);
		}else if(bet>251&&bet<=501){//6/10
			return(rnd<=0.6);
		}else if(bet>101&&bet<=251){//5/10
			return(rnd<=0.5);
		}else if(bet>51&&bet<=101){//4/10
			return(rnd<=0.4);
		}else if(bet>26&&bet<=51){//3/10
			return(rnd<=0.3);
		}else if(bet>=11&&bet<=26){//2/10
			return(rnd<=0.2);
		}else if(bet>6&&bet<=11){//1/10
			return(rnd<=0.1);
		}
		return false;
	}
	public static void main (String[] args){
		int n=0;
		int myScore=250;//These are yours and your opponents starting score
		int oppScore=250;
		while(n==0){//I used 'n' for the while loop due to the fact that I have to break 2 while loops at once
			card dealCard1=new card();//Getting your cards
			card dealCard2=new card();
			card dealCard3=new card();//Getting opponent's cards
			card myCard1=new card();
			card myCard2=new card();//Getting dealer's cards
			card oppCard1=new card();
			card oppCard2=new card();
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
			int amount;
                        int oppBet=oppBet(oppScore);
			if(x==0){
                                bet+=10;//This line was added in after origional creation
				System.out.print("You have a "+myCard1.cardName()+" and a "+myCard2.cardName()+"\n");
				x++;
			}
			while(x==1){//Playing with both your cards
                                if(oppBet!=0){//These were added after origional creation
                                    bet+=oppBet;//
                                    String raiseChoice="";//
                                    int i=0;//
                                    while(i==0){//
                                        System.out.print("Opponent raised pot by "+oppBet+"\nDo you raise or fold?\n");//
                                        Scanner scr=new Scanner(System.in);//
                                        raiseChoice=(scr.nextLine()).toUpperCase();//
                                        if(raiseChoice.equals("FOLD")){//
                                            System.out.print("You fold, your opponent wins the pot of "+(bet*2));//
                                            myScore=myScore-bet;//
                                            oppScore=oppScore+bet;//
                                            i=1;//
                                        }else if(raiseChoice.equals("RAISE")){//
                                            if(bet>myScore){//
                                                System.out.print("You don't have that much money.\n");//
                                            }else{//
                                                System.out.print("Pot's raised to "+(bet*2)+"\n");//
                                                i=1;//
                                            }//
                                        }//
                                    }//
                                }//These were added after origional creation
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
                                oppBet=oppBet(oppScore);
				x++;
			}
			while(x==3){//Playing with your cards and 1 dealer card
                                if(oppBet!=0){//These were added after origional creation
                                    bet+=oppBet;//
                                    String raiseChoice="";//
                                    int i=0;//
                                    while(i==0){//
                                        System.out.print("Opponent raised pot by "+oppBet+"\nDo you raise or fold?\n");//
                                        Scanner scr=new Scanner(System.in);//
                                        raiseChoice=(scr.nextLine()).toUpperCase();//
                                        if(raiseChoice.equals("FOLD")){//
                                            System.out.print("You fold, your opponent wins the pot of "+(bet*2));//
                                            myScore=myScore-bet;//
                                            oppScore=oppScore+bet;//
                                            i=1;//
                                        }else if(raiseChoice.equals("RAISE")){//
                                            if(bet>myScore){//
                                                System.out.print("You don't have that much money.\n");//
                                            }else{//
                                                System.out.print("Pot's raised to "+(bet*2)+"\n");//
                                                i=1;//
                                            }//
                                        }//
                                    }//
                                }//These were added after origional creation
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
                                oppBet=oppBet(oppScore);
				x++;
			}
			while(x==5){//Playing with your cards and 2 dealer cards
                                if(oppBet!=0){//These were added after origional creation
                                    bet+=oppBet;//
                                    String raiseChoice="";//
                                    int i=0;//
                                    while(i==0){//
                                        System.out.print("Opponent raised pot by "+oppBet+"\nDo you raise or fold?\n");//
                                        Scanner scr=new Scanner(System.in);//
                                        raiseChoice=(scr.nextLine()).toUpperCase();//
                                        if(raiseChoice.equals("FOLD")){//
                                            System.out.print("You fold, your opponent wins the pot of "+(bet*2));//
                                            myScore=myScore-bet;//
                                            oppScore=oppScore+bet;//
                                            i=1;//
                                        }else if(raiseChoice.equals("RAISE")){//
                                            if(bet>myScore){//
                                                System.out.print("You don't have that much money.\n");//
                                            }else{//
                                                System.out.print("Pot's raised to "+(bet*2)+"\n");//
                                                i=1;//
                                            }//
                                        }//
                                    }//
                                }//These were added after origional creation
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
                                oppBet=oppBet(oppScore);
				x++;
			}
			while(x==7){//Playing with your cards and 3 dealer cards
                                if(oppBet!=0){//These were added after origional creation
                                    bet+=oppBet;//
                                    String raiseChoice="";//
                                    int i=0;//
                                    while(i==0){//
                                        System.out.print("Opponent raised pot by "+oppBet+"\nDo you raise or fold?\n");//
                                        Scanner scr=new Scanner(System.in);//
                                        raiseChoice=(scr.nextLine()).toUpperCase();//
                                        if(raiseChoice.equals("FOLD")){//
                                            System.out.print("You fold, your opponent wins the pot of "+(bet*2));//
                                            myScore=myScore-bet;//
                                            oppScore=oppScore+bet;//
                                            i=1;//
                                        }else if(raiseChoice.equals("RAISE")){//
                                            if(bet>myScore){//
                                                System.out.print("You don't have that much money.\n");//
                                            }else{//
                                                System.out.print("Pot's raised to "+(bet*2)+"\n");//
                                                i=1;//
                                            }//
                                        }//
                                    }//
                                }//These were added after origional creation
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
					System.out.print("You fold, your opponent wins the pot of "+(bet*2)+"\n");
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
