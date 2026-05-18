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
public class SupplementingParser extends AbstractMultipleParser {
    public static final List allowedPolicies = Arrays.asList(new AbstractMultipleParser.MetadataPolicy[]{AbstractMultipleParser.MetadataPolicy.FIRST_WINS, AbstractMultipleParser.MetadataPolicy.LAST_WINS, AbstractMultipleParser.MetadataPolicy.KEEP_ALL});
    private static final long serialVersionUID = 313179254565350994L;

    public SupplementingParser(MediaTypeRegistry mediaTypeRegistry, Collection collection, Map map) {
        super(mediaTypeRegistry, collection, map);
    }

    public boolean parserCompleted(Parser parser, Metadata metadata, ContentHandler contentHandler, ParseContext parseContext, Exception exc) {
        return true;
    }

    public SupplementingParser(MediaTypeRegistry mediaTypeRegistry, AbstractMultipleParser.MetadataPolicy metadataPolicy, Parser... parserArr) {
        this(mediaTypeRegistry, metadataPolicy, (Collection) Arrays.asList(parserArr));
    }

    public SupplementingParser(MediaTypeRegistry mediaTypeRegistry, AbstractMultipleParser.MetadataPolicy metadataPolicy, Collection collection) {
        super(mediaTypeRegistry, metadataPolicy, collection);
        if (allowedPolicies.contains(metadataPolicy)) {
            return;
        }
        throw new IllegalArgumentException("Unsupported policy for SupplementingParser: " + String.valueOf(metadataPolicy));
    }
}
