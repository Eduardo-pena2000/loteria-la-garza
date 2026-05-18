package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class StandardsExtractingContentHandler extends ContentHandlerDecorator {
    public static final String STANDARD_REFERENCES = "standard_references";
    private int maxBufferLength;
    private final Metadata metadata;
    private final StringBuilder stringBuilder;
    private double threshold;

    public StandardsExtractingContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.maxBufferLength = 100000;
        this.threshold = 0.0d;
        this.metadata = metadata;
        this.stringBuilder = new StringBuilder();
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        int length;
        try {
            int i3 = this.maxBufferLength;
            if (i3 > -1 && (length = i3 - this.stringBuilder.length()) <= i2) {
                i2 = length;
            }
            this.stringBuilder.append(new String(Arrays.copyOfRange(cArr, i, i + i2)));
            super.characters(cArr, i, i2);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void endDocument() throws SAXException {
        super.endDocument();
        Iterator it = StandardsText.extractStandardReferences(this.stringBuilder.toString(), this.threshold).iterator();
        while (it.hasNext()) {
            this.metadata.add("standard_references", ((StandardReference) it.next()).toString());
        }
    }

    public double getThreshold() {
        return this.threshold;
    }

    public void setMaxBufferLength(int i) {
        this.maxBufferLength = i;
    }

    public void setThreshold(double d) {
        this.threshold = d;
    }

    public StandardsExtractingContentHandler() {
        this(new DefaultHandler(), new Metadata());
    }
}
