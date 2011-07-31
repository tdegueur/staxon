package de.odysseus.staxon.util;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.util.StreamReaderDelegate;

/**
 * Filter an {@link XMLStreamWriter}.
 * Counterpart to {@link StreamReaderDelegate}.
 */
public class StreamWriterDelegate implements XMLStreamWriter {
	private XMLStreamWriter parent;

	public StreamWriterDelegate() {
		super();
	}
	
	public StreamWriterDelegate(XMLStreamWriter parent) {
		this.parent = parent;
	}
	
	public XMLStreamWriter getParent() {
		return parent;
	}
	
	public void setParent(XMLStreamWriter parent) {
		this.parent = parent;
	}
	
	public void close() throws XMLStreamException {
		parent.close();
	}

	public void flush() throws XMLStreamException {
		parent.flush();
	}

	public NamespaceContext getNamespaceContext() {
		return parent.getNamespaceContext();
	}

	public String getPrefix(String uri) throws XMLStreamException {
		return parent.getPrefix(uri);
	}

	public Object getProperty(String name) throws IllegalArgumentException {
		return parent.getProperty(name);
	}

	public void setDefaultNamespace(String uri) throws XMLStreamException {
		parent.setDefaultNamespace(uri);
	}

	public void setNamespaceContext(NamespaceContext context) throws XMLStreamException {
		parent.setNamespaceContext(context);
	}

	public void setPrefix(String prefix, String uri) throws XMLStreamException {
		parent.setPrefix(prefix, uri);
	}

	public void writeAttribute(String prefix, String namespaceURI, String localName, String value) throws XMLStreamException {
		parent.writeAttribute(prefix, namespaceURI, localName, value);
	}

	public void writeAttribute(String namespaceURI, String localName, String value) throws XMLStreamException {
		parent.writeAttribute(namespaceURI, localName, value);
	}

	public void writeAttribute(String localName, String value) throws XMLStreamException {
		parent.writeAttribute(localName, value);
	}

	public void writeCData(String data) throws XMLStreamException {
		parent.writeCData(data);
	}

	public void writeCharacters(char[] text, int start, int len) throws XMLStreamException {
		parent.writeCharacters(text, start, len);
	}

	public void writeCharacters(String text) throws XMLStreamException {
		parent.writeCharacters(text);
	}

	public void writeComment(String data) throws XMLStreamException {
		parent.writeComment(data);
	}

	public void writeDefaultNamespace(String namespaceURI) throws XMLStreamException {
		parent.writeDefaultNamespace(namespaceURI);
	}

	public void writeDTD(String dtd) throws XMLStreamException {
		parent.writeDTD(dtd);
	}

	public void writeEmptyElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		parent.writeEmptyElement(prefix, localName, namespaceURI);
	}

	public void writeEmptyElement(String namespaceURI, String localName) throws XMLStreamException {
		parent.writeEmptyElement(namespaceURI, localName);
	}

	public void writeEmptyElement(String localName) throws XMLStreamException {
		parent.writeEmptyElement(localName);
	}

	public void writeEndDocument() throws XMLStreamException {
		parent.writeEndDocument();
	}

	public void writeEndElement() throws XMLStreamException {
		parent.writeEndElement();
	}

	public void writeEntityRef(String name) throws XMLStreamException {
		parent.writeEntityRef(name);
	}

	public void writeNamespace(String prefix, String namespaceURI) throws XMLStreamException {
		parent.writeNamespace(prefix, namespaceURI);
	}

	public void writeProcessingInstruction(String target, String data) throws XMLStreamException {
		parent.writeProcessingInstruction(target, data);
	}

	public void writeProcessingInstruction(String target) throws XMLStreamException {
		parent.writeProcessingInstruction(target);
	}

	public void writeStartDocument() throws XMLStreamException {
		parent.writeStartDocument();
	}

	public void writeStartDocument(String encoding, String version) throws XMLStreamException {
		parent.writeStartDocument(encoding, version);
	}

	public void writeStartDocument(String version) throws XMLStreamException {
		parent.writeStartDocument(version);
	}

	public void writeStartElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		parent.writeStartElement(prefix, localName, namespaceURI);
	}

	public void writeStartElement(String namespaceURI, String localName) throws XMLStreamException {
		parent.writeStartElement(namespaceURI, localName);
	}

	public void writeStartElement(String localName) throws XMLStreamException {
		parent.writeStartElement(localName);
	}
}