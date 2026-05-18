package org.apache.tika.parser;

import java.io.IOException;
import java.io.Serializable;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.writefilter.MetadataWriteFilterFactory;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.sax.ContentHandlerDecoratorFactory;
import org.w3c.dom.Element;
import org.xml.sax.ContentHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AutoDetectParserConfig extends ConfigBase implements Serializable {
    private ContentHandlerDecoratorFactory contentHandlerDecoratorFactory;
    private DigestingParser.DigesterFactory digesterFactory;
    private EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory;
    private Long maximumCompressionRatio;
    private Integer maximumDepth;
    private Integer maximumPackageEntryDepth;
    private MetadataWriteFilterFactory metadataWriteFilterFactory;
    private Long outputThreshold;
    private Long spoolToDisk;
    private boolean throwOnZeroBytes;
    private static ContentHandlerDecoratorFactory NOOP_CONTENT_HANDLER_DECORATOR_FACTORY = new 1();
    public static AutoDetectParserConfig DEFAULT = new AutoDetectParserConfig();

    public class 1 implements ContentHandlerDecoratorFactory {
        public ContentHandler decorate(ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
            return contentHandler;
        }
    }

    public AutoDetectParserConfig(Long l, Long l2, Long l3, Integer num, Integer num2) {
        this.metadataWriteFilterFactory = null;
        this.embeddedDocumentExtractorFactory = null;
        this.contentHandlerDecoratorFactory = NOOP_CONTENT_HANDLER_DECORATOR_FACTORY;
        this.digesterFactory = null;
        this.throwOnZeroBytes = true;
        this.spoolToDisk = l;
        this.outputThreshold = l2;
        this.maximumCompressionRatio = l3;
        this.maximumDepth = num;
        this.maximumPackageEntryDepth = num2;
    }

    public static AutoDetectParserConfig load(Element element) throws TikaConfigException, IOException {
        return (AutoDetectParserConfig) ConfigBase.buildSingle("autoDetectParserConfig", AutoDetectParserConfig.class, element, DEFAULT);
    }

    public ContentHandlerDecoratorFactory getContentHandlerDecoratorFactory() {
        return this.contentHandlerDecoratorFactory;
    }

    public DigestingParser.DigesterFactory getDigesterFactory() {
        return this.digesterFactory;
    }

    public EmbeddedDocumentExtractorFactory getEmbeddedDocumentExtractorFactory() {
        return this.embeddedDocumentExtractorFactory;
    }

    public Long getMaximumCompressionRatio() {
        return this.maximumCompressionRatio;
    }

    public Integer getMaximumDepth() {
        return this.maximumDepth;
    }

    public Integer getMaximumPackageEntryDepth() {
        return this.maximumPackageEntryDepth;
    }

    public MetadataWriteFilterFactory getMetadataWriteFilterFactory() {
        return this.metadataWriteFilterFactory;
    }

    public Long getOutputThreshold() {
        return this.outputThreshold;
    }

    public Long getSpoolToDisk() {
        return this.spoolToDisk;
    }

    public boolean getThrowOnZeroBytes() {
        return this.throwOnZeroBytes;
    }

    public void setContentHandlerDecoratorFactory(ContentHandlerDecoratorFactory contentHandlerDecoratorFactory) {
        this.contentHandlerDecoratorFactory = contentHandlerDecoratorFactory;
    }

    public void setDigesterFactory(DigestingParser.DigesterFactory digesterFactory) {
        this.digesterFactory = digesterFactory;
    }

    public void setEmbeddedDocumentExtractorFactory(EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory) {
        this.embeddedDocumentExtractorFactory = embeddedDocumentExtractorFactory;
    }

    public void setMaximumCompressionRatio(long j) {
        this.maximumCompressionRatio = Long.valueOf(j);
    }

    public void setMaximumDepth(int i) {
        this.maximumDepth = Integer.valueOf(i);
    }

    public void setMaximumPackageEntryDepth(int i) {
        this.maximumPackageEntryDepth = Integer.valueOf(i);
    }

    public void setMetadataWriteFilterFactory(MetadataWriteFilterFactory metadataWriteFilterFactory) {
        this.metadataWriteFilterFactory = metadataWriteFilterFactory;
    }

    public void setOutputThreshold(long j) {
        this.outputThreshold = Long.valueOf(j);
    }

    public void setSpoolToDisk(long j) {
        this.spoolToDisk = Long.valueOf(j);
    }

    public void setThrowOnZeroBytes(boolean z) {
        this.throwOnZeroBytes = z;
    }

    public String toString() {
        return "AutoDetectParserConfig{spoolToDisk=" + this.spoolToDisk + ", outputThreshold=" + this.outputThreshold + ", maximumCompressionRatio=" + this.maximumCompressionRatio + ", maximumDepth=" + this.maximumDepth + ", maximumPackageEntryDepth=" + this.maximumPackageEntryDepth + ", metadataWriteFilterFactory=" + String.valueOf(this.metadataWriteFilterFactory) + ", embeddedDocumentExtractorFactory=" + String.valueOf(this.embeddedDocumentExtractorFactory) + ", contentHandlerDecoratorFactory=" + String.valueOf(this.contentHandlerDecoratorFactory) + ", digesterFactory=" + String.valueOf(this.digesterFactory) + ", throwOnZeroBytes=" + this.throwOnZeroBytes + "}";
    }

    public AutoDetectParserConfig() {
        this.spoolToDisk = null;
        this.outputThreshold = null;
        this.maximumCompressionRatio = null;
        this.maximumDepth = null;
        this.maximumPackageEntryDepth = null;
        this.metadataWriteFilterFactory = null;
        this.embeddedDocumentExtractorFactory = null;
        this.contentHandlerDecoratorFactory = NOOP_CONTENT_HANDLER_DECORATOR_FACTORY;
        this.digesterFactory = null;
        this.throwOnZeroBytes = true;
    }
}
