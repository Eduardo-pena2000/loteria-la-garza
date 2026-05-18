package org.apache.tika.sax;

import java.io.Serializable;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.xml.sax.ContentHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ContentHandlerDecoratorFactory extends Serializable {
    ContentHandler decorate(ContentHandler contentHandler, Metadata metadata, ParseContext parseContext);
}
