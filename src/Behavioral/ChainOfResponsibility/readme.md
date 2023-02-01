# Chain of responsibility

>
Il pattern permette di separare gli oggetti che invocano richieste, dagli oggetti che le gestiscono, dando ad ognuno la possibilità di gestire queste richieste. Viene utilizzato il termine catena perché di fatto la richiesta viene inviata e "segue la catena" di oggetti, passando da uno all'altro, finché non trova quello che la gestisce.
>


Chain of Responsibility is a behavioral design pattern that allows passing requests along a dynamic chain of objects until one of them handles it.<br> 
The pattern eliminates the need to specify the handler of a request directly in its sender,<br>
decoupling the sender and receiver of a request.<br>
The request is passed between the objects via method chaining, and each object can either handle the request or pass it on to the next one in the chain.<br>
This enables building flexible, dynamic, and non-brittle systems,<br>
as the behavior of the request handling can be changed dynamically at runtime<br>
by inserting or removing handlers from the chain.

In Java, the **Chain of Responsibility** pattern<br>
can be implemented by creating an interface for handling requests that includes a method 
for setting the next handler in the chain and another method for handling the request.<br>
Then, each class that implements the interface should contain logic for either handling<br>
the request or passing it to the next handler in the chain.

```Java
abstract class Handler {
   protected Handler successor;

   public void setSuccessor(Handler successor) {
      this.successor = successor;
   }

   public abstract void handleRequest(int request);
}

class ConcreteHandler1 extends Handler {
   @Override
   public void handleRequest(int request) {
      if (request >= 0 && request < 10) {
         System.out.println("ConcreteHandler1 handled the request.");
      } else if (successor != null) {
         successor.handleRequest(request);
      }
   }
}

class ConcreteHandler2 extends Handler {
   @Override
   public void handleRequest(int request) {
      if (request >= 10 && request < 20) {
         System.out.println("ConcreteHandler2 handled the request.");
      } else if (successor != null) {
         successor.handleRequest(request);
      }
   }
}

class Client {
   public static void main(String[] args) {
      ConcreteHandler1 handler1 = new ConcreteHandler1();
      ConcreteHandler2 handler2 = new ConcreteHandler2();

      handler1.setSuccessor(handler2);

      int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

      for (int request : requests) {
         handler1.handleRequest(request);
      }
   }
}
```