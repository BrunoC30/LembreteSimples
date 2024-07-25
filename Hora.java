import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hora{
    public static void main(String[] args){
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

    System.out.println("deixe um lembrete");
    String lembrete = sc.nextLine();
    System.out.println("para que horas vai ser esse lembrete? \thh:mm");
    String dado = sc.nextLine();

    //conversão do tipo data-hora para tipo String usando formatação para colocar em formato customizado
    String alarme = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" "+dado;


    Boolean loop = true;

    //formato de data
    DateTimeFormatter  fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    //aqui a data fornecida é constantemente checada com o horario atual
    while(loop){
       String dataAtual = LocalDateTime.now().format(fmt);
    
       if(dataAtual.equals(alarme)){
        System.out.println(lembrete);
        loop=false;
       }
    }
    

    sc.close();
    }

}