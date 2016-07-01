package com.grenbur.fafrando.client;

import java.util.LinkedList;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Fafrando implements EntryPoint{
	List<String> matchStrings;
	List<Label> matchName;
	TextBox placeField;
	LinkedList<Image> image;

	public int searchPlace(String name){
		matchStrings.clear();
		int index = 0;
		for (int i = 0; i < Places.getSize(); ++i){
			if ( Places.getName(i).toLowerCase().contains(name.toLowerCase()) ){
				matchStrings.add(Places.getName(i));
				index = i;
			}
		}
		return index;
	}
	
	public void resize(){
		double ratio;
		int w, h;
		for(int i = 0; i < image.size(); ++i){
			/*ratio = image.get(i).getHeight()/image.get(i).getWidth();
			w = (int)Math.round(RootPanel.getBodyElement().getClientWidth()*0.80);
			h = (int)(image.get(i).getHeight()*ratio);
			image.get(i).setPixelSize(w, h);*/
			//image.get(i).setSize("90vw", "90hw");
			image.get(i).setWidth("90vw");
			RootPanel.get("placesContainer").add(image.get(i));
		}
	}

	public void refresh(int index){
		RootPanel.get("placesContainer").clear();
		matchName.clear();
		image.clear();
		String[] files;
		if (matchStrings.size() > 0 && matchStrings.size() < 20){
			for (int i = 0; i < matchStrings.size(); ++i){
				matchName.add(new Label(matchStrings.get(i)));
				matchName.get(i).setWidth("50vw");
				//matchName.get(i).addStyleName("gwt-Black-Border");
				RootPanel.get("placesContainer").add(matchName.get(i));
				matchName.get(i).addClickHandler(new selectPlace(matchStrings.get(i)));
			}
			if (matchStrings.size() == 1) {
				files = Places.getFile(index);
				for(int i = 0; i < files.length; ++i){
					image.add(new Image(files[i]));
					//image.get(i).setUrl(files[i]);
					image.get(i).setWidth("90vw");
					RootPanel.get("placesContainer").add(image.get(i));
				}
			}
		}
	}

	public void onModuleLoad() {
		matchStrings = new LinkedList<String>();
		matchName = new LinkedList<Label>();
		placeField = new TextBox();
		image = new LinkedList<Image>();
		
		/*Window.addResizeHandler(new ResizeHandler() {

			  Timer resizeTimer = new Timer() {  
			    @Override
			    public void run() {
			    	resize();
			    }
			  };

			  @Override
			  public void onResize(ResizeEvent event) {
			    resizeTimer.cancel();
			    resizeTimer.schedule(250);
			  }
			});*/
		
		placeField.setText("Nom du lieu à trouver");
		//Label errorLabel = new Label();

		RootPanel.get("nameFieldContainer").add(placeField);

		//RootPanel.get("errorLabelContainer").add(errorLabel);

		// Focus the cursor on the name field when the app loads
		placeField.setFocus(true);
		placeField.selectAll();

		placeField.addKeyUpHandler(new PlaceChange(placeField, matchStrings));
	}

	class PlaceChange implements KeyUpHandler{
		TextBox placeField;
		List<String> matchStrings;

		public PlaceChange(TextBox placeField, List<String> matchStrings){
			super();
			this.placeField = placeField;
			this.matchStrings = matchStrings;
		}
		@Override
		public void onKeyUp(KeyUpEvent event) {
			refresh(searchPlace(placeField.getText()));
		}

	}

	class selectPlace implements ClickHandler{
		String name;
		public selectPlace(String name){
			this.name = name;
		}
		public void onClick(ClickEvent event) {
			placeField.setText(name);
			refresh(searchPlace(placeField.getText()));
		}

	}
}
