package main;

public class Card {//This creates a card with 4 values
	public String[] strArr=new String[2];//Used for telling the user stuff [Number1, Suit1]
	public int[] numArr=new int[2];//Used for grading stuff  [Number2, Suit2]
	public Card(){
		double cardNum=Math.random();//Assigning said vars based on a rng
		if(cardNum<=0.0192307692308){
			strArr[0]=["Ace"];
			strArr[1]=["Spades];
			numArr[0]=[1];
			numArr[1]=[1];
		}else if(cardNum>0.0192307692308&&cardNum<=0.0384615384616){
			strArr[0]=["Two"];
			StrArr[1]=["Spades];
			numArr[0]=[2];
			numArr[1]=[1];
		}else if(cardNum>0.0384615384616&&cardNum<=0.0576923076924){
			strArr[0]=["Three"];
			StrArr[1]=["Spades"];
			numArr[0]=[3];
			numArr[1]=[1];
		}else if(cardNum>0.0576923076924&&cardNum<=0.0769230769232){
			strArr[0]=["Four"];
			StrArr[1]=["Spades"];
			numArr[0]=[4];
			numArr[1]=[1];
		}else if(cardNum>0.0769230769232&&cardNum<=0.096153846154){
			strArr[0]=["Five"];
			StrArr[1]=["Spades"];
			numArr[0]=[5];
			numArr[1]=[1];
		}else if(cardNum>0.096153846154&&cardNum<=0.115384615385){
			strArr[0]=["Six"];
			StrArr[1]=["Spades"];
			numArr[0]=[6];
			numArr[1]=[1];
		}else if(cardNum>0.115384615385&&cardNum<=0.134615384616){
			strArr[0]="Seven";
			number2=7;
			suit1="Spades";
			suit2=1;
		}else if(cardNum>0.134615384616&&cardNum<=0.153846153847){
			strArr[0]="Eight";
			number2=8;
			suit1="Spades";
			suit2=1;
		}else if(cardNum>0.153846153847&&cardNum<=0.173076923078){
			strArr[0]="Nine";
			number2=9;
			suit1="Spades";
			suit2=1;
		}else if(cardNum>0.173076923078&&cardNum<=0.192307692309){
			strArr[0]="Ten";
			number2=10;
			suit1="Spades";
			suit2=1;
		}else if(cardNum>0.192307692309&&cardNum<=0.21153846154){
			strArr[0]="Jack";
			number2=11;
			suit1="Spades";
			suit2=1;
		}else if(cardNum>0.21153846154&&cardNum<=0.230769230771){
			strArr[0]="Queen";
			number2=12;
			suit1="Spades";
			suit2=1;
		}else if(cardNum>0.230769230771&&cardNum<=0.250000000002){
			number1="King";
			number2=13;
			suit1="Spades";
			suit2=1;
		}else if(cardNum>0.250000000002&&cardNum<=0.269230769233){
			number1="Ace";
			number2=1;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.269230769233&&cardNum<=0.288461538464){
			number1="Two";
			number2=2;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.288461538464&&cardNum<=0.307692307695){
			number1="Three";
			number2=3;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.307692307695&&cardNum<=0.326923076926){
			number1="Four";
			number2=4;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.326923076926&&cardNum<=0.346153846157){
			number1="Five";
			number2=5;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.346153846157&&cardNum<=0.365384615388){
			number1="Six";
			number2=6;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.365384615388&&cardNum<=0.384615384619){
			number1="Seven";
			number2=7;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.384615384619&&cardNum<=0.40384615385){
			number1="Eight";
			number2=8;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.40384615385&&cardNum<=0.423076923081){
			number1="Nine";
			number2=9;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.423076923081&&cardNum<=0.442307692312){
			number1="Ten";
			number2=10;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.442307692312&&cardNum<=0.461538461543){
			number1="Jack";
			number2=11;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.461538461543&&cardNum<=0.480769230774){
			number1="Queen";
			number2=12;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.480769230774&&cardNum<=0.500000000005){
			number1="King";
			number2=13;
			suit1="Hearts";
			suit2=2;
		}else if(cardNum>0.500000000005&&cardNum<=0.519230769236){
			number1="Ace";
			number2=1;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.519230769236&&cardNum<=0.538461538467){
			number1="Two";
			number2=2;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.538461538467&&cardNum<=0.557692307698){
			number1="Three";
			number2=3;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.557692307698&&cardNum<=0.576923076929){
			number1="Four";
			number2=4;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.576923076929&&cardNum<=0.59615384616){
			number1="Five";
			number2=5;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.59615384616&&cardNum<=0.615384615391){
			number1="Six";
			number2=6;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.615384615391&&cardNum<=0.634615384622){
			number1="Seven";
			number2=7;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.634615384622&&cardNum<=0.653846153853){
			number1="Eight";
			number2=8;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.653846153853&&cardNum<=0.673076923084){
			number1="Nine";
			number2=9;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.673076923084&&cardNum<=0.692307692315){
			number1="Ten";
			number2=10;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.692307692315&&cardNum<=0.711538461546){
			number1="Jack";
			number2=11;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.711538461546&&cardNum<=0.730769230777){
			number1="Queen";
			number2=12;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.730769230777&&cardNum<=0.750000000008){
			number1="King";
			number2=13;
			suit1="Clubs";
			suit2=3;
		}else if(cardNum>0.750000000008&&cardNum<=0.769230769239){
			number1="Ace";
			number2=1;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.769230769239&&cardNum<=0.78846153847){
			number1="Two";
			number2=2;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.78846153847&&cardNum<=0.807692307701){
			number1="Three";
			number2=3;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.807692307701&&cardNum<=0.826923076932){
			number1="Four";
			number2=4;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.826923076932&&cardNum<=0.846153846163){
			number1="Five";
			number2=5;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.846153846163&&cardNum<=0.865384615394){
			number1="Six";
			number2=6;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.865384615394&&cardNum<=0.884615384625){
			number1="Seven";
			number2=7;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.884615384625&&cardNum<=0.903846153856){
			number1="Eight";
			number2=8;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.903846153856&&cardNum<=0.923076923087){
			number1="Nine";
			number2=9;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.923076923087&&cardNum<=0.942307692318){
			number1="Ten";
			number2=10;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.942307692318&&cardNum<=0.961538461549){
			number1="Jack";
			number2=11;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.961538461549&&cardNum<=0.98076923078){
			number1="Queen";
			number2=12;
			suit1="Dimonds";
			suit2=4;
		}else if(cardNum>0.98076923078){
			number1="King";
			number2=13;
			suit1="Dimonds";
			suit2=4;
		}
	}
	public String cardName(){//5 of Spades, Jack of Clubs, ect
		return(strArr[0]+" of "+strArr[1]);
	}
}
