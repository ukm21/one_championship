package com.ukm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Pattern pattern = Pattern.compile(",");

		List<FloorAccessEvent> floorAccessEvents = null;
		try (BufferedReader in = new BufferedReader(new FileReader(args[0]))) {
			// processing code here

			floorAccessEvents = in.lines().skip(1).map(line -> {
				String[] x = pattern.split(line);

				return new FloorAccessEvent(x[0], x[1], Integer.parseInt(x[2]), x[3]);

			}).collect(Collectors.toList());

		}

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.writeValue(new File(args[1]), floorAccessEvents);
		System.out.println("csv to json converted successfully");
	}
}
