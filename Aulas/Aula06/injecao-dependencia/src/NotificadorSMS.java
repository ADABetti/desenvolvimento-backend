public class NotificadorSMS implements Notificador {

  @Override
  public void notificarCliente(String mensagem) {
    System.out.printf("O cliente foi notificado via SMS com a mensagem %s",
        mensagem);
  }
}
