package org.apache.tika.extractor;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RUnpackExtractorFactory implements EmbeddedDocumentByteStoreExtractorFactory {
    public static long DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION = 10737418240L;
    private Set embeddedBytesExcludeEmbeddedResourceTypes;
    private Set embeddedBytesExcludeMimeTypes;
    private Set embeddedBytesIncludeEmbeddedResourceTypes;
    private Set embeddedBytesIncludeMimeTypes;
    private long maxEmbeddedBytesForExtraction;
    private boolean writeFileNameToContent = true;

    public RUnpackExtractorFactory() {
        Set set = Collections.EMPTY_SET;
        this.embeddedBytesIncludeMimeTypes = set;
        this.embeddedBytesExcludeMimeTypes = set;
        this.embeddedBytesIncludeEmbeddedResourceTypes = set;
        this.embeddedBytesExcludeEmbeddedResourceTypes = set;
        this.maxEmbeddedBytesForExtraction = DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION;
    }

    private EmbeddedBytesSelector createEmbeddedBytesSelector() {
        return (this.embeddedBytesIncludeMimeTypes.size() == 0 && this.embeddedBytesExcludeMimeTypes.size() == 0 && this.embeddedBytesIncludeEmbeddedResourceTypes.size() == 0 && this.embeddedBytesExcludeEmbeddedResourceTypes.size() == 0) ? EmbeddedBytesSelector.ACCEPT_ALL : new BasicEmbeddedBytesSelector(this.embeddedBytesIncludeMimeTypes, this.embeddedBytesExcludeMimeTypes, this.embeddedBytesIncludeEmbeddedResourceTypes, this.embeddedBytesExcludeEmbeddedResourceTypes);
    }

    public EmbeddedDocumentExtractor newInstance(Metadata metadata, ParseContext parseContext) {
        RUnpackExtractor rUnpackExtractor = new RUnpackExtractor(parseContext, this.maxEmbeddedBytesForExtraction);
        rUnpackExtractor.setWriteFileNameToContent(this.writeFileNameToContent);
        rUnpackExtractor.setEmbeddedBytesSelector(createEmbeddedBytesSelector());
        return rUnpackExtractor;
    }

    @Field
    public void setEmbeddedBytesExcludeEmbeddedResourceTypes(List list) {
        HashSet hashSet = new HashSet();
        this.embeddedBytesExcludeEmbeddedResourceTypes = hashSet;
        hashSet.addAll(list);
    }

    @Field
    public void setEmbeddedBytesExcludeMimeTypes(List list) {
        HashSet hashSet = new HashSet();
        this.embeddedBytesExcludeMimeTypes = hashSet;
        hashSet.addAll(list);
    }

    @Field
    public void setEmbeddedBytesIncludeEmbeddedResourceTypes(List list) {
        HashSet hashSet = new HashSet();
        this.embeddedBytesIncludeEmbeddedResourceTypes = hashSet;
        hashSet.addAll(list);
    }

    @Field
    public void setEmbeddedBytesIncludeMimeTypes(List list) {
        HashSet hashSet = new HashSet();
        this.embeddedBytesIncludeMimeTypes = hashSet;
        hashSet.addAll(list);
    }

    @Field
    public void setMaxEmbeddedBytesForExtraction(long j) throws TikaConfigException {
        if (j < 0) {
            throw new TikaConfigException("maxEmbeddedBytesForExtraction must be >= 0");
        }
        this.maxEmbeddedBytesForExtraction = j;
    }

    @Field
    public void setWriteFileNameToContent(boolean z) {
        this.writeFileNameToContent = z;
    }
}
