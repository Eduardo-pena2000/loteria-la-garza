package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    void A(int i, List list, boolean z);

    void B(int i, float f);

    void C(int i);

    void D(int i, List list, boolean z);

    void E(int i, int i2);

    void F(int i, List list, boolean z);

    void G(int i, List list, boolean z);

    void H(int i, int i2);

    void I(int i, List list);

    void J(int i, List list, N n);

    void K(int i, Object obj, N n);

    void L(int i, ByteString byteString);

    void M(int i, List list, N n);

    void N(int i, Object obj, N n);

    void O(int i, Object obj);

    void P(int i, MapEntryLite.b bVar, Map map);

    void a(int i, List list, boolean z);

    void b(int i, Object obj);

    void c(int i, int i2);

    void d(int i, List list);

    void e(int i, String str);

    void f(int i, long j);

    void g(int i, List list, boolean z);

    void h(int i, int i2);

    void i(int i, long j);

    void j(int i, List list, boolean z);

    void k(int i, List list, boolean z);

    void l(int i, List list, boolean z);

    void m(int i, long j);

    void n(int i, List list, boolean z);

    void o(int i, int i2);

    void p(int i, double d);

    void q(int i, List list, boolean z);

    void r(int i, List list, boolean z);

    void s(int i, long j);

    FieldOrder t();

    void u(int i, long j);

    void v(int i, boolean z);

    void w(int i, int i2);

    void x(int i);

    void y(int i, List list, boolean z);

    void z(int i, List list, boolean z);
}
