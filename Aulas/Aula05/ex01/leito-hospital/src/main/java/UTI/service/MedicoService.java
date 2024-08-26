package UTI.service;

import java.util.List;

import UTI.model.Medico;
import UTI.repository.MedicoRepository;

public class MedicoService {
  private MedicoRepository repository = new MedicoRepository();

  public List<Medico> listarMedicos() throws Exception {
    return repository.getAll();
  }

  public String cadastrarNovoMedico(Medico medico) throws Exception {
    if (repository.save(medico)) {
      return "Medico " + medico.getId() + "foi cadastrado com sucesso.";
    }
    return "Medicos devem ter ids unicos";
  }

}
