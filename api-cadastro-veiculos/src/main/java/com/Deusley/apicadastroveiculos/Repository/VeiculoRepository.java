package com.Deusley.apicadastroveiculos.Repository;

import com.Deusley.apicadastroveiculos.domain.Veiculo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VeiculoRepository  extends JpaRepository <Veiculo,Integer> {

    boolean existsByPlaca(String placa);




}
