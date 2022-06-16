package mundo;


import java.util.HashMap;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Usuario {
	private String name;
	private String age;
	private String address;
	private String city;
	private String email;
	private Map<Integer, Cars> cars;
	private Map<Integer, Heroes> heroes;

	public Usuario(String name, String age, String address, String city, String email) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.city = city;
		this.email = email;
		this.cars = new HashMap<Integer, Cars>();
		this.heroes = new HashMap<Integer, Heroes>();
	}

	public Usuario() {
		this.cars = new HashMap<Integer, Cars>();
		this.heroes = new HashMap<Integer, Heroes>();
	}

	public void leer(String ruta) {
		JSONParser jsonParse = new JSONParser();
		
		try (FileReader reader = new FileReader(ruta)) {
			Object object = jsonParse.parse(reader);
			JSONArray usuarioList = (JSONArray) object;

			for (Object user : usuarioList) {
				agregarrCarsAndHeroes((JSONObject) user);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException a) {
			a.printStackTrace();
		} catch (ParseException b) {
			b.printStackTrace();
		}
	}

	public void agregarrCarsAndHeroes(JSONObject jsonObject) {
		JSONObject user = (JSONObject) jsonObject.get("usuario");

		String name = (String) user.get("name");

		String age = (String) user.get("age");

		String address = (String) user.get("address");

		String mail = (String) user.get("mail");

		String city = (String) user.get("city");

		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
		this.setEmail(mail);
		this.setCity(city);

		JSONArray cars = (JSONArray) user.get("cars");
		int contador = 0;
		for (Object car : cars) {
			contador++;
			JSONObject c = (JSONObject) car;
			String nameCar = (String) c.get("Name");
			String miles_per_Gallon = String.valueOf(c.get("Miles_per_Gallon"));
			String cylinders = String.valueOf(c.get("Cylinders"));
			String displacement = String.valueOf(c.get("Displacement"));
			String horsepower = String.valueOf(c.get("Horsepower"));
			String weight_in_lbs = String.valueOf(c.get("Weight_in_lbs"));
			String acceleration = String.valueOf(c.get("Acceleration"));
			String year = (String) c.get("Year");
			String origin = (String) c.get("Origin");

			Cars carro = new Cars(nameCar, miles_per_Gallon, cylinders, displacement, horsepower, weight_in_lbs,
					acceleration, year, origin);

			this.cars.put(contador, carro);
		}

		JSONArray heroes = (JSONArray) user.get("heroes");

		int conteo = 0;
		for (Object heroe : heroes) {
			JSONObject h = (JSONObject) heroe;
			conteo++;
			String superhero = (String) h.get("superhero");
			String publisher = (String) h.get("publisher");
			String alter_ego = (String) h.get("alter_ego");
			String first_appearance = (String) h.get("first_appearance");
			String characters = (String) h.get("characters");

			Heroes hero = new Heroes(superhero, publisher, alter_ego, first_appearance, characters);
			this.heroes.put(conteo, hero);
		}

	}

	public Cars buscarCarro(String nombre) {

		Object[] objectArray = this.cars.values().toArray();
		for (Object car : objectArray) {
			Cars carro = (Cars) car;
			if (carro.getName().equals(nombre)) {
				return carro;
			}
		}
		return null;
	}
	
	public Map<Integer, Cars> buscarCarroPorOrigen(String origen) {
		int contador = 0;
		Map<Integer, Cars> cars = new HashMap<Integer, Cars>();
		Object[] objectArray = this.cars.values().toArray();
		for (Object car : objectArray) {
			contador++;
			Cars carro = (Cars) car;
			if (carro.getOrigin().equals(origen)) {
				cars.put(contador, carro);
			}
		}
		return cars;
	}

	public Heroes buscarHeroe(String nombre) {

		Object[] objectArray = this.heroes.values().toArray();
		for (Object hero : objectArray) {
			Heroes heroe = (Heroes) hero;
			if (heroe.getSuperhero().equals(nombre)) {
				return heroe;
			}
		}
		return null;
	}
	
	public Map<Integer, Heroes> buscarHeorePorPublicista(String publicista) {
		int contador = 0;
		Map<Integer, Heroes> heros = new HashMap<Integer, Heroes>();
		Object[] objectArray = this.heroes.values().toArray();
		for (Object hero : objectArray) {
			contador++;
			Heroes heroe = (Heroes) hero;
			if (heroe.getPublisher().equals(publicista)) {
				heros.put(contador, heroe);
			}
		}
		return heros;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<Integer, Cars> getCars() {
		return cars;
	}

	public void setCars(Map<Integer, Cars> cars) {
		this.cars = cars;
	}

	public Map<Integer, Heroes> getHeroes() {
		return heroes;
	}

	public void setHeroes(Map<Integer, Heroes> heroes) {
		this.heroes = heroes;
	}

}
