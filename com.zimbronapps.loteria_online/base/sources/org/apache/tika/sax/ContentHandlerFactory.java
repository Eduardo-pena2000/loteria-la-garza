package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.xml.sax.ContentHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ContentHandlerFactory extends Serializable {
    ContentHandler getNewContentHandler();

    ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset);
}
