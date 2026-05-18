package org.apache.tika.sax;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class EndDocumentShieldingContentHandler extends ContentHandlerDecorator {
    private boolean endDocumentCalled;

    public EndDocumentShieldingContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        this.endDocumentCalled = false;
    }

    public void endDocument() throws SAXException {
        this.endDocumentCalled = true;
    }

    public boolean isEndDocumentWasCalled() {
        return this.endDocumentCalled;
    }

    public void reallyEndDocument() throws SAXException {
        super.endDocument();
    }
}
