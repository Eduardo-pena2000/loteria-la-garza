package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PhoneExtractingContentHandler extends ContentHandlerDecorator {
    private static final String PHONE_NUMBERS = "phonenumbers";
    private final Metadata metadata;
    private final StringBuilder stringBuilder;

    public PhoneExtractingContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.metadata = metadata;
        this.stringBuilder = new StringBuilder();
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        try {
            this.stringBuilder.append(new String(Arrays.copyOfRange(cArr, i, i + i2)));
            super.characters(cArr, i, i2);
        } catch (SAXException e) {
            handleException(e);
        }
    }

    public void endDocument() throws SAXException {
        super.endDocument();
        Iterator it = CleanPhoneText.extractPhoneNumbers(this.stringBuilder.toString()).iterator();
        while (it.hasNext()) {
            this.metadata.add("phonenumbers", (String) it.next());
        }
    }

    public PhoneExtractingContentHandler() {
        this(new DefaultHandler(), new Metadata());
    }
}
