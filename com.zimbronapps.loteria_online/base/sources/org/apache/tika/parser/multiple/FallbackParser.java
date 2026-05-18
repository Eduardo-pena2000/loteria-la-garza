package org.apache.tika.parser.multiple;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.xml.sax.ContentHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FallbackParser extends AbstractMultipleParser {
    public static final List allowedPolicies = Arrays.asList(AbstractMultipleParser.MetadataPolicy.values());
    private static final long serialVersionUID = 5844409020977206167L;

    public FallbackParser(MediaTypeRegistry mediaTypeRegistry, Collection collection, Map map) {
        super(mediaTypeRegistry, collection, map);
    }

    public boolean parserCompleted(Parser parser, Metadata metadata, ContentHandler contentHandler, ParseContext parseContext, Exception exc) {
        return exc != null;
    }

    public FallbackParser(MediaTypeRegistry mediaTypeRegistry, AbstractMultipleParser.MetadataPolicy metadataPolicy, Collection collection) {
        super(mediaTypeRegistry, metadataPolicy, collection);
    }

    public FallbackParser(MediaTypeRegistry mediaTypeRegistry, AbstractMultipleParser.MetadataPolicy metadataPolicy, Parser... parserArr) {
        super(mediaTypeRegistry, metadataPolicy, parserArr);
    }
}
