package com.revenuecat.purchases.models;

import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import qb.k;
import rb.c;
import rb.d;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PriceSerializer implements b {
    private static final int AMOUNT_MICROS_INDEX = 1;
    private static final int CURRENCY_CODE_INDEX = 2;
    private static final int FORMATTED_INDEX = 0;
    public static final PriceSerializer INSTANCE = new PriceSerializer();
    private static final e descriptor = k.c("Price", new e[0], PriceSerializer$descriptor$1.INSTANCE);

    private PriceSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public Price deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        String str = "";
        long j = 0;
        String str2 = "";
        while (true) {
            PriceSerializer priceSerializer = INSTANCE;
            int v = b.v(priceSerializer.getDescriptor());
            if (v == -1) {
                Price price = new Price(str, j, str2);
                b.c(descriptor2);
                return price;
            }
            if (v == 0) {
                str = b.o(priceSerializer.getDescriptor(), 0);
            } else if (v == 1) {
                j = b.F(priceSerializer.getDescriptor(), 1);
            } else {
                if (v != 2) {
                    throw new IllegalStateException(("Unexpected index: " + v).toString());
                }
                str2 = b.o(priceSerializer.getDescriptor(), 2);
            }
        }
    }

    public void serialize(f fVar, Price price) {
        t.g(fVar, "encoder");
        t.g(price, "value");
        e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PriceSerializer priceSerializer = INSTANCE;
        b.v(priceSerializer.getDescriptor(), 0, price.getFormatted());
        b.o(priceSerializer.getDescriptor(), 1, price.getAmountMicros());
        b.v(priceSerializer.getDescriptor(), 2, price.getCurrencyCode());
        b.c(descriptor2);
    }
}
