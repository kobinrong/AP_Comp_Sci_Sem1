import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Scanner;



public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    static int OurHealth = 15;
    static int OppHealth = 15;
    int [] OurShips = new int[15];
    int [] OppShips = new int[15];


    public int LoadOppShips()

    {
        System.out.println("I'm going to choose my ships.");
        for (int i = 0; i < OppShips.length; i++){
            int [i] OppShips = (int)(Math.random() * 101);}
    }

    public int LoadOurShip(){

        System.out.println("Input the locations of your 15 ships using numbers from 1-100 inclusive");
        Scanner kb= new Scanner (System.in);
        for (int i = 0; i < OurShips.length; i++){
            int [i] OurShips = kb.nextInt();
        }
    }

    public static String WeTakeDamage(int damage, int OurHealth)
    {
        System.out.println("Watch out- I'm going to take my shot!");
        int OppShot = (int)(Math.random() * 100) + 1;
        if(damage == 1)
        {
            --OurHealth;
            return OppShot + " goes down!";
        }
        if(int[]OurShips = 0)
        {
            return "Game over! Good game!";
        }

    }

    public static String OppTakesDamage(int [] OppShips, int OppHealth)
    {
        System.out.println("Input your shot!");
        int OurShot = kb.nextInt();
        for (int i = 0; i < OppShips.length; i++) {
            if(OurShot = int [i] OppShips)
            {
                --OppHealth;
                return OurShot + " goes down!";
            }
            else
            {
                return OurShot + " is incorrect. Shucks!";
            }
            if (int[i] OppShips = 0)
                {
                    return "Game over! You got me; good game!";
                }
            }
        }
    }





}

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Let's play: Battleship");

        //Form
        TextField shotInput = new TextField();

        button = new Button("Fire!");
        button.setOnAction( e -> checkShot(shotInput, shotInput.getText()) );

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(ageInput, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //Validate ships
   private boolean checkShot(TextField input, String message){
     int OurShot = Integer.parseInt(input.getText());

      for(int i = 0; i < OppShips.length(); i++)
        {
            if(OurShot = OppShips[i])
           {
                OppHealth -= 1;
                System.out.println("Darn you got me.");
           }
           else
            {
               System.out.println("Missed!");
          }
        }




        //try{
        //  int age = Integer.parseInt(input.getText());
        // System.out.println("User is: " + age);
        //return true;
        //}catch(NumberFormatException e){
        //  System.out.println("Error: " + message + " is not a number");
        //return false;
    }
}

public static void main(String[] args) {
        launch(args);
        LoadOppShips();
        LoadOurShips();
        WeTakeDamage();
        OppTakesDamage();


}