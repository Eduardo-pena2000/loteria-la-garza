package org.apache.tika.sax;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Locale;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ToTextContentHandler extends DefaultHandler {
    private static final String SCRIPT = "SCRIPT";
    private static final String STYLE = "STYLE";
    private int scriptDepth;
    private int styleDepth;
    private final Writer writer;

    public ToTextContentHandler(Writer writer) {
        this.styleDepth = 0;
        this.scriptDepth = 0;
        this.writer = writer;
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        if (this.styleDepth + this.scriptDepth != 0) {
            return;
        }
        try {
            this.writer.write(cArr, i, i2);
        } catch (IOException e) {
            throw new SAXException("Error writing: " + new String(cArr, i, i2), e);
        }
    }

    public void endDocument() throws SAXException {
        try {
            this.writer.flush();
        } catch (IOException e) {
            throw new SAXException("Error flushing character output", e);
        }
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        String upperCase = str3 == null ? "" : str3.toUpperCase(Locale.ENGLISH);
        if (upperCase.equals("STYLE")) {
            this.styleDepth--;
        }
        if (upperCase.equals("SCRIPT")) {
            this.scriptDepth--;
        }
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        characters(cArr, i, i2);
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        String upperCase = str3 == null ? "" : str3.toUpperCase(Locale.ENGLISH);
        if (upperCase.equals("STYLE")) {
            this.styleDepth++;
        }
        if (upperCase.equals("SCRIPT")) {
            this.scriptDepth++;
        }
    }

    public String toString() {
        return this.writer.toString();
    }

    public ToTextContentHandler(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        this(new OutputStreamWriter(outputStream, str));
    }

    public ToTextContentHandler() {
        this(new StringWriter());
    }
}
