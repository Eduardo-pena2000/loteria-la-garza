package org.apache.tika.extractor;

import java.io.Serializable;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface EmbeddedDocumentExtractorFactory extends Serializable {
    EmbeddedDocumentExtractor newInstance(Metadata metadata, ParseContext parseContext);
}
