package br.com.designpattern.observer;

public class NewsChannel implements Channel {
	
    @Override
    public void update(String news) {
        System.out.println("Canal Notícias: " + news);
    }

}
