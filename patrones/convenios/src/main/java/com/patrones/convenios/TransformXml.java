package com.patrones.convenios;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;

@Service
public class TransformXml {

    public String transform(String xml, String xslt) throws Exception {
        String userHome = System.getProperty("user.home");

        String xmlPath = String.format("%s/archivos/%s", userHome, xml);
        File xmlFile = new File(xmlPath);
        FileInputStream xmlInputStream = new FileInputStream(xmlFile);
        String xsltPath = String.format("%s/convenios/%s", userHome, xslt);

        File xsltFile = new File(xsltPath);
        FileInputStream xsltInputStream = new FileInputStream(xsltFile);

        TransformerFactory factory = TransformerFactory.newInstance();
        StreamSource xsltStreamSource = new StreamSource(xsltInputStream);
        Transformer transformer = factory.newTransformer(xsltStreamSource);

        StreamSource xmlStreamSource = new StreamSource(xmlInputStream);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(xmlStreamSource, result);

        return writer.toString();

    }

}
