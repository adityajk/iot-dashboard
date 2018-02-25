package dashboard.controller;

import dashboard.model.Greeting;
import dashboard.model.HelloMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello/{topic}")
    @SendTo("/topic/greetings")
    public Greeting greeting(@DestinationVariable("topic") String topic, HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!", topic);
    }

}
