package UTI.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import UTI.model.Medico;

public class MedicoRepository {
  private File arquivo = new File("src/main/resources/database/tb_medicos.json");
  private ObjectMapper objectMapper = new ObjectMapper(null);

  public List<Medico> getAll() throws Exception {
    if (!arquivo.exists()) {
      arquivo.createNewFile();
    }

    List<Medico> medicos = null;

    if (arquivo.length() > 0) {
      medicos = objectMapper.readValue(arquivo, new TypeReference<List<Medico>>() {
      });
    } else {
      medicos = new ArrayList<>();
    }
    return medicos;
  }

  public boolean save(Medico medico) throws Exception {
    List<Medico> medicos = this.getAll();
    for (Medico medicoNoBanco : medicos) {
      if (medico.getId() == medicoNoBanco.getId()) {
        return false;
      }
    }
    medicos.add(medico);
    objectMapper.writeValue(arquivo, medicos);
    return true;
  }
}
