package org.apache.tika.pipes.emitter;

import java.io.IOException;
import java.util.List;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Emitter {
    void emit(String str, List list, ParseContext parseContext) throws IOException, TikaEmitterException;

    void emit(List list) throws IOException, TikaEmitterException;

    String getName();
}
