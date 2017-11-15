package by.rentService3.logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.rentService3.entities.Equipment;
import by.rentService3.entities.RentUnit;
import by.rentService3.station.Catalog;
import by.rentService3.station.RentedCatalog;

public class FileStationLogicImpl implements StationLogic {
	private static final String FILE_PATH = "resources/station_info.txt";
	private static final String FILE_PATH_RENTED = "resources/rented_info.txt";
	private static final String DELIMETER = ",";
	private static final int DEFAULT_CAPACITY = 10;
	
	
	@Override
	public Catalog readCatalog() throws FileNotFoundException {

		Catalog catalog = new Catalog();
		String[] lines = readData(FILE_PATH);

		for (String line : lines) {
			RentUnit unit = createRentUnit(line);
			catalog.addRentUnit(unit);
		}
		return catalog;
	}

	private RentUnit createRentUnit(String line) {
		String [] values = getRentUnitValues(line);
		Equipment eq = new Equipment();
		eq.setTitle(values[0].trim());

		RentUnit unit = new RentUnit();
		unit.setEquipment(eq);
		unit.setHourRate(Double.parseDouble(values[1].trim()));
		return unit;
	}
	
	private String [] getRentUnitValues (String line) {
		String [] values = line.split(DELIMETER);
		return values;
	}

	private String[] readData(String file) {
		int lastLineIndex = 0;
		String[] lines = new String[DEFAULT_CAPACITY];
		BufferedReader br = null;
		try {
			// FileInputStream fis = new FileInputStream(file);
			// BufferedInputStream bis = new BufferedInputStream(fis);

			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			
			while ((line = br.readLine()) != null) {
				if(lastLineIndex>=lines.length) {
			lines = increaseCapacity(lines);		
				}
				lines[lastLineIndex] = line;
				lastLineIndex++;
			}
		} catch (IOException e) {
		}finally{
			try {
				br.close();
			} catch (IOException e) {
			e.printStackTrace();
		}
		}
		return trimDataToSize(lines, lastLineIndex);
	}
 
	
	private String [] increaseCapacity (String [] lines) {
		int currentLine = 0;
		String [] newLines = new String [lines.length + DEFAULT_CAPACITY];
		for (String  line:  lines) {
			newLines[currentLine] = line;
		}
		return newLines;
	}
	
	private String [] trimDataToSize(String [] lines, int linesCount) {
		int currentLine = 0;
		String[] trimmedLines = new String [linesCount];
		for (String line: lines) {
			if (line!=null) {
				trimmedLines [currentLine] = line;
				currentLine++;
			}	
		}
		return trimmedLines;
	}

	@Override
	public RentedCatalog readRentedCatalog() throws FileNotFoundException {
		RentedCatalog rentedCatalog = new RentedCatalog();
		String[] lines = readData(FILE_PATH_RENTED);

		for (String line : lines) {
			RentUnit unit = createRentUnit(line);
			rentedCatalog.addRentedUnit(unit);
		}
		return rentedCatalog;
	}
}

/*
 * try { int b; while((b = fis.read())!= -1) System.out.print((char)b);
 * 
 * } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } return new Catalog(); }
 */
