package com.example.layouts;

import javax.servlet.annotation.WebServlet;

import com.example.layouts.AdjustableLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@Theme("layouts")

	

@SuppressWarnings("serial")
public class Demo extends UI {
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = Demo.class)
	public static class Servlet extends VaadinServlet {
	}
	
	@Override
	public void init(VaadinRequest request) {
		setContent(new AdjustableLayout());
	}
}
