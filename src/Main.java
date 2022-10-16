public class Main {
    public static void main(String[] args) {
        int myVariable = 0;
        String estacion = "Otoño";
        System.out.println("Tarea 2 de Robert Bellorin!");

        while (myVariable < 3){

            System.out.println(myVariable);
            myVariable++;
        }

        do {

            System.out.println(myVariable);
            myVariable++;

        }while (myVariable < 3);

        for(int i =0; i<3; i++){
            System.out.println(i);

        }

        switch (estacion){
            case "primavera":{
                System.out.println(estacion);
                break;

            }
            case "verano":{
                System.out.println(estacion);
                break;

            }

            case "otoño":{
                System.out.println(estacion);
                break;

            }

            default:{
                System.out.println(estacion);
                break;

            }




        }


    }

    public static String esPositivo(int numero){
        String respuesta = "0";

        if(numero < 0) {
            respuesta = "negativo";
        }

        if(numero > 0) {
            respuesta = "positivo";
        }

        return  respuesta;

    }
}