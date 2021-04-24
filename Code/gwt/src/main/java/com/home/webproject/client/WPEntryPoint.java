package com.home.webproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.data.Criteria;
import com.smartgwt.client.data.DSCallback;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DSResponse;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.types.DSDataFormat;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;

public class WPEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Canvas.resizeFonts(5);
		Canvas.resizeControls(5);
		RootPanel.get().add(getViewPanel());
	}

	String message;
	
	private Canvas getViewPanel() {
		
		DataSource dataSource = new DataSource();
		dataSource.setDataFormat(DSDataFormat.JSON);
		dataSource.setDataURL("api/getData");
		
		
		dataSource.fetchData(new Criteria(), new DSCallback() {
			@Override
			public void execute(DSResponse dsResponse, Object data, DSRequest dsRequest) {
				message = data.toString();
			}
		});
		
		VLayout layout = new VLayout();
		
		layout.addMember(
				new Label("This is a full-screen example - click the \"Show Example\" button to show fullscreen."));
		
		layout.addMember(
				new Label(message));
		
		return layout;
	}

}
