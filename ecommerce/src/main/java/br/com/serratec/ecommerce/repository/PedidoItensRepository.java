package br.com.serratec.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.ecommerce.model.PedidoItens;

public interface PedidoItensRepository extends JpaRepository<PedidoItens, Long>{
}
