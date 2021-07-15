package br.com.designpattern.observer;

public class WebChannel implements Channel {
	
    @Override
    public void update(String news) {
        System.out.println("Web: " + news);
    }

}
