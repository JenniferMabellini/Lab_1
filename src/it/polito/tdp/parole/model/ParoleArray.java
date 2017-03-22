package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParoleArray {
		private List <String> parole = new ArrayList<String>();
			private String parola;
		public ParoleArray() {
			
		}
		
		
		public String getParola() {
			return parola;
		}


		public void setParola(String parola) {
			this.parola = parola;
		}


		public void addParola(String p) {
			parole.add(p);
		}
		
		public List<String> getElenco() {
			Collections.sort(parole);
			return parole;
		}
		
		public void reset() {
			parole.clear();
		}
		public void canParola(String p){
			parole.remove(p);
		}

	}

