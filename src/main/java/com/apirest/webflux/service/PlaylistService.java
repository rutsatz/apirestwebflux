package com.apirest.webflux.service;

import com.apirest.webflux.document.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {

	/**
	 * Seria o equivalente a retorna um List no programação síncrona.
	 *
	 * @return
	 */
	Flux<Playlist> findAll();

	/**
	 *
	 * @param id
	 * @return
	 */
	Mono<Playlist> findById(String id);

	Mono<Playlist> dave(Playlist playlist);

}
