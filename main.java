// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //+5 wear super warm
    //+5 to 15 wear warm
    //+15 to +30 normal
    //+30 more you need cooling

    int temperature = 15;
    if (temperature <= 5){
    System.out.println("wear super warm");
    }
    else if (temperature >5 && temperature >= 15){
    System.out.println("wear warm");
    }
    else if (temperature >=15 && temperature < 30){
    System.out.println("normal");      
    }
    else if (temperature >30){
    System.out.println("cooling");  
    }

    

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
