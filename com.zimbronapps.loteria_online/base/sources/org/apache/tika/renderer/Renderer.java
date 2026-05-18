package org.apache.tika.renderer;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Renderer extends Serializable {
    Set getSupportedTypes(ParseContext parseContext);

    RenderResults render(InputStream inputStream, Metadata metadata, ParseContext parseContext, RenderRequest... renderRequestArr) throws IOException, TikaException;
}
