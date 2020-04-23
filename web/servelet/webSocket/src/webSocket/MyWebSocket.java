package webSocket;

import java.io.IOException;
import java.util.ArrayList;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class MyWebSocket {
   
   
   @OnOpen
   public void onOpen(Session session) {
	   Client.addSession(session);
      
   }
   
   @OnMessage
   public void onMessage(Session session, String message){
	   Client.sendMessage(session.getId()+">"+message);
	   
   }
   @OnError
   public void onError(Session session, Throwable t) {

      
   }
   
   @OnClose
   public void onClose(Session session) {
	   Client.removeSession(session);
   }
}