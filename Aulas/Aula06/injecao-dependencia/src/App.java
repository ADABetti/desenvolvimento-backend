public class App {
    public static void main(String[] args) throws Exception {
        NotificadorService notificadorService = new NotificadorService(new NotificadorSMS());

        notificadorService.notificar("Seu pedido está sendo processado");

    }
}
