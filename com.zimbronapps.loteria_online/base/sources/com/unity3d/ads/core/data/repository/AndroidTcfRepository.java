package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidTcfRepository implements TcfRepository {
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(TcfDataSource tcfDataSource) {
        t.g(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}
