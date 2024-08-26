package UTI.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import UTI.model.Leito;

public class LeitoRepository {
  // private List<Leito> leitos = new ArrayList<>(); não é bom usar porque não
  // persiste dados
  private static final int Zero_Bytes = 0;
  private File arquivo = new File("src/main/resources/database/tb_leitos.json");
  private ObjectMapper objectMapper = new ObjectMapper();

  public List<Leito> getAll() throws Exception {
    if (!arquivo.exists()) {
      arquivo.createNewFile();
    }

    List<Leito> leitos = null;

    if (arquivo.length() > Zero_Bytes) {
      leitos = objectMapper.readValue(arquivo, new TypeReference<List<Leito>>() {
      });
    } else {
      leitos = new ArrayList<>();
    }

    return leitos;
  }

  public boolean save(Leito leito) throws Exception {
    List<Leito> leitos = this.getAll();
    for (Leito leitoNoBanco : leitos) {
      if (leito.getId() == leitoNoBanco.getId()) {
        return false;
      }
    }
    leitos.add(leito);
    objectMapper.writeValue(arquivo, leitos);
    return true;
  }
}
