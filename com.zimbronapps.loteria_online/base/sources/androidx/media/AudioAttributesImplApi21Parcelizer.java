package androidx.media;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(s4.a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = aVar.r(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = aVar.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, s4.a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi21.a, 1);
        aVar.F(audioAttributesImplApi21.b, 2);
    }
}
