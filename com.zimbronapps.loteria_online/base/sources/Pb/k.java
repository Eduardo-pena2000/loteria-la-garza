package Pb;

import Sb.v;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class k extends Ub.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Sb.k a;
    public final Pattern b;
    public boolean c;
    public Pb.a d;

    public static class b extends Ub.b {
        public Ub.f a(Ub.h hVar, Ub.g gVar) {
            int e = hVar.e();
            CharSequence a = hVar.c().a();
            if (hVar.d() < 4 && a.charAt(e) == '<') {
                for (int i = 1; i <= 7; i++) {
                    if (i != 7 || (!(gVar.a().f() instanceof v) && !hVar.f().e())) {
                        Pattern pattern = k.j()[i][0];
                        Pattern pattern2 = k.j()[i][1];
                        if (pattern.matcher(a.subSequence(e, a.length())).find()) {
                            return Ub.f.d(new k(pattern2, null)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return Ub.f.c();
        }
    }

    public /* synthetic */ k(Pattern pattern, a aVar) {
        this(pattern);
    }

    public static /* synthetic */ Pattern[][] j() {
        return e;
    }

    public Ub.c c(Ub.h hVar) {
        return this.c ? Ub.c.d() : (hVar.a() && this.b == null) ? Ub.c.d() : Ub.c.b(hVar.getIndex());
    }

    public Sb.a f() {
        return this.a;
    }

    public void g() {
        this.a.o(this.d.b());
        this.d = null;
    }

    public void h(Tb.f fVar) {
        this.d.a(fVar.a());
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(fVar.a()).find()) {
            return;
        }
        this.c = true;
    }

    public k(Pattern pattern) {
        this.a = new Sb.k();
        this.c = false;
        this.d = new Pb.a();
        this.b = pattern;
    }
}
