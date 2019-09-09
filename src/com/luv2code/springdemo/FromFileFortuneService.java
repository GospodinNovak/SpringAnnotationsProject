package com.luv2code.springdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import javax.annotation.PostConstruct;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FromFileFortuneService implements FortuneService {

	@Value("${fortunesFile}")
	private String filename;
	private List<String> fortunesFromFile = new ArrayList<String>();

	@Override
	public String getDailyFortune() {
		//String[] fortune = fortunes.trim().split("#");
		return fortunesFromFile.get(new Random().nextInt(fortunesFromFile.size()));
	}

	@PostConstruct
	public void init() {
		
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		try {
			InputStream in = new FileInputStream(this.filename);

			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			while (eventReader.hasNext()) {

				XMLEvent event = eventReader.nextEvent();
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart().equals("fortune")) {
						event = eventReader.nextEvent();
						fortunesFromFile.add(event.asCharacters().getData().trim());

					}
				}
			}

		} catch (XMLStreamException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
