package org.apache.tika.fork;

import org.apache.tika.metadata.Metadata;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class MetadataContentHandler extends DefaultHandler {
    private final Metadata metadata;

    public MetadataContentHandler(Metadata metadata) {
        this.metadata = metadata;
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if ("meta".equals(str2)) {
            this.metadata.add(attributes.getValue("name"), attributes.getValue("content"));
        }
    }
}
