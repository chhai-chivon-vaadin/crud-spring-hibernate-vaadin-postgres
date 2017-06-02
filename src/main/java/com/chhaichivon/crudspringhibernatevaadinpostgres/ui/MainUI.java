package com.chhaichivon.crudspringhibernatevaadinpostgres.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */

@SpringUI
@Theme("mytheme")
@RequestMapping(value = "/", method = RequestMethod.GET)
public class MainUI extends UI {

	VerticalLayout rootVerticalLayout = new VerticalLayout();

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		VerticalLayout bodyVerticalLayout = new VerticalLayout();

		bodyVerticalLayout.addComponent(formLayoutAddStaff());

		rootVerticalLayout.addComponent(bodyVerticalLayout);
		setContent(rootVerticalLayout);
	}

	public FormLayout formLayoutAddStaff()
	{
		FormLayout form = new FormLayout();
		form.setCaption("Add Staff");
		TextField textFieldFirstName = new TextField("First Name");
		textFieldFirstName.setIcon(FontAwesome.USER);
		textFieldFirstName.setRequiredIndicatorVisible(true);
		form.addComponent(textFieldFirstName);

		TextField textFieldLastName = new TextField("Last Name");
		textFieldLastName.setIcon(FontAwesome.USER);
		textFieldLastName.setRequiredIndicatorVisible(true);
		form.addComponent(textFieldLastName);

		TextField textFieldAddress = new TextField("Address");
		textFieldAddress.setIcon(FontAwesome.ROAD);
		form.addComponent(textFieldAddress);

		RadioButtonGroup<String> radioButtonGroupGender = new RadioButtonGroup<>("Gender");
		List<String> listGender = new ArrayList<>();
		listGender.add("Male");
		listGender.add("Female");
		radioButtonGroupGender.setItems(listGender);
		form.addComponent(radioButtonGroupGender);

		CheckBoxGroup<String> checkBoxGroupStatus = new CheckBoxGroup<>("Status");
		List<String> listStatus = new ArrayList<>();
		listStatus.add("Single");
		listStatus.add("Married");
		checkBoxGroupStatus.setItems(listStatus);
		form.addComponent(checkBoxGroupStatus);

		List<String> roles = new ArrayList<>();
		roles.add("Admin");
		roles.add("Developer");
		roles.add("Account");
		ComboBox<String> roleComboBox = new ComboBox<>("Select Role");
		roleComboBox.setItems(roles);
		form.addComponent(roleComboBox);

		Button buttonAdd = new Button("Add");
		buttonAdd.setIcon(FontAwesome.AMAZON);
		form.addComponent(buttonAdd);
		setContent(form);
		return form;
	}
}
