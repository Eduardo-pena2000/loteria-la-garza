package org.apache.tika.sax;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.filter.NoOpFilter;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RecursiveParserWrapperHandler extends AbstractRecursiveParserWrapperHandler {
    private final MetadataFilter metadataFilter;
    protected final List metadataList;

    public RecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory) {
        this(contentHandlerFactory, -1, NoOpFilter.NOOP_FILTER);
    }

    private void writeFinalEmbeddedPaths() {
        HashMap hashMap = new HashMap();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (Metadata metadata : this.metadataList) {
            String str = metadata.get(TikaCoreProperties.EMBEDDED_ID);
            if (str != null) {
                hashMap.put(str, RecursiveParserWrapper.getResourceName(metadata, atomicInteger));
            }
        }
        for (Metadata metadata2 : this.metadataList) {
            String str2 = metadata2.get(TikaCoreProperties.EMBEDDED_ID_PATH);
            if (str2 != null) {
                if (str2.startsWith("/")) {
                    str2 = str2.substring(1);
                }
                String[] split = str2.split("/");
                StringBuilder sb = new StringBuilder();
                for (String str3 : split) {
                    sb.append("/");
                    sb.append((String) hashMap.get(str3));
                }
                metadata2.set(TikaCoreProperties.FINAL_EMBEDDED_RESOURCE_PATH, sb.toString());
            }
        }
    }

    public void addContent(ContentHandler contentHandler, Metadata metadata) {
        String obj;
        if (contentHandler.getClass().equals(DefaultHandler.class) || (obj = contentHandler.toString()) == null || org.apache.tika.config.b.a(obj)) {
            return;
        }
        metadata.add(TikaCoreProperties.TIKA_CONTENT, obj);
        metadata.add(TikaCoreProperties.TIKA_CONTENT_HANDLER, contentHandler.getClass().getSimpleName());
    }

    public void endDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        super.endDocument(contentHandler, metadata);
        addContent(contentHandler, metadata);
        try {
            this.metadataFilter.filter(metadata);
            if (metadata.size() > 0) {
                this.metadataList.add(0, ParserUtils.cloneMetadata(metadata));
            }
            writeFinalEmbeddedPaths();
        } catch (TikaException e) {
            throw new SAXException(e);
        }
    }

    public void endEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        super.endEmbeddedDocument(contentHandler, metadata);
        addContent(contentHandler, metadata);
        try {
            this.metadataFilter.filter(metadata);
            if (metadata.size() > 0) {
                this.metadataList.add(ParserUtils.cloneMetadata(metadata));
            }
        } catch (TikaException e) {
            throw new SAXException(e);
        }
    }

    public List getMetadataList() {
        return this.metadataList;
    }

    public void startEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        super.startEmbeddedDocument(contentHandler, metadata);
    }

    public RecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory, int i) {
        this(contentHandlerFactory, i, NoOpFilter.NOOP_FILTER);
    }

    public RecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory, int i, MetadataFilter metadataFilter) {
        super(contentHandlerFactory, i);
        this.metadataList = new LinkedList();
        this.metadataFilter = metadataFilter;
    }
}
