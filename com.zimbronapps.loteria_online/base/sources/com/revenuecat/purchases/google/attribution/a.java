package com.revenuecat.purchases.google.attribution;

import Qa.l;
import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ GoogleDeviceIdentifiersFetcher a;
    public final /* synthetic */ Application b;
    public final /* synthetic */ l c;

    public /* synthetic */ a(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, l lVar) {
        this.a = googleDeviceIdentifiersFetcher;
        this.b = application;
        this.c = lVar;
    }

    public final void run() {
        GoogleDeviceIdentifiersFetcher.a(this.a, this.b, this.c);
    }
}
