package dev.ali.runnerz.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;


@Repository
public class RunRepository {
	
	private List<Run> runs= new ArrayList();
	
	List<Run> findAll(){
		return runs;
	}
	
	
	Optional<Run> findById(Integer id) {
		return runs.stream().filter(run->run.id() == id).findFirst();
	}
	
	
	void create(Run run) {
	runs.add(run);
	}
	
	void update(Run run,Integer id) {
		Optional<Run> existingRun = findById(id);
		if(existingRun.isPresent()) {
			runs.set(runs.indexOf(existingRun), run);
		}
	}
	
	
	void delete(Integer id) {
		runs.removeIf(run -> run.id().equals(id));
	}
	
	@PostConstruct
	private void init() {
	    runs.add(new Run(
	        1,
	        "Morning Run",
	        LocalDateTime.of(2021, 1, 1, 6, 0),
	        LocalDateTime.of(2021, 1, 1, 7, 0),
	        5,
	        Location.OUTDOOR
	    ));

	    runs.add(new Run(
	        2,
	        "Evening Treadmill",
	        LocalDateTime.of(2021, 1, 2, 18, 30),
	        LocalDateTime.of(2021, 1, 2, 19, 0),
	        3,
	        Location.INDOOR
	    ));

	    runs.add(new Run(
	        3,
	        "Park Long Run",
	        LocalDateTime.of(2021, 1, 3, 5, 45),
	        LocalDateTime.of(2021, 1, 3, 7, 15),
	        10,
	        Location.OUTDOOR
	    ));

	    runs.add(new Run(
	        4,
	        "Recovery Run",
	        LocalDateTime.of(2021, 1, 4, 20, 0),
	        LocalDateTime.of(2021, 1, 4, 20, 30),
	        2,
	        Location.OUTDOOR
	    ));
	}


}
