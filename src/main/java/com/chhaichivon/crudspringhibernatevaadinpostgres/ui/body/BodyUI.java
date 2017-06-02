package com.chhaichivon.crudspringhibernatevaadinpostgres.ui.body;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Kan-Chanproseth on 5/31/2017.
 */
public class BodyUI extends Panel{

	public BodyUI(){
		Panel panel = new Panel();
		VerticalLayout verticalLayout = new VerticalLayout();
			verticalLayout.addComponent(userFormLayout());
			panel.setContent(verticalLayout);
	}
	public FormLayout userFormLayout(){
		FormLayout form = new FormLayout();
		TextField tf1 = new TextField("Name");
		tf1.setIcon(FontAwesome.USER);
		tf1.setRequiredIndicatorVisible(true);
		form.addComponent(tf1);

		TextField tf2 = new TextField("Street address");
		tf2.setIcon(FontAwesome.ROAD);
		form.addComponent(tf2);

		TextField tf3 = new TextField("Postal code");
		tf3.setIcon(FontAwesome.ENVELOPE);
		form.addComponent(tf3);
		return form;
	}
}
