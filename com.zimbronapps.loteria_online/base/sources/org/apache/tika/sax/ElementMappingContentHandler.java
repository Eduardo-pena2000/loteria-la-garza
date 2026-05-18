package org.apache.tika.sax;

import java.util.Collections;
import java.util.Map;
import javax.xml.namespace.QName;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ElementMappingContentHandler extends ContentHandlerDecorator {
    private final Map mappings;

    public ElementMappingContentHandler(ContentHandler contentHandler, Map map) {
        super(contentHandler);
        this.mappings = map;
    }

    public static final String getQNameAsString(QName qName) {
        String prefix = qName.getPrefix();
        if (prefix.length() <= 0) {
            return qName.getLocalPart();
        }
        return prefix + ":" + qName.getLocalPart();
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        TargetElement targetElement = (TargetElement) this.mappings.get(new QName(str, str2));
        if (targetElement != null) {
            QName mappedTagName = targetElement.getMappedTagName();
            super.endElement(mappedTagName.getNamespaceURI(), mappedTagName.getLocalPart(), getQNameAsString(mappedTagName));
        }
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        TargetElement targetElement = (TargetElement) this.mappings.get(new QName(str, str2));
        if (targetElement != null) {
            QName mappedTagName = targetElement.getMappedTagName();
            super.startElement(mappedTagName.getNamespaceURI(), mappedTagName.getLocalPart(), getQNameAsString(mappedTagName), targetElement.mapAttributes(attributes));
        }
    }

    public static class TargetElement {
        private final Map attributesMapping;
        private final QName mappedTagName;

        public TargetElement(QName qName, Map map) {
            this.mappedTagName = qName;
            this.attributesMapping = map;
        }

        public Map getAttributesMapping() {
            return this.attributesMapping;
        }

        public QName getMappedTagName() {
            return this.mappedTagName;
        }

        public Attributes mapAttributes(Attributes attributes) {
            AttributesImpl attributesImpl = new AttributesImpl();
            for (int i = 0; i < attributes.getLength(); i++) {
                QName qName = (QName) this.attributesMapping.get(new QName(attributes.getURI(i), attributes.getLocalName(i)));
                if (qName != null) {
                    attributesImpl.addAttribute(qName.getNamespaceURI(), qName.getLocalPart(), ElementMappingContentHandler.getQNameAsString(qName), attributes.getType(i), attributes.getValue(i));
                }
            }
            return attributesImpl;
        }

        public TargetElement(String str, String str2, Map map) {
            this(new QName(str, str2), map);
        }

        public TargetElement(QName qName) {
            this(qName, Collections.emptyMap());
        }

        public TargetElement(String str, String str2) {
            this(str, str2, Collections.emptyMap());
        }
    }
}
