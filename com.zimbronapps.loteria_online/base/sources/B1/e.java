package b1;

import java.text.BreakIterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends b {
    public final CharSequence a;
    public final BreakIterator b;

    public e(CharSequence charSequence) {
        this.a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    public int e(int i) {
        return this.b.following(i);
    }

    public int f(int i) {
        return this.b.preceding(i);
    }
}
