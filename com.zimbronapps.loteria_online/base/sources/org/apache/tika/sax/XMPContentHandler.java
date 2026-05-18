package org.apache.tika.sax;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class XMPContentHandler extends SafeContentHandler {
    private static final Attributes EMPTY_ATTRIBUTES = new AttributesImpl();
    public static final String RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
    public static final String XMP = "http://ns.adobe.com/xap/1.0/";
    private String prefix;
    private String uri;

    public XMPContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        this.prefix = null;
        this.uri = null;
    }

    private void description(Metadata metadata, String str, String str2) throws SAXException {
        int i = 0;
        for (Property property : Property.getProperties(str)) {
            String str3 = metadata.get(property);
            if (str3 != null) {
                int i2 = i + 1;
                if (i == 0) {
                    startDescription("", str, str2);
                }
                property(property.getName().substring(str.length() + 1), str3);
                i = i2;
            }
        }
        if (i > 0) {
            endDescription();
        }
    }

    public void endDescription() throws SAXException {
        endElement("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "Description", "rdf:Description");
        endPrefixMapping(this.prefix);
        this.uri = null;
        this.prefix = null;
    }

    public void endDocument() throws SAXException {
        endElement("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "RDF", "rdf:RDF");
        endPrefixMapping("xmp");
        endPrefixMapping("rdf");
        super.endDocument();
    }

    public void metadata(Metadata metadata) throws SAXException {
        description(metadata, "xmp", "http://ns.adobe.com/xap/1.0/");
        description(metadata, "dc", "http://purl.org/dc/elements/1.1/");
        description(metadata, "xmpTPg", "http://ns.adobe.com/xap/1.0/t/pg/");
        description(metadata, "xmpRigths", "http://ns.adobe.com/xap/1.0/rights/");
        description(metadata, "xmpMM", "http://ns.adobe.com/xap/1.0/mm/");
        description(metadata, "xmpidq", "http://ns.adobe.com/xmp/identifier/qual/1.0/");
        description(metadata, "xmpBJ", "http://ns.adobe.com/xap/1.0/bj/");
        description(metadata, "xmpDM", "http://ns.adobe.com/xmp/1.0/DynamicMedia/");
        description(metadata, "pdf", "http://ns.adobe.com/pdf/1.3/");
        description(metadata, "photoshop", "s http://ns.adobe.com/photoshop/1.0/");
        description(metadata, "crs", "http://ns.adobe.com/camera-raw-settings/1.0/");
        description(metadata, "tiff", "http://ns.adobe.com/tiff/1.0/");
        description(metadata, "exif", "http://ns.adobe.com/exif/1.0/");
        description(metadata, "aux", "http://ns.adobe.com/exif/1.0/aux/");
    }

    public void property(String str, String str2) throws SAXException {
        String str3 = this.prefix + ":" + str;
        startElement(this.uri, str, str3, EMPTY_ATTRIBUTES);
        characters(str2.toCharArray(), 0, str2.length());
        endElement(this.uri, str, str3);
    }

    public void startDescription(String str, String str2, String str3) throws SAXException {
        this.prefix = str2;
        this.uri = str3;
        startPrefixMapping(str2, str3);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "about", "rdf:about", "CDATA", str);
        startElement("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "Description", "rdf:Description", attributesImpl);
    }

    public void startDocument() throws SAXException {
        super.startDocument();
        startPrefixMapping("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        startPrefixMapping("xmp", "http://ns.adobe.com/xap/1.0/");
        startElement("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "RDF", "rdf:RDF", EMPTY_ATTRIBUTES);
    }
}
