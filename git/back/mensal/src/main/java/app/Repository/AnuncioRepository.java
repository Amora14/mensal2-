package app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Anuncio;

public interface AnuncioRepository extends JpaRepository <Anuncio, Long> {

}
