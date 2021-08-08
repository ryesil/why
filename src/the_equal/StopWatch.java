package the_equal;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StopWatch {
private long startTime;
private long endTime;

public long getStartTime() {
	return this.startTime;
}
public long getEndTime() {
	return this.endTime;
}
//DateTimeFormatter formatter=DateTimeFormatter.ofPattern("mm:ss");
//LocalTime time=LocalTime.now();


public StopWatch() {
	
	startTime=System.currentTimeMillis();
	
}
	
public long start() {
	return this.startTime=System.currentTimeMillis();
}
	
public long end() {
	return this.endTime=System.currentTimeMillis();
}

public long elapsed() {
	return endTime-startTime;
}

}
