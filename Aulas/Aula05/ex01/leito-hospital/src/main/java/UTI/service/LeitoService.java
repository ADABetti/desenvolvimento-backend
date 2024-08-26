package UTI.service;

import java.util.List;

import UTI.model.Leito;
import UTI.repository.LeitoRepository;

public class LeitoService {
  private LeitoRepository repository = new LeitoRepository();

  public List<Leito> listarLeitos() throws Exception {
    return repository.getAll();
  }

  public String cadastraNovoLeito(Leito leito) throws Exception {
    if (repository.save(leito)) {
      return "Leito " + leito.getId() + " foi cadastrado com sucesso";
    }
    return "Leitos devem ter ids únicos";
  }
}
