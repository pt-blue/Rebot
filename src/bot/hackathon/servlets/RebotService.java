package bot.hackathon.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bot.hackathon.entity.Reservation;
import bot.hackathon.entity.ReservationResponse;

/**
 * Servlet implementation class RebotService
 */
public class RebotService extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RebotService() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			Reservation reservation = new Reservation();
			
			Date deptDate = (Date) request.getAttribute("deptDate");
			String destination = (String) request.getAttribute("destination");
			String origin = (String) request.getAttribute("origin");
			
			reservation.setDeptdate(deptDate);
			reservation.setDestination(destination);
			reservation.setOrigin(origin);
			
			HashMap<String, String> data = new HashMap<String , String>();
			data.put("airline", "indigo");
			data.put("date", deptDate.toString());
			data.put("destination", destination);
			data.put("origin", origin);
			
			List<String> context = new ArrayList<String>();
			context = null;
			
			ReservationResponse reservationResponse = new ReservationResponse();
			reservationResponse.setSpeech("Hi I'm Rebot.");
			reservationResponse.setDisplayText("Welcome to Rebot");
			reservationResponse.setData(data);
			reservationResponse.setContextOut(context);
			reservationResponse.setSource("Airlines");
		
			String jsonObj;
			Gson gson = new GsonBuilder().create();		
			jsonObj = gson.toJson(reservationResponse);
			response.setContentType(jsonObj);
	}

}
