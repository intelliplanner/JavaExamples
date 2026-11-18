// Question find max population country and state

package company.toTheNew;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToTheNew {

    public static class Country{
        public String countryName;
        public List<State> states;
    }


    public static class State{
        public String stateName;
        public int population;
    }
    
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.countryName = "India";
        State state1 = new State();
        state1.stateName = "Haryana";
        state1.population = 1500;

        State state2 = new State();
        state2.stateName = "Rajashtan";
        state2.population = 900;

        State state3 = new State();
        state3.stateName = "Gujarat";
        state3.population = 900;
        country1.states = Arrays.asList(state1,state2,state3);// List.of(state1,state2,state3);

        Country country2 = new Country();
        country2.countryName = "America";
        State state4 = new State();
        state4.stateName = "Texas";
        state4.population = 1300;

        State state5 = new State();
        state5.stateName = "California";
        state5.population = 1400;

        State state6 = new State();
        state6.stateName = "Florida";
        state6.population = 1500;
        
        State state7 = new State();
        state7.stateName = "Floridas";
        state7.population = 1600;
        
        country2.states = Arrays.asList(state4,state5,state6,state7);// List.of(state4,state5,state6,state7);
        List<Country> countryList =  Arrays.asList(country1,country2); // List.of(country1,country2);
        HashMap<Integer, String> map = null;

        int maxPopulation = 0;
        String countryName = "";
        String stateName = "";	
        for(Country country : countryList) {
        	  for(State state: country.states) {        		       	
        		if(state.population >= maxPopulation) {
        			maxPopulation = state.population; 
        			countryName = country.countryName;
        	        stateName = state.stateName;
        	        map = new HashMap<>();
        		}
        	};
        	if(!map.containsKey(maxPopulation)) {
        		map.put(maxPopulation, countryName + ", "+stateName);
        	}
        	
        };
        
//       List<State> li =  countryList.stream().flatMap(list -> list.states.stream()).collect(Collectors.toList());
//       
//       li.forEach(str -> System.out.println(str.population + ", "+ str.stateName));
        
        System.out.println(map);
    }
}

