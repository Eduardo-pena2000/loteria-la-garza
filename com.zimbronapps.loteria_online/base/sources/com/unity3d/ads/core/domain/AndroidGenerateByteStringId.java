package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    public ByteString invoke() {
        UUID randomUUID = UUID.randomUUID();
        t.f(randomUUID, "randomUUID()");
        return ProtobufExtensionsKt.toByteString(randomUUID);
    }
}
