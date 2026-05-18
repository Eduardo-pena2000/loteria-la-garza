package com.unity3d.ads.core.domain;

import android.os.SystemClock;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetSharedDataTimestamps implements GetSharedDataTimestamps {
    public TimestampsOuterClass.Timestamps invoke() {
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder newBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TimestampsKt.Dsl _create = companion._create(newBuilder);
        _create.setTimestamp(TimestampExtensionsKt.fromMillis(System.currentTimeMillis()));
        _create.setSessionTimestamp(SystemClock.elapsedRealtime() - SdkProperties.getInitializationTime());
        return _create._build();
    }
}
