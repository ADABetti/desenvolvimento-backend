import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.asm.TypeReference;
import org.springframework.stereotype.Component;

import com.example.programandoseufuturo.model.Vaga;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class VagaRepository {
  private static final int ZERO_BYTES = 0;
  private ObjectMapper objectMapper = new ObjectMapper();
  private File arquivo = new File("src/main/resources/database/tb_vagas.json");

  public List<Vaga> getAll() throws IOException {
    if (!arquivo.exists()) {
      arquivo.createNewFile();
    }

    if (arquivo.length() > ZERO_BYTES) {
      return objectMapper.readValue(arquivo, new TypeReference<List<Vaga>>() {
      });
    }

    return new ArrayList<>();
  }

  public boolean save(Vaga vaga) throws IOException {
    List<Vaga> vagas = this.getAll();

    for (Vaga vagaNoDataBase : vagas) {
      if (vaga.getId() == vagaNoDataBase.getId()) {
        return false;
      }

      vagas.add(vaga);
      objectMapper.writeValue(arquivo, vagas);
      return true;
    }
  }

  public boolean update(Vaga vaga) throws IOException {
    List<Vaga> vagas = this.getAll();
    for (Vaga vagaNoDataBase : vagas) {
      if (vaga.getId() == vagaNoDataBase.getId()) {
        vagaNoDataBase.setEstaOcupada(vaga.isEstaOcupada());
        vagaNoDataBase.setPlacaVeiculo(vaga.getPlacaVeiculo());
        objectMapper.writeValue(arquivo, vagas);
        return true;
      }
    }
    return false;
  }
}
