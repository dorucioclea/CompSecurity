.class public Lcom/facebook/widget/c/c;
.super Landroid/preference/CheckBoxPreference;
.source "OrcaCheckBoxPreference.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 22
    invoke-direct {p0, p1}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 23
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 24
    new-instance v1, Lcom/facebook/prefs/shared/b;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    invoke-direct {v1, p0, v0}, Lcom/facebook/prefs/shared/b;-><init>(Landroid/preference/Preference;Lcom/facebook/prefs/shared/d;)V

    iput-object v1, p0, Lcom/facebook/widget/c/c;->a:Lcom/facebook/prefs/shared/b;

    .line 25
    return-void
.end method


# virtual methods
.method protected getPersistedBoolean(Z)Z
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/widget/c/c;->a:Lcom/facebook/prefs/shared/b;

    invoke-virtual {v0, p1}, Lcom/facebook/prefs/shared/b;->a(Z)Z

    move-result v0

    return v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/widget/c/c;->a:Lcom/facebook/prefs/shared/b;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method protected persistBoolean(Z)Z
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/widget/c/c;->a:Lcom/facebook/prefs/shared/b;

    invoke-virtual {v0, p1}, Lcom/facebook/prefs/shared/b;->b(Z)Z

    move-result v0

    return v0
.end method
