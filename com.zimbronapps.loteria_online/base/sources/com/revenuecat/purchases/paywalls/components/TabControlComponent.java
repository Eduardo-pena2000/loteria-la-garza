package com.revenuecat.purchases.paywalls.components;

import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.u;
import ob.b;
import sb.c0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TabControlComponent implements PaywallComponent {
    public static final TabControlComponent INSTANCE = new TabControlComponent();
    private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final b invoke() {
            return new c0("tab_control", TabControlComponent.INSTANCE, new Annotation[0]);
        }
    }

    private TabControlComponent() {
    }

    private final /* synthetic */ b get$cachedSerializer() {
        return (b) $cachedSerializer$delegate.getValue();
    }

    public final b serializer() {
        return get$cachedSerializer();
    }
}
