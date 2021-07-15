package br.com.designpattern.observer;

public class TesteObserver {

	public static void main(String[] args) {
		
		NewsChannel newsChannel = new NewsChannel();
		WebChannel webChannel = new WebChannel();
		
		NewsAgency newsAgency = new NewsAgency();
		newsAgency.addObserver(webChannel);
		newsAgency.addObserver(newsChannel);
		
		newsAgency.setNews("Churrasco por conta dos estags");
		
	}
	
}
