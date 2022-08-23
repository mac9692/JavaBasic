package inheritance;

public class MyFriend2 {

    public static void main(String[] args) {
        Friend[] friends = new Friend[4];

        friends[0] = new UnivFriend("PARK", "Computer", "010-333-555");
        friends[1] = new UnivFriend("PARK", "Computer", "010-333-555");
        friends[2] = new CompFriend("KIM", "010-333-222", "AI");
        friends[3] = new CompFriend("KIM", "010-333-222", "AI");

        for (Friend friend : friends) {
            friend.showInfo();
            System.out.println();
        }
    }
}
