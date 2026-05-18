package androidx.media;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(s4.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aVar.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = aVar.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = aVar.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = aVar.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, s4.a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.a, 1);
        aVar.F(audioAttributesImplBase.b, 2);
        aVar.F(audioAttributesImplBase.c, 3);
        aVar.F(audioAttributesImplBase.d, 4);
    }
}
