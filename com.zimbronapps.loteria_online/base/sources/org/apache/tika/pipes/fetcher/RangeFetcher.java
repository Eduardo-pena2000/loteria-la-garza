package org.apache.tika.pipes.fetcher;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface RangeFetcher extends Fetcher {
    default InputStream fetch(String str, long j, long j2, Metadata metadata) throws TikaException, IOException {
        return fetch(str, j, j2, metadata, new ParseContext());
    }

    InputStream fetch(String str, long j, long j2, Metadata metadata, ParseContext parseContext) throws TikaException, IOException;
}
