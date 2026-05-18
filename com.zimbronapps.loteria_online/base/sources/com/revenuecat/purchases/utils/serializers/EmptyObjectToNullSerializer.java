package com.revenuecat.purchases.utils.serializers;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import ob.j;
import qb.e;
import rb.f;
import tb.C;
import tb.h;
import tb.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class EmptyObjectToNullSerializer implements b {
    private final b delegate;
    private final e descriptor;
    private final boolean resilient;

    public EmptyObjectToNullSerializer(b delegate, boolean z) {
        t.g(delegate, "delegate");
        this.delegate = delegate;
        this.resilient = z;
        this.descriptor = delegate.getDescriptor();
    }

    public Object deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            return this.delegate.deserialize(decoder);
        }
        i i = hVar.i();
        if (!(i instanceof C) || ((C) i).isEmpty()) {
            return null;
        }
        if (!this.resilient) {
            return hVar.d().c(this.delegate, i);
        }
        try {
            return hVar.d().c(this.delegate, i);
        } catch (j unused) {
            return null;
        }
    }

    public e getDescriptor() {
        return this.descriptor;
    }

    public void serialize(f encoder, Object obj) {
        t.g(encoder, "encoder");
        if (obj != null) {
            this.delegate.serialize(encoder, obj);
        }
    }

    public /* synthetic */ EmptyObjectToNullSerializer(b bVar, boolean z, int i, k kVar) {
        this(bVar, (i & 2) != 0 ? true : z);
    }
}
