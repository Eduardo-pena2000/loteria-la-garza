package org.apache.tika.sax;

import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TaggedSAXException extends SAXException {
    private final Object tag;

    public TaggedSAXException(SAXException sAXException, Object obj) {
        super(sAXException.getMessage(), sAXException);
        this.tag = obj;
    }

    public Object getTag() {
        return this.tag;
    }

    public SAXException getCause() {
        return super/*java.lang.Throwable*/.getCause();
    }
}
