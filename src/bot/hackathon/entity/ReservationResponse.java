package bot.hackathon.entity;

import java.util.HashMap;
import java.util.List;

public class ReservationResponse {

	private String speech;
	private String displayText;
	private HashMap<String, String> data;
	private List<String> contextOut;
	private String source;
	public String getSpeech() {
		return speech;
	}
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	public HashMap<String, String> getData() {
		return data;
	}
	public void setData(HashMap<String, String> data) {
		this.data = data;
	}
	public List<String> getContextOut() {
		return contextOut;
	}
	public void setContextOut(List<String> contextOut) {
		this.contextOut = contextOut;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
}
