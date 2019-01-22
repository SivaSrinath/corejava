 package com.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmltoJavaObject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Product product = (Product) jaxbUnmarshaller.unmarshal(new File("C:\\Users\\sivas\\Documents\\product.xml"));
		System.out.println(product);

	}
	
	public static File loadFileFromResource(String fileName) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file;
	}

}
