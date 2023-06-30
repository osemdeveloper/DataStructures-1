package LinkedLists;

import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//import org.json.JSONArray;
//import org.json.JSONObject;

class Element {
	String name;
	Element next;

	public Element(String name) {
		this.name = name;
		this.next = null;
	}
}

class PeriodicTable {
	Element head;

	public void addElement(String name) {
		Element newElement = new Element(name);

		if (head == null) {
			head = newElement;
		} else {
			Element current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newElement;
		}
	}

	public int getLength() {
		int count = 0;
		Element current = head;

		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void printElemens() {
		Element current = head;

		if (current == null) {
			System.out.println("Periodic table is empty");
		} else {
			System.out.println("Elements in Periodic Table:");
			while (current != null) {
				System.out.println("Element: " + current.name);
				current = current.next;
			}
		}
	}
}

public class ArgonElementsLength {

	public static void main(String[] args) {
		PeriodicTable periodicTable = new PeriodicTable();
		
		try {
			String apiUrl = "https://neelpatel05.pythonanywhere.com/get_all_elements";
			URL url =new URL(apiUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder response = new StringBuilder();
				String line;
				
				while((line = reader.readLine()) != null) {
					response.append(line);
				}
				
				reader.close();
				
//				JSONArray elementsArray = new JSONArray(response.toString());
			}
		} else {
			System.out.println("adbhsvkfv");
		}
	}

}
