//package com.apirest.webflux;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.apirest.webflux.document.Playlist;
//import com.apirest.webflux.repository.PlaylistRepository;
//
//import reactor.core.publisher.Flux;
//
///**
// * Implementa o CommandLineRunner para executar quando subir a aplicação.
// *
// * @author rafael.rutsatz
// *
// */
//@Component
//public class DummyData implements CommandLineRunner {
//
//	private final PlaylistRepository playlistRepository;
//
//	@Autowired
//	DummyData(PlaylistRepository playlistRepository) {
//		this.playlistRepository = playlistRepository;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		playlistRepository
//				/* Deleta tudo ao iniciar. */
//				.deleteAll()
//				/*  */
//				.thenMany(
//						/* Cria um fluxo de stream para inserir no banco. */
//						Flux.just("API Rest Spring Boot", //
//								"Deploy de uma aplicação java IBM Cloud", //
//								"JAva 8", //
//								"Github", //
//								"Spring Security", //
//								"Web Service RESTFULL", //
//								"Bean no Spring Framework")
//								/* Cria as playlists. */
//								.map(nome -> new Playlist(UUID.randomUUID().toString(), nome))//
//								/* Insere elas no banco. */
//								.flatMap(playlistRepository::save))//
//				.subscribe(System.out::println);
//
//	}
//
//}
