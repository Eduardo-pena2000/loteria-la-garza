package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.misc.IJsonStorageReader;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NonBehavioralFlagReader {
    private final IJsonStorageReader jsonStorageReader;

    public NonBehavioralFlagReader(IJsonStorageReader jsonStorageReader) {
        t.g(jsonStorageReader, "jsonStorageReader");
        this.jsonStorageReader = jsonStorageReader;
    }

    public NonBehavioralFlag getUserNonBehavioralFlag() {
        Object obj = this.jsonStorageReader.get("user.nonbehavioral.value");
        if (obj == null) {
            obj = this.jsonStorageReader.get("user.nonBehavioral.value");
        }
        return NonBehavioralFlag.Companion.fromString(String.valueOf(obj));
    }
}
