package org.apache.tika.extractor;

import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParsingEmbeddedDocumentExtractorFactory implements EmbeddedDocumentExtractorFactory {
    private boolean writeFileNameToContent = true;

    public EmbeddedDocumentExtractor newInstance(Metadata metadata, ParseContext parseContext) {
        ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor = new ParsingEmbeddedDocumentExtractor(parseContext);
        parsingEmbeddedDocumentExtractor.setWriteFileNameToContent(this.writeFileNameToContent);
        return parsingEmbeddedDocumentExtractor;
    }

    @Field
    public void setWriteFileNameToContent(boolean z) {
        this.writeFileNameToContent = z;
    }
}
