package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random ranGen=new Random(); int randomNum=ranGen.nextInt(4);
	// 3. Print out this variable
System.out.println(randomNum);
	// 4. Get the user to enter something that they think is awesome
String inputuno=JOptionPane.showInputDialog("What's Something that you think is awesome?");
	// 5. If the random number is 0
if(randomNum==0) {JOptionPane.showMessageDialog(null, "Oh that's awesome!");}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if(randomNum==1) {JOptionPane.showMessageDialog(null, "They're alright");}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(randomNum==2 ) {JOptionPane.showMessageDialog(null, "That sucks");}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(randomNum==3) {JOptionPane.showMessageDialog(null, "I think its gone downhill");}
	// -- write your own answer

}

}
