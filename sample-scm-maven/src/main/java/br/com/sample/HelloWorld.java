package br.com.sample;

import java.util.ResourceBundle;

public class HelloWorld {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("appResources");
		System.out.println(rb.getString("hello.world"));
		System.out.println(rb.getString("project.artifactId"));
		System.out.println(rb.getString("project.version"));
	}
}