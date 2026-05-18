package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class SafeContentHandler extends ContentHandlerDecorator {
    private static final char[] REPLACEMENT = {65533};
    private final Output charactersOutput;
    private final Output ignorableWhitespaceOutput;

    public interface Output {
        void write(char[] cArr, int i, int i2) throws SAXException;
    }

    public static class StringOutput implements Output {
        private final StringBuilder builder;

        public /* synthetic */ StringOutput(c cVar) {
            this();
        }

        public String toString() {
            return this.builder.toString();
        }

        public void write(char[] cArr, int i, int i2) {
            this.builder.append(cArr, i, i2);
        }

        private StringOutput() {
            this.builder = new StringBuilder();
        }
    }

    public SafeContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        this.charactersOutput = new a(this);
        this.ignorableWhitespaceOutput = new b(this);
    }

    public static /* synthetic */ void a(SafeContentHandler safeContentHandler, char[] cArr, int i, int i2) {
        safeContentHandler.lambda$new$0(cArr, i, i2);
    }

    public static /* synthetic */ void access$001(SafeContentHandler safeContentHandler, char[] cArr, int i, int i2) throws SAXException {
        super.ignorableWhitespace(cArr, i, i2);
    }

    public static /* synthetic */ void access$101(SafeContentHandler safeContentHandler, char[] cArr, int i, int i2) throws SAXException {
        super.characters(cArr, i, i2);
    }

    public static /* synthetic */ void b(SafeContentHandler safeContentHandler, char[] cArr, int i, int i2) {
        safeContentHandler.lambda$new$1(cArr, i, i2);
    }

    private void filter(char[] cArr, int i, int i2, Output output) throws SAXException {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int codePointAt = Character.codePointAt(cArr, i, i3);
            int charCount = Character.charCount(codePointAt) + i;
            if (isInvalid(codePointAt)) {
                if (i > i4) {
                    output.write(cArr, i4, i - i4);
                }
                writeReplacement(output);
                i4 = charCount;
            }
            i = charCount;
        }
        output.write(cArr, i4, i3 - i4);
    }

    private /* synthetic */ void lambda$new$0(char[] cArr, int i, int i2) throws SAXException {
        access$101(this, cArr, i, i2);
    }

    private /* synthetic */ void lambda$new$1(char[] cArr, int i, int i2) throws SAXException {
        access$001(this, cArr, i, i2);
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        filter(cArr, i, i2, this.charactersOutput);
    }

    public void endDocument() throws SAXException {
        super.endDocument();
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        filter(cArr, i, i2, this.ignorableWhitespaceOutput);
    }

    public boolean isInvalid(int i) {
        return i < 32 ? (i == 9 || i == 10 || i == 13) ? false : true : i < 57344 ? i > 55295 : i < 65536 ? i > 65533 : i > 1114111;
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int i = 0;
        while (true) {
            if (i >= attributes.getLength()) {
                break;
            }
            if (isInvalid(attributes.getValue(i))) {
                Attributes attributesImpl = new AttributesImpl();
                for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                    String value = attributes.getValue(i2);
                    if (i2 >= i && isInvalid(value)) {
                        StringOutput stringOutput = new StringOutput(null);
                        filter(value.toCharArray(), 0, value.length(), stringOutput);
                        value = stringOutput.toString();
                    }
                    attributesImpl.addAttribute(attributes.getURI(i2), attributes.getLocalName(i2), attributes.getQName(i2), attributes.getType(i2), value);
                }
                attributes = attributesImpl;
            } else {
                i++;
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void writeReplacement(Output output) throws SAXException {
        char[] cArr = REPLACEMENT;
        output.write(cArr, 0, cArr.length);
    }

    private boolean isInvalid(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            int codePointAt = Character.codePointAt(charArray, i);
            if (isInvalid(codePointAt)) {
                return true;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }
}
