package com.revenuecat.purchases.paywalls.components;

import kotlin.jvm.internal.t;
import ob.b;
import ob.j;
import qb.d;
import qb.e;
import qb.k;
import rb.f;
import tb.E;
import tb.h;
import tb.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class FontSizeSerializer implements b {
    public static final FontSizeSerializer INSTANCE = new FontSizeSerializer();
    private static final e descriptor = k.b("FontSize", d.f.a);

    private FontSizeSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize(fVar, ((Number) obj).intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Integer deserialize(rb.e eVar) {
        int k;
        t.g(eVar, "decoder");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar == null) {
            throw new j("Expected font_size to be part of a JSON object");
        }
        i i = hVar.i();
        E e = i instanceof E ? (E) i : null;
        if (e == null) {
            throw new j("Expected font_size to be a JsonPrimitive");
        }
        if (e.b()) {
            String a = e.a();
            switch (a.hashCode()) {
                case -1383701233:
                    if (a.equals("body_l")) {
                        k = 17;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case -1383701232:
                    if (a.equals("body_m")) {
                        k = 15;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case -1383701226:
                    if (a.equals("body_s")) {
                        k = 13;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case -209710737:
                    if (a.equals("heading_l")) {
                        k = 28;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case -209710736:
                    if (a.equals("heading_m")) {
                        k = 24;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case -209710730:
                    if (a.equals("heading_s")) {
                        k = 20;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case 54935217:
                    if (a.equals("body_xl")) {
                        k = 18;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case 331460015:
                    if (a.equals("heading_xxl")) {
                        k = 40;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case 2088902225:
                    if (a.equals("heading_xl")) {
                        k = 34;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                case 2088902232:
                    if (a.equals("heading_xs")) {
                        k = 16;
                        break;
                    }
                    throw new j("Unknown font size name: " + a);
                default:
                    throw new j("Unknown font size name: " + a);
            }
        }
        k = tb.j.k(e);
        return Integer.valueOf(k);
    }

    public void serialize(f fVar, int i) {
        t.g(fVar, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
