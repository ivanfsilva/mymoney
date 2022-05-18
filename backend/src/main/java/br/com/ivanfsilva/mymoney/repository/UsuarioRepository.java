package br.com.ivanfsilva.mymoney.repository;

import java.util.Optional;

import br.com.ivanfsilva.mymoney.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByEmail(String email);
}
