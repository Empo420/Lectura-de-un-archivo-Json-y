package Interfaz;

import java.util.Iterator;
import java.util.Map;
import mundo.Cars;
import mundo.Heroes;
import mundo.Usuario;

public class Prueba {


    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario();
        String ruta = "usuario.json";
        usuario.leer(ruta);
    
        System.out.println();
		System.out.println("----------- Usuario-------------------");
		System.out.println();
        System.out.println("name: " + usuario.getName());
        System.out.println("age: " + usuario.getAge());
        System.out.println("address: " + usuario.getAddress());
        System.out.println("city: " + usuario.getCity());
        System.out.println("mail: " + usuario.getEmail());
        System.out.println();
        System.out.println("----------- Lista de Carros -------------------");
		System.out.println();
		
		Iterator<Map.Entry<Integer, Cars>> cars = usuario.getCars().entrySet().iterator();
		while (cars.hasNext()) {
			Map.Entry<Integer, Cars> car = cars.next();
			System.out.println(car.getKey() + ":" + car.getValue());
		}
		
		System.out.println();
		System.out.println("----------- Lista de Heores-------------------");
		System.out.println();
		
		Iterator<Map.Entry<Integer, Heroes>> heroes = usuario.getHeroes().entrySet().iterator();
		while (heroes.hasNext()) {
			Map.Entry<Integer, Heroes> heore = heroes.next();
			System.out.println(heore.getKey() + ":" + heore.getValue());
		}
       
		System.out.println();
		System.out.println("----------- Bucar Auto-------------------");
		System.out.println();
		Cars carro = usuario.buscarCarro("chevy s-10");
		System.out.println("Carro encontrado: " + carro);
		
		System.out.println();
		System.out.println("----------- Bucar Carro por origen-------------------");
		System.out.println();
		
		Map<Integer, Cars> mapa = usuario.buscarCarroPorOrigen("Europe");
		Iterator<Map.Entry<Integer, Cars>> carros = mapa.entrySet().iterator();
		while (carros.hasNext()) {
			Map.Entry<Integer, Cars> carr = carros.next();
			System.out.println(carr.getKey() + ":" + carr.getValue());
		}
		
		System.out.println();
		System.out.println("----------- Bucar Heroe-------------------");
		System.out.println();
		Heroes heroe = usuario.buscarHeroe("Flash");
		System.out.println("Heore encontrado: " + heroe);
		
		System.out.println();
		System.out.println("----------- Bucar Heroe por Publicista-------------------");
		System.out.println();
		
		Map<Integer, Heroes> heros = usuario.buscarHeorePorPublicista("Marvel Comics");
		Iterator<Map.Entry<Integer, Heroes>> heores = heros.entrySet().iterator();
		while (heores.hasNext()) {
			Map.Entry<Integer, Heroes> obj = heores.next();
			System.out.println(obj.getKey() + ":" + obj.getValue());
		}
		
    }

   
    

}

