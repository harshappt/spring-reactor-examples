package com.harsha.reactor.flux;

import reactor.core.publisher.Flux;

public class FluxDemo {

	public static void main(String a[]){
		Flux<Integer> stringsFlux = Flux.just(1,2,3,4,5,6,7,8,9,10);
		stringsFlux.subscribe(System.out::println);
	}
}
