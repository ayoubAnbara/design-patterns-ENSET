package anbara.composite.example2;

public class Application {
    public static void main(String[] args) {

        Comment comment = new Comment("Hello");
        Reply replayTo1 = new Reply("Hello Ayoub");
        Reply replayTo2 = new Reply("Hi Ayoub");
        Reply replayTo3 = new Reply("Bonjour Ayoub");

        comment.addChild(replayTo1);
        comment.addChild(replayTo2);
        comment.addChild(replayTo3);


        Comment comment1 = new Comment("Good morning from comment1");
        Reply reply1 = new Reply("Bonjour to Comment1 from reply1");

        comment1.addChild(reply1);

        comment.print();
        comment1.print();
    }
}
