package org.apache.tika.parser.external;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import org.apache.tika.exception.TikaException;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ExternalParsersConfigReader implements ExternalParsersConfigReaderMetKeys {
    private static String getString(Element element) {
        StringBuilder sb = new StringBuilder();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 3) {
                sb.append(item.getNodeValue());
            }
        }
        return sb.toString();
    }

    public static List read(InputStream inputStream) throws TikaException, IOException {
        try {
            return read(XMLReaderUtils.getDocumentBuilder().parse(new InputSource(inputStream)));
        } catch (SAXException e) {
            throw new TikaException("Invalid parser configuration", e);
        }
    }

    private static boolean readCheckTagAndCheck(Element element) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        String str = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Element item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = item;
                if (element2.getTagName().equals("command")) {
                    str = getString(element2);
                }
                if (element2.getTagName().equals("error-codes")) {
                    StringTokenizer stringTokenizer = new StringTokenizer(getString(element2), ",");
                    while (stringTokenizer.hasMoreElements()) {
                        try {
                            arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (str == null) {
            return true;
        }
        String[] split = str.split(" ");
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return ExternalParser.check(split, iArr);
    }

    private static Map readMetadataPatterns(Element element) {
        HashMap hashMap = new HashMap();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Element item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = item;
                if (element2.getTagName().equals("match")) {
                    hashMap.put(Pattern.compile(getString(element2)), element2.getAttribute("key"));
                }
            }
        }
        return hashMap;
    }

    private static Set readMimeTypes(Element element) {
        HashSet hashSet = new HashSet();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Element item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = item;
                if (element2.getTagName().equals("mime-type")) {
                    hashSet.add(MediaType.parse(getString(element2)));
                }
            }
        }
        return hashSet;
    }

    private static ExternalParser readParser(Element element) throws TikaException {
        Element element2;
        ExternalParser externalParser = new ExternalParser();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Element item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                element2 = item;
                String tagName = element2.getTagName();
                tagName.hashCode();
                switch (tagName) {
                    case "metadata":
                        externalParser.setMetadataExtractionPatterns(readMetadataPatterns(element2));
                        break;
                    case "check":
                        if (!readCheckTagAndCheck(element2)) {
                            return null;
                        }
                        break;
                    case "command":
                        externalParser.setCommand(getString(element2));
                        break;
                    case "mime-types":
                        externalParser.setSupportedTypes(readMimeTypes(element2));
                        break;
                    default:
                        throw new IllegalArgumentException("reaction not defined for " + element2.getTagName());
                }
            }
        }
        return externalParser;
    }

    public static List read(Document document) throws TikaException, IOException {
        return read(document.getDocumentElement());
    }

    public static List read(Element element) throws TikaException, IOException {
        ExternalParser readParser;
        ArrayList arrayList = new ArrayList();
        if (element != null && element.getTagName().equals("external-parsers")) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Element item = childNodes.item(i);
                if (item.getNodeType() == 1) {
                    Element element2 = item;
                    if (element2.getTagName().equals("parser") && (readParser = readParser(element2)) != null) {
                        arrayList.add(readParser);
                    }
                }
            }
            return arrayList;
        }
        throw new MimeTypeException("Not a <external-parsers/> configuration document: " + (element != null ? element.getTagName() : "n/a"));
    }
}
