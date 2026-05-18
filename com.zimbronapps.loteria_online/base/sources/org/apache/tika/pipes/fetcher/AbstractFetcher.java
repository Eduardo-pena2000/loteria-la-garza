package org.apache.tika.pipes.fetcher;

import org.apache.tika.config.Field;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AbstractFetcher implements Fetcher {
    private String name;

    public AbstractFetcher() {
    }

    public String getName() {
        return this.name;
    }

    @Field
    public void setName(String str) {
        this.name = str;
    }

    public AbstractFetcher(String str) {
        this.name = str;
    }
}
