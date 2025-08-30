package com.techlabs.OCPRender.test;

import com.techlabs.OCPRender.model.Article;
import com.techlabs.OCPRender.model.Quiz;
import com.techlabs.OCPRender.model.video;

public class RendererTest {

	public static void main(String[] args) {
		
		getType get = new getType();
		
		System.out.println("Rendered Type "+get.getType(new Article()));
		
		System.out.println("-----------------------------------");
		System.out.println("Rendered Type "+get.getType(new video()));
		
		System.out.println("-----------------------------------");
		System.out.println("Rendered Type "+get.getType(new Quiz()));
	}
}
