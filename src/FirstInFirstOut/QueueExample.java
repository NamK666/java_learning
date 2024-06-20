package FirstInFirstOut;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
    Queue<Message> messageQueue = new LinkedList<>();

    messageQueue.offer(new Message("sendMail","홍길동"));
    messageQueue.offer(new Message("sendSms","제니"));
    messageQueue.offer(new Message("sendKakaoTalk","리사"));

    while (!messageQueue.isEmpty()){
        Message message = messageQueue.poll();
    }
    }
}
