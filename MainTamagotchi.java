public class MainTamagotchi {
    public static void main(String[] args) {
        
        Tamagotchi miMascota = new Tamagotchi();

       
        System.out.println("Jugando: " + miMascota.play());
        System.out.println("Comiendo: " + miMascota.eat());
        
        System.out.println("Jugando mucho...");
        miMascota.play();
        miMascota.play();
        System.out.println("Estado actual: " + miMascota.play());

        System.out.println("A dormir: " + miMascota.sleep());
    }
}