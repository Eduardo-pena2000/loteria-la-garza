package org.apache.tika.pipes.emitter;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AbstractEmitter implements Emitter {
    private String name;

    public void emit(List list) throws IOException, TikaEmitterException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EmitData emitData = (EmitData) it.next();
            emit(emitData.getEmitKey().getEmitKey(), emitData.getMetadataList(), emitData.getParseContext());
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
