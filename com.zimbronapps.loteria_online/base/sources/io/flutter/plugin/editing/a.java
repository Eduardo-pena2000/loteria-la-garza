package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public final FlutterJNI a;

    public a(FlutterJNI flutterJNI) {
        this.a = flutterJNI;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137 A[PHI: r2 r4
      0x0137: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:58:0x00b9, B:66:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:58:0x00b9, B:66:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.CharSequence r10, int r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.a.a(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0149 A[PHI: r2 r4
      0x0149: PHI (r2v6 int) = (r2v3 int), (r2v8 int) binds: [B:72:0x0117, B:74:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:72:0x0117, B:74:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.a.b(java.lang.CharSequence, int):int");
    }

    public boolean c(int i) {
        return this.a.isCodePointEmoji(i);
    }

    public boolean d(int i) {
        return this.a.isCodePointEmojiModifier(i);
    }

    public boolean e(int i) {
        return this.a.isCodePointEmojiModifierBase(i);
    }

    public boolean f(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    public boolean g(int i) {
        return this.a.isCodePointRegionalIndicator(i);
    }

    public boolean h(int i) {
        return 917536 <= i && i <= 917630;
    }

    public boolean i(int i) {
        return this.a.isCodePointVariantSelector(i);
    }
}
