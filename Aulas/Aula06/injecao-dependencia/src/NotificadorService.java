public class NotificadorService {
  private Notificador notificador;

  public NotificadorService(Notificador notificador) {
    this.notificador = notificador;
  }

  public void notificar(String mensagem) {
    notificador.notificarCliente(mensagem);
  }
}
