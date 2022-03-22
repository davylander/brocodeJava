package poo;

public class StaticKeyword {

	public static void main(String[] args) {
		/*
		 * static = modifier. A single copy of a variable/method is created and shared.
		 * 			The class "owns" the static member
		 */
		Friend friend1 = new Friend("Caylufra");
		Friend friend2 = new Friend("Leozedan");
		Friend friend3 = new Friend("Jorvitonio");
		Friend friend4 = new Friend("Arilomar");
		
		//System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();

	}

}
