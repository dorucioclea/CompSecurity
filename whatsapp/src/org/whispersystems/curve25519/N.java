// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


public class N
{

    public static void a(int ai[], int ai1[], int ai2[])
    {
        int i = ai1[0];
        int j = ai1[1];
        int k = ai1[2];
        int l = ai1[3];
        int i1 = ai1[4];
        int j1 = ai1[5];
        int k1 = ai1[6];
        int l1 = ai1[7];
        int i2 = ai1[8];
        int j2 = ai1[9];
        int k2 = ai2[0];
        int l2 = ai2[1];
        int i3 = ai2[2];
        int j3 = ai2[3];
        int k3 = ai2[4];
        int l3 = ai2[5];
        int i4 = ai2[6];
        int j4 = ai2[7];
        int k4 = ai2[8];
        int l4 = ai2[9];
        int i5 = i3 * 19;
        int j5 = j3 * 19;
        int k5 = k3 * 19;
        int l5 = l3 * 19;
        int i6 = i4 * 19;
        int j6 = j4 * 19;
        int k6 = k4 * 19;
        int l6 = l4 * 19;
        int i7 = j * 2;
        int j7 = l * 2;
        int k7 = j1 * 2;
        int l7 = l1 * 2;
        int i8 = j2 * 2;
        long l168 = i;
        long l189 = k2;
        long l148 = i;
        long l149 = l2;
        long l108 = i;
        long l109 = i3;
        long l68 = i;
        long l69 = j3;
        long l169 = i;
        long l170 = k3;
        long l128 = i;
        long l129 = l3;
        long l88 = i;
        long l89 = i4;
        long l48 = i;
        long l49 = j4;
        long l28 = i;
        long l29 = k4;
        long l8 = i;
        long l9 = l4;
        long l150 = j;
        long l151 = k2;
        long l110 = i7;
        long l111 = l2;
        long l70 = j;
        long l71 = i3;
        long l171 = i7;
        long l172 = j3;
        long l130 = j;
        long l131 = k3;
        long l90 = i7;
        long l91 = l3;
        long l50 = j;
        long l51 = i4;
        long l30 = i7;
        long l31 = j4;
        long l10 = j;
        long l11 = k4;
        long l190 = i7;
        long l191 = l6;
        long l112 = k;
        long l113 = k2;
        long l72 = k;
        long l73 = l2;
        long l173 = k;
        long l174 = i3;
        long l132 = k;
        long l133 = j3;
        long l92 = k;
        long l93 = k3;
        long l52 = k;
        long l53 = l3;
        long l32 = k;
        long l33 = i4;
        long l12 = k;
        long l13 = j4;
        long l192 = k;
        long l193 = k6;
        long l152 = k;
        long l153 = l6;
        long l74 = l;
        long l75 = k2;
        long l175 = j7;
        long l176 = l2;
        long l134 = l;
        long l135 = i3;
        long l94 = j7;
        long l95 = j3;
        long l54 = l;
        long l55 = k3;
        long l34 = j7;
        long l35 = l3;
        long l14 = l;
        long l15 = i4;
        long l194 = j7;
        long l195 = j6;
        long l154 = l;
        long l155 = k6;
        long l114 = j7;
        long l115 = l6;
        long l177 = i1;
        long l178 = k2;
        long l136 = i1;
        long l137 = l2;
        long l96 = i1;
        long l97 = i3;
        long l56 = i1;
        long l57 = j3;
        long l36 = i1;
        long l37 = k3;
        long l16 = i1;
        long l17 = l3;
        long l196 = i1;
        long l197 = i6;
        long l156 = i1;
        long l157 = j6;
        long l116 = i1;
        long l117 = k6;
        long l76 = i1;
        long l77 = l6;
        long l138 = j1;
        long l139 = k2;
        long l98 = k7;
        long l99 = l2;
        long l58 = j1;
        long l59 = i3;
        long l38 = k7;
        long l39 = j3;
        long l18 = j1;
        long l19 = k3;
        long l198 = k7;
        long l199 = l5;
        long l158 = j1;
        long l159 = i6;
        long l118 = k7;
        long l119 = j6;
        long l78 = j1;
        long l79 = k6;
        long l179 = k7;
        long l180 = l6;
        long l100 = k1;
        long l101 = k2;
        long l60 = k1;
        long l61 = l2;
        long l40 = k1;
        long l41 = i3;
        long l20 = k1;
        long l21 = j3;
        long l200 = k1;
        long l201 = k5;
        long l160 = k1;
        long l161 = l5;
        long l120 = k1;
        long l121 = i6;
        long l80 = k1;
        long l81 = j6;
        long l181 = k1;
        long l182 = k6;
        long l140 = k1;
        long l141 = l6;
        long l62 = l1;
        long l63 = k2;
        long l42 = l7;
        long l43 = l2;
        long l22 = l1;
        long l23 = i3;
        long l202 = l7;
        long l203 = j5;
        long l162 = l1;
        long l163 = k5;
        long l122 = l7;
        long l123 = l5;
        long l82 = l1;
        long l83 = i6;
        long l183 = l7;
        long l184 = j6;
        long l142 = l1;
        long l143 = k6;
        long l102 = l7;
        long l103 = l6;
        long l44 = i2;
        long l45 = k2;
        long l24 = i2;
        long l25 = l2;
        long l204 = i2;
        long l205 = i5;
        long l164 = i2;
        long l165 = j5;
        long l124 = i2;
        long l125 = k5;
        long l84 = i2;
        long l85 = l5;
        long l185 = i2;
        long l186 = i6;
        long l144 = i2;
        long l145 = j6;
        long l104 = i2;
        long l105 = k6;
        long l64 = i2;
        long l65 = l6;
        long l26 = j2;
        long l27 = k2;
        long l206 = i8;
        long l207 = l2 * 19;
        long l166 = j2;
        long l167 = i5;
        long l126 = i8;
        long l127 = j5;
        long l86 = j2;
        long l87 = k5;
        long l187 = i8;
        long l188 = l5;
        long l146 = j2;
        long l147 = i6;
        long l106 = i8;
        long l107 = j6;
        long l66 = j2;
        long l67 = k6;
        long l46 = i8;
        long l47 = l6;
        l168 = l190 * l191 + l168 * l189 + l192 * l193 + l194 * l195 + l196 * l197 + l198 * l199 + l200 * l201 + l202 * l203 + l204 * l205 + l206 * l207;
        l170 = l169 * l170 + l171 * l172 + l173 * l174 + l175 * l176 + l177 * l178 + l179 * l180 + l181 * l182 + l183 * l184 + l185 * l186 + l187 * l188;
        l169 = 0x2000000L + l168 >> 26;
        l148 = l154 * l155 + (l148 * l149 + l150 * l151 + l152 * l153) + l156 * l157 + l158 * l159 + l160 * l161 + l162 * l163 + l164 * l165 + l167 * l166 + l169;
        l149 = 0x2000000L + l170 >> 26;
        l128 = l142 * l143 + (l128 * l129 + l130 * l131 + l132 * l133 + l134 * l135 + l136 * l137 + l138 * l139 + l140 * l141) + l144 * l145 + l147 * l146 + l149;
        l129 = 0x1000000L + l148 >> 25;
        l108 = l108 * l109 + l110 * l111 + l112 * l113 + l114 * l115 + l116 * l117 + l118 * l119 + l120 * l121 + l122 * l123 + l124 * l125 + l126 * l127 + l129;
        l109 = 0x1000000L + l128 >> 25;
        l88 = l88 * l89 + l90 * l91 + l92 * l93 + l94 * l95 + l96 * l97 + l98 * l99 + l100 * l101 + l102 * l103 + l104 * l105 + l106 * l107 + l109;
        l89 = 0x2000000L + l108 >> 26;
        l68 = l78 * l79 + (l68 * l69 + l70 * l71 + l72 * l73 + l74 * l75 + l76 * l77) + l80 * l81 + l82 * l83 + l84 * l85 + l87 * l86 + l89;
        l69 = 0x2000000L + l88 >> 26;
        l48 = l66 * l67 + (l48 * l49 + l50 * l51 + l52 * l53 + l54 * l55 + l56 * l57 + l58 * l59 + l60 * l61 + l62 * l63 + l64 * l65) + l69;
        l49 = 0x1000000L + l68 >> 25;
        l50 = (l170 - (l149 << 26)) + l49;
        l51 = 0x1000000L + l48 >> 25;
        l28 = l46 * l47 + (l28 * l29 + l30 * l31 + l32 * l33 + l34 * l35 + l36 * l37 + l38 * l39 + l40 * l41 + l42 * l43 + l44 * l45) + l51;
        l29 = 0x2000000L + l50 >> 26;
        l30 = 0x2000000L + l28 >> 26;
        l8 = l10 * l11 + l8 * l9 + l12 * l13 + l15 * l14 + l16 * l17 + l19 * l18 + l20 * l21 + l23 * l22 + l24 * l25 + l27 * l26 + l30;
        l9 = 0x1000000L + l8 >> 25;
        l10 = (l168 - (l169 << 26)) + 19L * l9;
        l11 = 0x2000000L + l10 >> 26;
        ai[0] = (int)(l10 - (l11 << 26));
        ai[1] = (int)((l148 - (l129 << 25)) + l11);
        ai[2] = (int)(l108 - (l89 << 26));
        ai[3] = (int)(l68 - (l49 << 25));
        ai[4] = (int)(l50 - (l29 << 26));
        ai[5] = (int)((l128 - (l109 << 25)) + l29);
        ai[6] = (int)(l88 - (l69 << 26));
        ai[7] = (int)(l48 - (l51 << 25));
        ai[8] = (int)(l28 - (l30 << 26));
        ai[9] = (int)(l8 - (l9 << 25));
    }
}
